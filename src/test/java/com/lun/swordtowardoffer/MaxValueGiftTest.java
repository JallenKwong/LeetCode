package com.lun.swordtowardoffer;

import org.junit.Assert;
import org.junit.Test;

public class MaxValueGiftTest {

	@Test
	public void test() {
		int[][] values = {{1,10,3,8},
						{12,2,9,6},
						{5,7,4,11},
						{3,7,16,5}};
		
		MaxValueGift mg = new MaxValueGift();
		
		Assert.assertEquals(53, mg.getMaxValue(values));
		Assert.assertEquals(53, mg.getMaxValue2(values));
	}
	
}
