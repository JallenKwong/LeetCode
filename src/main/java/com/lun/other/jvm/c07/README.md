# 虚拟机类加载机制 #


## 概述 ##

**虚拟机把描述类的数据从Class文件加载到内存，并对数据进行校验、转换解析和初始化，最终形成可以被虚拟机直接使用的Java类型，这就是虚拟机的类加载机制**。

与那些在编译时需要进行连接工作的语言不同，在Java语言里面，类型的加载、连接和初始化过程都是在程序运行期间完成的，这种策略虽然会令类加载时稍微**增加一些性能开销**，但是会为Java应用程序**提供高度的灵活性**，Java里天生可以**动态扩展的语言特性**就是依赖运行期动态加载和动态连接这个特点实现的。例如：

- 若编写一个面向接口的应用程序，可等到运行时再指定其实际的实现类。
- 用户可以通过 Java 预定义的和自定义类加载器，**让一个本地的应用程序可以在运行时从网络或其他地方加载一个二进制流作为程序代码的一部分**，这种组装应用程序的方式目前已广泛应用于Java程序之中。从最基础的Applet、JSP 到相对复杂的 OSGI 技术，都使用了Java语言运行期类加载的特性。

为了避免语言表达可能产生的偏差，先设定两个语言上的约定：

- 在实际情况中，每个Class文件都有可能代表着Java语言中的一个类或者接口，后文直接对“类”的描述都包括了类和接口的可能性，而对类和接口需要分开描述的场景会特别指明；
- 这里所指的“Class文件”是指的一串二进制字节流，无论以何种形式存在都可以。

## 类加载的时机 ##

类从被加载到虚拟机内存中开始，到卸载出内存为止，它的整个生命周期包括：

1. 加载（Loading）
2. 验证（Verification）
3. 准备（Preparation）
4. 解析（Resolution）
5. 初始化（Initialization）
6. 使用（Using）
7. 卸载（Unloading）

其中验证、准备、解析3个部分统称为连接（Linking），这7个阶段的发生顺序如下图所示。

![](image/lifecycle.png)

加载、验证、准备、初始化和卸载这5个阶段的顺序是确定的，类的加载过程必须按照这种顺序按部就班地开始。

而**解析阶段则不一定**：它在某些情况下可以在初始化阶段之后再开始，这是为了支持Java语言的运行时绑定（也称为动态绑定或晚期绑定）

**注意**！，这里说的是按部就班地“开始”，而不是按部就班地“进行”或“完成”，强调这点是因为这些阶段通常都是互相交叉地混合式进行的，通常会在一个阶段执行的过程中调用、激活另外一个阶段。

什么情况下需要开始类加载过程的第一个阶段：**加载**？Java虚拟机规范中并没有进行强制约束，这点可以交给虚拟机的具体实现来**自由把握**。但是对于**初始化阶段**，虚拟机规范则是严格规定了有且只有**5种**情况必须立即对类进行“**初始化**”（而加载、验证、准备自然需要在此之前开始）：

1. 遇到new、getstatic、putstatic或invokestatic这4条字节码指令时，如果类没有进行过初始化，则需要先触发其初始化。生成这4条指令的最常见的Java代码场景是：
	- 使用new关键字实例化对象的时候；
	- 读取或设置一个类的静态字段（被final修饰、已在编译期把结果放入常量池的静态字段除外）的时候；
	- 调用一个类的静态方法的时候。

2. 使用**java.lang.reflect包**的方法对类进行反射调用的时候，如果类没有进行过初始化，则需要先触发其初始化。

3. 当初始化一个类的时候，如果发现其**父类**还没有进行过初始化，则需要先触发其父类的初始化。

4. 当虚拟机启动时，用户需要指定一个**要执行的主类**（包含main()方法的那个类），虚拟机会先初始化这个主类。

5. 当使用JDK 1.7的动态语言支持时，如果一个java.lang.invoke.MethodHandle实例最后的解析结果REF_getStatic、REF_putStatic、REF_invokeStatic的方法句柄，并且这个方法句柄所对应的类没有进行过初始化，则需要先触发其初始化。

对于这5种会触发类进行初始化的场景，虚拟机规范中使用了一个很强烈的限定语：“有且只有”，这5种场景中的行为称为对一个类进行**主动引用**。

此之外，所有引用类的方式都不会触发初始化，称为**被动引用**。

举3个例子说明被动引用

### 被动引用例一 ###

	/**
	 * 被动使用类字段演示一：
	* 通过子类引用父类的静态字段，不会导致子类初始化
	 **/
	public class SuperClass {
	
		static {
			System.out.println("SuperClass init!");
		}
	
		public static int value = 123;
	}
	
	public class SubClass extends SuperClass {
	
		static {
			System.out.println("SubClass init!");
		}
	}
	
	/**
	 * 非主动使用类字段演示
	 **/
	public class NotInitialization {
	
		public static void main(String[] args) {
			System.out.println(SubClass.value);
		}
	
	}

[NotInitialization](NotInitialization.java)

上述代码运行之后，只会输出有“SuperClass init！”，而不会输出“SubClass init！”。

**对于静态字段，只有直接定义这个字段的类才会被初始化，因此通过其子类来引用父类中定义的静态字段，只会触发父类的初始化而不会触发子类的初始化**。

至于是否要触发子类的加载和验证，在虚拟机规范中并未明确规定，这点取决于虚拟机的具体实现。

### 被动引用例二 ###

	/**
	 * 被动使用类字段演示二：
	 * 通过数组定义来引用类，不会触发此类的初始化
	 **/
	public class NotInitialization2 {
	
		public static void main(String[] args) {
			SuperClass[] sca = new SuperClass[10];
		}
	
	}

[NotInitialization2](NotInitialization2.java)

上面代码运行之后发现没有输出“SuperClass init”，说明并没有触发类com.lun.other.jvm.c07.SuperClass的初始化阶段。但是这段代码里面触发了另外一个名为“Lcom.lun.other.jvm.c07.SuperClass”的类的初始化阶段，对于用户代码来说，这并不是一个合法的类名称，它是一个由虚拟机自动生成的、直接继承于java.lang.Object的子类，创建动作由字节码指令**newarray**触发。

这个类代表了一个元素类型为com.lun.other.jvm.c07.SuperClass的一维数组，数组中应有的属性和方法，用户可直接使用的只有被修饰为public的length属性和clone()方法）都实现在这个类里。

Java语言中对数组的访问比C/C++ **相对安全**是因为这个类封装了数组元素的访问方法，而C/C++ 直接翻译为对数组指针的移动。在Java中，当检查到发生数组越界就会跑出**java.lang.ArrayIndexOutOfBoundsExecption**异常。

### 被动引用例三 ###

	/**
	 * 被动使用类字段演示三：
	 * 常量在编译阶段会存入调用类的常量池中，本质上没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化。
	 **/
	public class ConstClass {
	
		static {
			System.out.println("ConstClass init!");
		}
	
		public static final String HELLOWORLD = "hello world";
	}
	
	/**
	 * 非主动使用类字段演示
	 **/
	public class NotInitialization3 {
	
		public static void main(String[] args) {
			System.out.println(ConstClass.HELLOWORLD);
		}
	}

[NotInitialization3](NotInitialization3.java)

上述代码运行之后，也没有输出“ConstClass init!”，这是因为虽然在Java源码中引用ConstClass类中的常量HELLOWORLD，但其实**在编译阶段通过常量传播优化**，已经将此常量"hello world"存储到了NotInitialization3的常量池中，以后NotInitialization3对常量ConstClass.HELLOWORLD的引用实际上被转化为NotInitialization3对自身常量池的引用了。

也就是说，实际上主类的Class文件之中并没有ConstClass类的符号引用入口，这两个类在编译成Class之后就不存在任何联系了。

### 接口的加载过程 ###

接口的加载过程与类加载过程稍有一些不同，针对接口需要做一些特殊说明：接口也有初始化过程，这点与类是一致的，上面的代码都是用静态语句块“static{}”来输出初始化信息的，而**接口中不能使用“static{}”语句块，但编译器仍然会为接口生成“<client&gt;()”类构造器**，用于初始化接口中所定义的成员变量。

接口与类真正有所区别的是前面讲述的5种“有且仅有”需要开始初始化场景中的第三种：当一个类在初始化时，要求其父类全部都已经初始化过了，但是一个接口在初始化时，并**不需要其父接口全部都完成初始化**，只有在真正使用到父接口的时候才会初始化。

