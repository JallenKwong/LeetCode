package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testFibonacci() {
		Fibonacci fi = new Fibonacci();
		assertEquals(0, fi.fibonacci(0));
		assertEquals(1, fi.fibonacci(1));
		assertEquals(1, fi.fibonacci(2));
		assertEquals(2, fi.fibonacci(3));
		assertEquals(3, fi.fibonacci(4));
		assertEquals(5, fi.fibonacci(5));
		assertEquals(8, fi.fibonacci(6));
		assertEquals(13, fi.fibonacci(7));
		assertEquals(21, fi.fibonacci(8));
		assertEquals(34, fi.fibonacci(9));
		assertEquals(55, fi.fibonacci(10));
		assertEquals(89, fi.fibonacci(11));
		assertEquals(144, fi.fibonacci(12));
		assertEquals(233, fi.fibonacci(13));
		assertEquals(377, fi.fibonacci(14));
		assertEquals(610, fi.fibonacci(15));
		assertEquals(987, fi.fibonacci(16));
		assertEquals(1597, fi.fibonacci(17));
		assertEquals(2584, fi.fibonacci(18));
		assertEquals(4181, fi.fibonacci(19));
		assertEquals(6765, fi.fibonacci(20));
	}

	@Test
	public void testFibonacci2() {
		Fibonacci fi = new Fibonacci();
		assertEquals(0, fi.fibonacci2(0));
		assertEquals(1, fi.fibonacci2(1));
		assertEquals(1, fi.fibonacci2(2));
		assertEquals(2, fi.fibonacci2(3));
		assertEquals(3, fi.fibonacci2(4));
		assertEquals(5, fi.fibonacci2(5));
		assertEquals(8, fi.fibonacci2(6));
		assertEquals(13, fi.fibonacci2(7));
		assertEquals(21, fi.fibonacci2(8));
		assertEquals(34, fi.fibonacci2(9));
		assertEquals(55, fi.fibonacci2(10));
		assertEquals(89, fi.fibonacci2(11));
		assertEquals(144, fi.fibonacci2(12));
		assertEquals(233, fi.fibonacci2(13));
		assertEquals(377, fi.fibonacci2(14));
		assertEquals(610, fi.fibonacci2(15));
		assertEquals(987, fi.fibonacci2(16));
		assertEquals(1597, fi.fibonacci2(17));
		assertEquals(2584, fi.fibonacci2(18));
		assertEquals(4181, fi.fibonacci2(19));
		assertEquals(6765, fi.fibonacci2(20));
		assertEquals(12586269025L, fi.fibonacci2(50));
		
		//System.out.println(fi.fibonacci2(50));
	}
	@Test
	public void testFibonacci3() {
		Fibonacci fi = new Fibonacci();
		assertEquals(6765, fi.fibonacci3(20));
		assertEquals(12586269025L, fi.fibonacci2(50));
	}
	
}
