package com.lun.swordtowardoffer;

import org.junit.Assert;
import org.junit.Test;

public class AddHarshlyTest {

	@Test
	public void test() {
		AddHarshly ah = new AddHarshly();
		
		Assert.assertEquals(ah.add(1, 1), 1 + 1);
		Assert.assertEquals(ah.add(32, 32), 32 + 32);
		Assert.assertEquals(ah.add(1123, 12341), 1123 + 12341);
		Assert.assertEquals(ah.add(134543, 5617), 134543 + 5617);
		Assert.assertEquals(ah.add(6581, 1231), 6581 + 1231);
		Assert.assertEquals(ah.add(441, 54361), 441 + 54361);
	}
	
}
