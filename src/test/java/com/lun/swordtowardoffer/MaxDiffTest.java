package com.lun.swordtowardoffer;

import org.junit.Assert;
import org.junit.Test;


public class MaxDiffTest {

	@Test
	public void test() {
		MaxDiff md = new MaxDiff();
		Assert.assertEquals(11, md.maxDiff(new int[] {9, 11, 8, 5, 7, 12, 16, 14}));
	}
	
}
