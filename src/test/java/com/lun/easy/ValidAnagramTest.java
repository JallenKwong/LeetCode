package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidAnagramTest {

	@Test
	public void test1() {
		ValidAnagram obj = new ValidAnagram();

		assertTrue(obj.isAnagram1("anagram", "nagaram"));
		assertTrue(obj.isAnagram1("", ""));
		assertFalse(obj.isAnagram1("rat", "car"));
	}
	
	@Test
	public void test2() {
		ValidAnagram obj = new ValidAnagram();
		
		assertTrue(obj.isAnagram2("anagram", "nagaram"));
		assertTrue(obj.isAnagram2("", ""));
		
		assertFalse(obj.isAnagram2("rat", "car"));
		assertFalse(obj.isAnagram2("aa", "bb"));
	}
}
