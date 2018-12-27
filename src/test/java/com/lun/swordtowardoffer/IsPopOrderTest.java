package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsPopOrderTest {

	@Test
	public void testCheck() {
		IsPopOrder ipo = new IsPopOrder();
		
		assertTrue(ipo.check(new int[] {1,2,3,4,5}, new int[] {4,5,3,2,1}));
		assertFalse(ipo.check(new int[] {1,2,3,4,5}, new int[] {4,5,3,1,2}));
	}

}
