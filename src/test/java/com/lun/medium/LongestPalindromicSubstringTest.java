package com.lun.medium;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class LongestPalindromicSubstringTest {

	@Test
	public void test() {
		LongestPalindromicSubstring obj = new LongestPalindromicSubstring();

		assertEquals("bb", obj.longestPalindrome1("cbbd"));
		assertEquals("a", obj.longestPalindrome1("a"));
		assertThat(obj.longestPalindrome1("ac"), anyOf(is("a"), is("c")));
		assertThat(obj.longestPalindrome1("babad"), anyOf(is("bab"), is("aba")));
		
		assertEquals("bb", obj.longestPalindrome2("cbbd"));
		assertEquals("a", obj.longestPalindrome2("a"));
		assertThat(obj.longestPalindrome2("ac"), anyOf(is("a"), is("c")));
		assertThat(obj.longestPalindrome2("babad"), anyOf(is("bab"), is("aba")));
	}
}
