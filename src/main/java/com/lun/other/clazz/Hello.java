package com.lun.other.clazz;

class A {

    static {
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }
}

class B extends A{

    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}

/**
 * 
 * 考察初始化顺序
 * 
 * @author 白居布衣
 *
 */
public class Hello {

    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }

}

/*
1a2b2b
*/
