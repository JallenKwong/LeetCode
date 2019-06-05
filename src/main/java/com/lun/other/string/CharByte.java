package com.lun.other.string;

/**
 * char 存两个字节，使用UTF-16,超出两个字节的，循环从0重新开始
 * 
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-3.10.4
 * 
 * @author 白居布衣
 *
 */
public class CharByte {
	public static void main(String[] args) {
		
		char[] a = new char[128];
		char[] b = new char[128];
		
		for(int i = 65536;i != 65536 + 128; i++) {
			a[i - 65536] = (char)(i);
			System.out.println(Integer.toString(i) + ": " + (char)(i));
		}
			
		System.out.println("---");
		
		for(int i = 0;i != 128; i++) {
			b[i] = (char)(i);
			System.out.println(Integer.toString(i) + ": " + (char)(i));
		}
		
		System.out.println("---");
		
		for(int i = 0;i != 128; i++) {
			System.out.println(i + " - "+ a[i] +": " + (a[i] == b[i]));
		}
		
	}
}
