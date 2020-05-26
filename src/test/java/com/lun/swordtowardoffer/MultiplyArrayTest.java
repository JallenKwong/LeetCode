package com.lun.swordtowardoffer;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyArrayTest {

	@Test
	public void test() {
		MultiplyArray ma = new MultiplyArray();
		
		Assert.assertArrayEquals(new long[] {1}, ma.multiply(new long[] {1}));
		Assert.assertArrayEquals(new long[] {2, 1}, ma.multiply(new long[] {1, 2}));
		Assert.assertArrayEquals(new long[] {6, 3, 2}, ma.multiply(new long[] {1, 2, 3}));
		Assert.assertArrayEquals(new long[] {84, 108, 378, 126}, ma.multiply(new long[] {9, 7, 2, 6}));
	}
	
}
