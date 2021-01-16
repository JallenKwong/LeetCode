package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class DivideTwoIntegersTest {

	@Test
	public void test1() {
		DivideTwoIntegers obj = new DivideTwoIntegers();

		assertEquals(3, obj.divide(10, 3));
		assertEquals(-2, obj.divide(7, -3));
		assertEquals(0, obj.divide(0, 1));
		assertEquals(1, obj.divide(1, 1));

		assertEquals(Integer.MAX_VALUE, obj.divide(Integer.MAX_VALUE, 1));
		assertEquals(Integer.MIN_VALUE, obj.divide(Integer.MIN_VALUE, 1));
		assertEquals(0, obj.divide(1, Integer.MIN_VALUE));
		assertEquals(-1, obj.divide(-1, 1));

		assertEquals(1, obj.divide(Integer.MAX_VALUE, Integer.MAX_VALUE));
		assertEquals(Integer.MAX_VALUE, obj.divide(Integer.MAX_VALUE, 1));
		assertEquals(-Integer.MAX_VALUE, obj.divide(Integer.MAX_VALUE, -1));
		assertEquals(-Integer.MAX_VALUE, obj.divide(-Integer.MAX_VALUE, 1));
		assertEquals(Integer.MAX_VALUE, obj.divide(-Integer.MAX_VALUE, -1));
		assertEquals(0, obj.divide(1, Integer.MAX_VALUE));
		assertEquals(0, obj.divide(1, -Integer.MAX_VALUE));
		
		for (int i = -100; i <= 100; i++) {
			for (int j = 1; j < 100; j++) {
				assertEquals(i / j, obj.divide(i, j));
			}
		}
	}

	@Test
	public void test2() {
		DivideTwoIntegers obj = new DivideTwoIntegers();

		assertEquals(3, obj.divide2(10, 3));
		assertEquals(-2, obj.divide2(7, -3));
		assertEquals(0, obj.divide2(0, 1));
		assertEquals(1, obj.divide2(1, 1));

		assertEquals(Integer.MAX_VALUE, obj.divide2(Integer.MAX_VALUE, 1));
		assertEquals(Integer.MIN_VALUE, obj.divide2(Integer.MIN_VALUE, 1));
		assertEquals(0, obj.divide2(1, Integer.MIN_VALUE));
		assertEquals(-1, obj.divide2(-1, 1));

		assertEquals(1, obj.divide2(Integer.MAX_VALUE, Integer.MAX_VALUE));
		assertEquals(Integer.MAX_VALUE, obj.divide2(Integer.MAX_VALUE, 1));
		assertEquals(-Integer.MAX_VALUE, obj.divide2(Integer.MAX_VALUE, -1));
		assertEquals(-Integer.MAX_VALUE, obj.divide2(-Integer.MAX_VALUE, 1));
		assertEquals(Integer.MAX_VALUE, obj.divide2(-Integer.MAX_VALUE, -1));
		assertEquals(0, obj.divide2(1, Integer.MAX_VALUE));
		assertEquals(0, obj.divide2(1, -Integer.MAX_VALUE));
		
		for (int i = -100; i <= 100; i++) {
			for (int j = 1; j < 100; j++) {
				assertEquals(i / j, obj.divide2(i, j));
			}
		}
	}
	
	@Test
	public void test3() {
		DivideTwoIntegers obj = new DivideTwoIntegers();
		
		assertEquals(3, obj.divide3(10, 3));
		assertEquals(-2, obj.divide3(7, -3));
		assertEquals(0, obj.divide3(0, 1));
		assertEquals(1, obj.divide3(1, 1));
		
		assertEquals(Integer.MAX_VALUE, obj.divide3(Integer.MAX_VALUE, 1));
		assertEquals(Integer.MIN_VALUE, obj.divide3(Integer.MIN_VALUE, 1));
		assertEquals(0, obj.divide3(1, Integer.MIN_VALUE));
		assertEquals(-1, obj.divide3(-1, 1));
		
		assertEquals(1, obj.divide3(Integer.MAX_VALUE, Integer.MAX_VALUE));
		assertEquals(Integer.MAX_VALUE, obj.divide3(Integer.MAX_VALUE, 1));
		assertEquals(-Integer.MAX_VALUE, obj.divide3(Integer.MAX_VALUE, -1));
		assertEquals(-Integer.MAX_VALUE, obj.divide3(-Integer.MAX_VALUE, 1));
		assertEquals(Integer.MAX_VALUE, obj.divide3(-Integer.MAX_VALUE, -1));
		assertEquals(0, obj.divide3(1, Integer.MAX_VALUE));
		assertEquals(0, obj.divide3(1, -Integer.MAX_VALUE));
		
		for (int i = -100; i <= 100; i++) {
			for (int j = 1; j < 100; j++) {
				assertEquals(i / j, obj.divide3(i, j));
			}
		}
	}
	
	@Test
	public void test() {
		assertEquals(Integer.MIN_VALUE, Math.abs(Integer.MIN_VALUE));
	}

}