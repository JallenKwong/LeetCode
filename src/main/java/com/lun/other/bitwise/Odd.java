package com.lun.other.bitwise;

public class Odd {

	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}
	public static boolean isOdd2(int num) {
		return (num & 1) == 1;
	}
	
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(3));//11
		System.out.println(Integer.toBinaryString(2));//10
		System.out.println(Integer.toBinaryString(1));//1
		System.out.println(Integer.toBinaryString(0));//0
		System.out.println(Integer.toBinaryString(-1));//11111111111111111111111111111111
		System.out.println(Integer.toBinaryString(-2));//11111111111111111111111111111110
		System.out.println(Integer.toBinaryString(-3));//11111111111111111111111111111101
	}
	
}
