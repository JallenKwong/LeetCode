package com.lun.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfOneBitsTest {

	@Test
	public void test() {
		NumberOfOneBits obj = new NumberOfOneBits();

		assertEquals(3, obj.hammingWeight1(Integer.parseInt("00000000000000000000000000001011", 2)));
		assertEquals(1, obj.hammingWeight1(Integer.parseInt("00000000000000000000000010000000", 2)));
		assertEquals(31, obj.hammingWeight1(-3));//Integer.parseInt("11111111111111111111111111111101", 2) 抛错
		
		assertEquals(3, obj.hammingWeight2(Integer.parseInt("00000000000000000000000000001011", 2)));
		assertEquals(1, obj.hammingWeight2(Integer.parseInt("00000000000000000000000010000000", 2)));
		assertEquals(31, obj.hammingWeight2(-3));
	}
}
