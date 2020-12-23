package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTrailingZeroesTest {

	@Test
	public void test1() {
		FactorialTrailingZeroes obj = new FactorialTrailingZeroes();

		assertEquals(0, obj.trailingZeroes1(3));
		assertEquals(1, obj.trailingZeroes1(5));
		assertEquals(0, obj.trailingZeroes1(0));
		
		assertEquals(0, obj.trailingZeroes2(3));
		assertEquals(1, obj.trailingZeroes2(5));
		assertEquals(0, obj.trailingZeroes2(0));
		
		for(int i = 0; i <= 1000; i++) {
			//System.out.println(String.format("trailingZeroes(%d) : %d : %d", i, obj.trailingZeroes1(i), obj.trailingZeroes2(i)));
			assertEquals(obj.trailingZeroes1(i), obj.trailingZeroes2(i));
		}
	}
	
	@Test
	public void test2() {
		FactorialTrailingZeroes obj = new FactorialTrailingZeroes();
		for(int i = 0; i <= 1000; i++) {
			assertEquals(obj.trailingZeroes1(i), obj.trailingZeroes3(i));
		}
	}
	
	@Test
	public void testfactorial() {
		FactorialTrailingZeroes obj = new FactorialTrailingZeroes();
		assertEquals("265252859812191058636308480000000", obj.factorial(30).toString());
	}
	
}
