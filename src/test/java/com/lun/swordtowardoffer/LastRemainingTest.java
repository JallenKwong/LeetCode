package com.lun.swordtowardoffer;

import org.junit.Assert;
import org.junit.Test;

public class LastRemainingTest {

	@Test
	public void test() {
		LastRemaining lr = new LastRemaining();
		
		Assert.assertEquals(3, lr.lastRemaining(5, 3));
		Assert.assertEquals(2, lr.lastRemaining(10, 17));
		Assert.assertEquals(3, lr.lastRemaining2(5, 3));
		Assert.assertEquals(2, lr.lastRemaining2(10, 17));
	}
	
}
