package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class InversePairsTest {

	@Test
	public void testInverse() {
		
		InversePairs inp = new InversePairs();
		
		assertEquals(5, inp.inverse(new int[] {7, 5, 6, 4}));
		assertEquals(6, inp.inverse(new int[] {4, 3, 2, 1}));
		
	}

}
