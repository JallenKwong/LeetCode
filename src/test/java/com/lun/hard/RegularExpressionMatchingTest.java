package com.lun.hard;

import static org.junit.Assert.*;
import org.junit.Test;

public class RegularExpressionMatchingTest {

	@Test
	public void test() {
		RegularExpressionMatching obj = new RegularExpressionMatching();

		assertFalse(obj.isMatch1("aa", "a"));
		assertTrue(obj.isMatch1("aa", "a*"));
		assertTrue(obj.isMatch1("ab", ".*"));
		assertTrue(obj.isMatch1("aab", "c*a*b"));
		assertFalse(obj.isMatch1("mississippi", "mis*is*p*."));
		
		assertFalse(obj.isMatch2("aa", "a"));
		assertTrue(obj.isMatch2("aa", "a*"));
		assertTrue(obj.isMatch2("ab", ".*"));
		assertTrue(obj.isMatch2("aab", "c*a*b"));
		assertFalse(obj.isMatch2("mississippi", "mis*is*p*."));
		
	}
}
