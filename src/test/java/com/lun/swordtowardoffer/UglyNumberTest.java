package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class UglyNumberTest {

	@Test
	public void testIsUgly() {
		UglyNumber un = new UglyNumber();
		
		assertTrue(un.isUgly(6));
		assertTrue(un.isUgly(8));
		assertFalse(un.isUgly(14));
		
	}
	
	@Test
	public void getUglyNumber() {
		UglyNumber un = new UglyNumber();
		
		assertEquals(1, un.getUglyNumber(1));
		assertEquals(1, un.getUglyNumber(1));
		assertEquals(2, un.getUglyNumber(2));
		assertEquals(3, un.getUglyNumber(3));
		assertEquals(4, un.getUglyNumber(4));
		assertEquals(5, un.getUglyNumber(5));
		assertEquals(6, un.getUglyNumber(6));
		assertEquals(8, un.getUglyNumber(7));
		assertEquals(9, un.getUglyNumber(8));
		assertEquals(10, un.getUglyNumber(9));
		assertEquals(12, un.getUglyNumber(10));
		assertEquals(15, un.getUglyNumber(11));
	}
	
	@Test
	public void getUglyNumber2() {
		UglyNumber un = new UglyNumber();
		
		assertEquals(1, un.getUglyNumber2(1));
		assertEquals(2, un.getUglyNumber2(2));
		assertEquals(3, un.getUglyNumber2(3));
		assertEquals(4, un.getUglyNumber2(4));
		assertEquals(5, un.getUglyNumber2(5));
		assertEquals(6, un.getUglyNumber2(6));
		assertEquals(8, un.getUglyNumber2(7));
		assertEquals(9, un.getUglyNumber2(8));
		assertEquals(10, un.getUglyNumber2(9));
		assertEquals(12, un.getUglyNumber2(10));
		assertEquals(15, un.getUglyNumber2(11));
		
	}
	

}
