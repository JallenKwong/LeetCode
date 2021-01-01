package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class IsomorphicStringsTest {

	@Test
	public void test() {
		IsomorphicStrings obj = new IsomorphicStrings();

		assertTrue(obj.isIsomorphic1("egg", "add"));
		assertFalse(obj.isIsomorphic1("foo", "bar"));
		assertTrue(obj.isIsomorphic1("paper", "title"));
		assertFalse(obj.isIsomorphic1("ab", "aa"));
		assertTrue(obj.isIsomorphic1("a", "a"));
		
		assertTrue(obj.isIsomorphic2("egg", "add"));
		assertFalse(obj.isIsomorphic2("foo", "bar"));
		assertTrue(obj.isIsomorphic2("paper", "title"));
		assertFalse(obj.isIsomorphic2("ab", "aa"));
		assertTrue(obj.isIsomorphic2("a", "a"));
	}
}
