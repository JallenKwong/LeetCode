package com.lun.medium;

import org.junit.Assert;
import org.junit.Test;

public class BoatsToSavePeopleTest {

	@Test
	public void test() {
		BoatsToSavePeople bp = new BoatsToSavePeople();
		
		Assert.assertEquals(1, bp.numRescueBoats(new int[]{1, 2}, 3));
		Assert.assertEquals(3, bp.numRescueBoats(new int[]{3, 2, 2, 1}, 3));
		Assert.assertEquals(4, bp.numRescueBoats(new int[]{3, 5, 3, 4}, 5));
		
	}
}
