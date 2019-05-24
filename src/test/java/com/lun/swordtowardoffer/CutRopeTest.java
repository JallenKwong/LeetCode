package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class CutRopeTest {

	@Test
	public void testMaxProductAfterCutting1() {
		CutRope cr = new CutRope();
		
		assertEquals(18, cr.maxProductAfterCutting1(8));
		assertEquals(18, cr.maxProductAfterCutting2(8));
		
	}

}
