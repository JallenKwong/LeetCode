package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindTheMinOneInASpinnedSortedArrayTest {

	@Test
	public void testFrind() {
		FindTheMinOneInASpinnedSortedArray fa = new FindTheMinOneInASpinnedSortedArray();
		
		assertEquals(1, fa.find(new int[] {3, 4, 5, 1, 2}));
		assertEquals(0, fa.find(new int[] {1, 0, 1, 1, 1}));
		assertEquals(0, fa.find(new int[] {1, 1, 1, 0, 1}));
		
	}

}
