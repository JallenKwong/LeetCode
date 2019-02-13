package com.lun.other.jvm.c07;

public class ConstClass {
	static {
		System.out.println("ConstClass init!");
	}

	public static final String HELLOWORLD = "hello world";
}
