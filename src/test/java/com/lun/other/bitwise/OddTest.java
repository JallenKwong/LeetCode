package com.lun.other.bitwise;

import org.junit.Assert;
import org.junit.Test;

public class OddTest {

	@Test
	public void test() {
		
		Assert.assertFalse(Odd.isOdd(2));
		Assert.assertFalse(Odd.isOdd(4));
		Assert.assertFalse(Odd.isOdd(0));
		Assert.assertFalse(Odd.isOdd(-2));
		Assert.assertFalse(Odd.isOdd(-4));
		
		Assert.assertTrue(Odd.isOdd(1));
		Assert.assertTrue(Odd.isOdd(3));
		Assert.assertTrue(Odd.isOdd(-1));
		Assert.assertTrue(Odd.isOdd(-3));
		Assert.assertTrue(Odd.isOdd(-5));
		
		//---
		
		Assert.assertFalse(Odd.isOdd2(2));
		Assert.assertFalse(Odd.isOdd2(4));
		Assert.assertFalse(Odd.isOdd2(0));
		Assert.assertFalse(Odd.isOdd2(-2));
		Assert.assertFalse(Odd.isOdd2(-4));
		
		Assert.assertTrue(Odd.isOdd2(1));
		Assert.assertTrue(Odd.isOdd2(3));
		Assert.assertTrue(Odd.isOdd2(-1));
		Assert.assertTrue(Odd.isOdd2(-3));
		Assert.assertTrue(Odd.isOdd2(-5));
	}

}
