# Java内存区域与内存溢出异常 #

## 概述 ##

**内存泄露 Memory Leak**

**内存溢出 Out Of Memory**

有JVM存在，无需为每个new操作写配对的delete/free代码，不易出现 **Out Of Memory** 或 **Memory Leak**。但是，愿望是美好的，该出现的问题还是会出现，了解JVM如何使用内存有助于解决问题。

>A memory leak in Java is when objects you aren't using cannot be garbage collected because you still have a reference to them somewhere.

>An OutOfMemoryError is thrown when there is no memory left to allocate new objects. This is usually caused by a memory leak, but can also happen if you're just trying to hold too much data in memory at once.

>——[What is the difference between an OutOfMemoryError and a memory leak](https://stackoverflow.com/a/4943570)

## 运行时数据区域 ##

![JVM运行时数据区](image/JVM-data-area.png)

### 程序计数器 ###

**Program Counter Register PCR** 是一块较小的内存空间，可看作**当前线程所执行的字节码的行号指示器**。

在VM概念模型中，字节码解释器工作时就是通过改变PCR的值来选取下一条需要执行的字节码指令。

以下功能需要这个计数器来完成。

1. 分支
2. 循环
3. 跳转
4. 异常处理
5. 线程恢复
6. ...

---

由于JVM多线程是通过**线程轮流切换**并**分配处理器执行时间**的方式来实现的，在任何一个确定的时刻，一处理器（对于多核处理器来说是一个内核）都只会执行一条线程中的指令。（**一时刻一核一指令**）

因此，为了线程切换后能恢复到正确的执行位置，每条线程需要一个独立PCR，各条线程PCR互不影响，独立存储，这内存区域被称为“**线程私有**”。（**线程独立性**）

---

若线程正执行一个Java方法，这PCR记录**正在执行VM字节码指令的地址**；若正执行是Native方法，这PCR则为空Undefinded。

这内存区域是**唯一一个**在JVM规范没有规定任何**OutOfMemoryError OOME**情况的区域

## Java虚拟机栈 ##

**VM Stack**，线程私有，声明周期与线程相同。

VM Stack描述的Java方法执行的内存模型：每个方法在执行的同时会创建一个**栈帧Stack Frame**。

Stack Frame用于

1. 存储局部变量表
2. 操作数栈
3. 动态链接
4. 方法出口信息

**每一个方法从调用直至执行完成的过程，就对应着一个Stack Frame 在VM Stack中入栈到出栈的过程**。

---

粗糙说法，Java内存区分为

1. Heap 堆内存
2. Stack 栈内存 这里指 VMStack

Java内存区域划分实际上远比这复杂。

---

**局部变量表**存放

1. 编译期可知的各种**基本数据类型**（boolean/byte/char/short/int/float/double）
2. **对象引用** reference类型 它不等同于对象本身，可能是
	- 一个指向对象起始地址的**引用指针**
	- 一个代表对象的**句柄**或其他与此对象相关的位置
3. returnAddress类型（指向了一条字节码指令的地址）

---

64位的double/long类型数据会占用2个**局部变量空间Slot**，其余基本类型占1个。

局部变量表所需的内存空间**在编译期间完成分配**，当进入一个方法时，这方法需要在帧中分配多大的局部变量空间是**完全确定的**，在方法运行期间**不会**改变局部变量表的大小。

---

JVM规范中，这区域规定2种异常状况：
1. **StackOverflowError SOE**，当线程请求栈深度大于VM所允许深度时。
2. ** OutOfMemoryError OOME**，VM Stack可动态扩展（当前大部分JVM都可动态扩展，只不过JVM规范中允许固定程度的VM Stack），当扩展时无法申请到足够的内存。

---

### 本地方法栈 ###

**Native Method Stack NVS** 与 VM Stack作用相似，它们区别为
1. VM Stack为VM执行Java方法（也就是字节码）服务。
2. NVS则为VM使用到Native方法服务。

VM规范未强制规定

1. 对NVS中方法使用的**语言**
2. 使用方式与数据结构并没有强制规定。

不同VM各有发挥。

Sum HotSpot VM 直接把 VM Stack 和 NVS 合二为一。

会抛SOE和OOME异常。

### Java堆 ###

Java Heap ，线程共享

通常，Java堆是JVM所管理内存最大一块。

VM启动时创建。

**此内存区域的唯一目的就是存放对象实例，几乎所有对象实例在这里分配内存**。

JVM规范：所有对象实例以及数组都要在堆上分配。

但随着JIT编译器技术等发展，所有对象在堆上分配不是那么绝对。

---

Java堆是GC管理主要区域，因此也被称为GC堆（Garbage Collected Heap）

**从内存回收的角度看**，由于现在收集器基于**分代收集算法**，所以Java堆中可细分为：**新生代** 和 **老生代**；更细致的 Eden空间、From Survivor 空间、To Survivor空间等。

**从内存分配的角度来看**，线程共享的Java堆可划分多个线程私有的分配缓冲区（Thread Local Allocation Buffer，TLAB）

无论怎样划分，**目的始终是 更好回收内存，更快分配内存**。

---

通过-Xmx/-Xms控制扩展大小

若堆中没有内存完成实例分配，并且堆也无法再扩展时，将会抛出OOME


### 方法区 ###

Method Area 线程共享。

它用于存储已被VM加载的

1. 类型信息
2. 常量
3. 静态变量
4. 即时编译器编译后的代码等数据
5. 。。。

JVM规范 把 方法区描述为对的一个逻辑部分，但它别名叫做Non-Heap（非堆），目的与Java堆区分开。

---

大部分HotSpot VM开发者更愿意成**方法区**称为**永久代Permanent Generation**，

二者并不等价，只因HotSpot设计团队**选择把GC分代收集扩展至方法区**，或说使用**永久代**来实现方法区而已，这样HotSpot的GC可以像管理Java堆一样管理这部分内存，能够省去专门为方法区编写内存管理代码工作。

其他虚拟机BEA JRockit/IBM J9等不存在永久代的概念。

原则上，如何实现方法区属于VM实现细节，不受虚拟机规范结束，但使用永久代来实现方法区，现在看不是好主意，因为易于 **内存溢出** 问题（永久代有-XX:MaxPermSize的上限）

JDK1.7的HotSpot已把原在**永久代**的字符串常量池移出.

GC比较少在方法区内出现，但并非数据进入了方法区就如永久代的名字一样“永久”存在了，这区域的内存回收目标主要是**针对常量池的回收** 和 **对类型的卸载**。

---

当内存不满足，抛OOME

### 运行时常量池 ###

Runtime Constant Pool RCP是**方法区**的一部分

Class文件中除了有类的版本、字段、方法、接口等描述信息外，还有一项信息是**常量池Constant Pool Table**，用于存放编译期生成的各种**字面量**和**符号引用**，这部分内容将在类加载后进入方法区的RCP中存放。

---

JVM对Class文件每一部分的格式都有严格规定，每一字节用于存储那种数据都必须符合规范上的要求才会被VM认可、装载和执行。

但对于RCP，JVM规范没有做任何细节的要求，不同的提供商实现的虚拟机可以按照自己的需要实现区域。

通常，除了保存Class文件中描述的符号引用外，还会翻译出来的字节引用也存储在RCP中。

---

运行时常量池 相对于Class文件常量池 的另外一个重要特征是**具备动态性**。

Java语言并不要常量一定只有编译器才能产生，也就是并非预置如Class文件中常量池的内容才能进入方法区RCP，运行期间也可能将新的常量放入池中，如String类的intern()方法。

---

当内存不满足，抛OOME

### 直接内存 ###

Direct Memory 并不是虚拟机运行时数据区的一部分，也就是JVM规范中定义的内存区域。

这部分内存也频繁使用，而也可能导致OOME.

在JDK1.4中新加入了NIO类，引入一种基于**通道Channel**与**缓冲区Buffer**的IO方式，它可以使用Native函数库直接分配堆外内存，然后通过一个存储在Java堆中的DirectByteBuffer对象作为这块内存的引用进行操作。这样能在一些场景中显著提高性能，因为避免了在Java堆和Native堆中来回复制数据。

---

显然，Direct Memory分配不受Java 堆大小的限制，但是，既然是内存，肯定还是会受到本机总内存（包括RAM一级SWAP区或者分页文件）大小 以及 处理器寻址空间的限制。

服务器管理员在配置VM参数，会根据实际内存设置-Xms等参数信息，但经常忽略直接内存，使得各种内存区域总和大于**物理内存限制**，从而导致动态扩展时出现OOME.

## HotSpot虚拟机对象探秘 ##

对于细节问题，必须把讨论范围限定在具体的虚拟机和集中在某一个内存区域上才有意义。

### 对象的创建 ###

JVM创建一个普通对象（非数组或Class对象）过程大概可分4步。

#### 一 ####

VM遇到一条new指令时，首先将去检查这个指令的参数是否能在常量池中定位到一个类的符号引用，并且检查这个符号引用是否已被加载、解析和初始化过。

若没有，那必须先执行相应的类加载过程。

#### 二 ####

在类加载检查通过后，接下来VM将为新生对象分配内存。

对象所需内存的大小

#### 三 ####



#### 四 ####


### 对象的内存布局 ###

### 对象的访问定位 ###

## 实战：OutOfMerroyError ##

