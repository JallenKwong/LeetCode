package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerifySquenceOfBSTTest {

	@Test
	public void testVerify() {
		VerifySquenceOfBST vb = new VerifySquenceOfBST();
		assertTrue(vb.verify(new int[] {5,7,6,9,11,10,8}));
		assertFalse(vb.verify(new int[] {7,4,6,5}));
	}

}
