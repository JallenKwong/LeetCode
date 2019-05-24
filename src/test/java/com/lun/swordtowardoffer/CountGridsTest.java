package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountGridsTest {

	@Test
	public void testMovingCount() {
		CountGrids cg = new CountGrids();
		
		assertEquals(1, cg.movingCount(0, 1, 1));
	}

}
