package com.lun.swordtowardoffer;

import org.junit.Assert;
import org.junit.Test;

public class PokerStraightTest {

	@Test
	public void test() {
		
		PokerStraight ps = new PokerStraight();
		
		Assert.assertTrue(ps.isStraight(new int[] {0, 1, 3, 4, 5}));
		Assert.assertTrue(ps.isStraight(new int[] {0, 1, 3, 0, 5}));
	}
	
}
