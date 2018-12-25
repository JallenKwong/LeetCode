package com.lun.swordtowardoffer;

import java.util.Arrays;

public class Fibonacci {
	public long fibonacci(int n) {
		if(n == 0 || n == 1) 
			return n;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public long fibonacci2(int n) {
		if(n == 0 || n == 1) 
			return n;
		long first = 0, second = 1, current = 0;
		
		for(int i = 2; i <= n; i++) {
			current = first + second;
			first = second;
			second = current;
		}
		
		return current;		
	}
	
	private long[] array;
	
	public long fibonacci3(int n) {
		if(array == null || n > array.length + 1) {			
			array = new long[n + 1];
			Arrays.fill(array, -1);
			array[0] = 0;
			array[1] = 1;
		}
		
		if(n == 0 || n == 1) 
			return array[n];
		
		if(array[n] == -1)
			array[n] = fibonacci3(n - 1) + fibonacci3(n - 2);
		
		return array[n];
	}
	
}
