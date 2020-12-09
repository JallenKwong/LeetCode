package com.lun.other.exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println(divideByZero());
	}

	public static int divideByZero() {
		int a = 10;
		try {
			return a / 0;
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			a = 0;
			return a;
		} finally {
			System.out.println("I'm finally");
		}
	}

}

/*
/ by zero
I'm finally 
0
*/
