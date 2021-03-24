package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class LongestCommonSubsequenceTest {

	@Test
	public void test() {
		LongestCommonSubsequence obj = new LongestCommonSubsequence();

		assertEquals(3, obj.longestCommonSubsequence("abcde", "ace"));
		assertEquals(3, obj.longestCommonSubsequence("ace", "abcde"));
		assertEquals(3, obj.longestCommonSubsequence("abc", "abc"));
		assertEquals(0, obj.longestCommonSubsequence("abc", "def"));
	}

	@Test
	public void test2() {
		LongestCommonSubsequence obj = new LongestCommonSubsequence();

		assertEquals(3, obj.longestCommonSubsequence2("abcde", "ace"));
		assertEquals(3, obj.longestCommonSubsequence2("ace", "abcde"));
		assertEquals(3, obj.longestCommonSubsequence2("abc", "abc"));
		assertEquals(0, obj.longestCommonSubsequence2("abc", "def"));
	}

	@Test
	public void test3() {
		LongestCommonSubsequence obj = new LongestCommonSubsequence();

		assertEquals(3, obj.longestCommonSubsequence3("abcde", "ace"));
		assertEquals(3, obj.longestCommonSubsequence3("ace", "abcde"));
		assertEquals(3, obj.longestCommonSubsequence3("abc", "abc"));
		assertEquals(0, obj.longestCommonSubsequence3("abc", "def"));
	}

	@Test
	public void testOther() {
		assertEquals(1 & 1, 1 % 2);
		assertEquals(2 & 1, 2 % 2);
		assertEquals(3 & 1, 3 % 2);
		assertEquals(4 & 1, 4 % 2);
	}
}
