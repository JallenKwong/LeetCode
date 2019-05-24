package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class PowerOfFourTest {

	@Test
	public void test() {
		PowerOfFour pf = new PowerOfFour();
		
		assertTrue(pf.isPowerOfFour(4));
		assertTrue(pf.isPowerOfFour(16));
		assertFalse(pf.isPowerOfFour(17));
		assertFalse(pf.isPowerOfFour(5));
	}
	
	@Test
	public void test2() {
		PowerOfFour pf = new PowerOfFour();
		
		assertTrue(pf.isPowerOfFour2(4));
		assertTrue(pf.isPowerOfFour2(16));
		assertFalse(pf.isPowerOfFour2(17));
		assertFalse(pf.isPowerOfFour2(5));
	}
}
