package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountFrequencyOfOneTest {

	@Test
	public void testCount() {
		CountFrequencyOfOne co = new CountFrequencyOfOne();
		assertEquals(2, co.count(9));
		assertEquals(32, co.count(0xFFFFFFFF));
		assertEquals(31, co.count(0x7FFFFFFF));
		
		assertEquals(2, co.count2(9));
		assertEquals(32, co.count2(0xFFFFFFFF));
		assertEquals(31, co.count2(0x7FFFFFFF));
	}

}
