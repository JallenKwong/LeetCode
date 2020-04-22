package com.lun.swordtowardoffer;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindTheSameOneInSortedArrayTest {

	@Test
	public void test() {
		FindTheSameOneInSortedArray fa = new FindTheSameOneInSortedArray();
		assertEquals(3, fa.find(new int[] {-3, -1, 1, 3, 5}));
	}
	
}
