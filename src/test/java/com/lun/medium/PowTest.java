package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class PowTest {

	@Test
	public void test() {
		Pow obj = new Pow();

		double delta = 10e-9;
		assertEquals(1024.0, obj.myPow(2.0, 10), delta);
		assertEquals(9.2610, obj.myPow(2.1, 3), delta);
		assertEquals(0.25, obj.myPow(2.0, -2), delta);
		assertEquals(1.0, obj.myPow(1.0, Integer.MAX_VALUE), delta);
		assertEquals(1.0, obj.myPow(1.0, Integer.MIN_VALUE), delta);
	}
	
	@Test
	public void test2() {
		Pow obj = new Pow();
		
		double delta = 10e-9;
		assertEquals(1024.0, obj.myPow2(2.0, 10), delta);
		assertEquals(9.2610, obj.myPow2(2.1, 3), delta);
		assertEquals(0.25, obj.myPow2(2.0, -2), delta);
		assertEquals(1.0, obj.myPow2(1.0, Integer.MAX_VALUE), delta);
		assertEquals(1.0, obj.myPow2(1.0, Integer.MIN_VALUE), delta);
	}
	
	@Test
	public void testOther() {
		assertEquals(Integer.MIN_VALUE, -Integer.MIN_VALUE);
		assertEquals(Integer.MIN_VALUE, Math.abs(Integer.MIN_VALUE));
	}
	
}
