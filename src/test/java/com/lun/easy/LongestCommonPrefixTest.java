package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class LongestCommonPrefixTest {

	@Test
	public void test() {
		LongestCommonPrefix obj = new LongestCommonPrefix();

		final String[] array1 = {"flower", "flow", "flight"};
		assertEquals("fl", obj.longestCommonPrefix1(array1));
		assertEquals("fl", obj.longestCommonPrefix2(array1));
		assertEquals("fl", obj.longestCommonPrefix3(array1));
		
		final String[] array2 = {"dog", "racecar", "car"};
		assertEquals("", obj.longestCommonPrefix1(array2));
		assertEquals("", obj.longestCommonPrefix2(array2));
		assertEquals("", obj.longestCommonPrefix3(array2));
	}
}
