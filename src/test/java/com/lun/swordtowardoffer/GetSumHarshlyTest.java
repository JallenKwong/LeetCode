package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetSumHarshlyTest {

	@Test
	public void testCalc() {
		assertEquals(5050, GetSumHarshly.sum(100));
	}
	
	@Test
	public void testCalc2() {
		assertEquals(5050, GetSumHarshly.sum2(100));
	}
	
	@Test
	public void testCalc3() {
		assertEquals(5050, GetSumHarshly.sum3(100));
	}

}
