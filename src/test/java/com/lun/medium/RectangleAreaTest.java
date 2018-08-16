package com.lun.medium;

import org.junit.Test;

import org.junit.Assert;

public class RectangleAreaTest {
	
	@Test
	public void testComputeArea() {
		Assert.assertEquals(45,
				new RectangleArea().computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
	}
}
