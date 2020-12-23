package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidPalindromeTest {

	@Test
	public void test() {
		ValidPalindrome obj = new ValidPalindrome();

		assertTrue(obj.isPalindrome1("A man, a plan, a canal: Panama"));
		assertFalse(obj.isPalindrome1("race a car"));
		
		assertTrue(obj.isPalindrome2("A man, a plan, a canal: Panama"));
		assertFalse(obj.isPalindrome2("race a car"));
		
		assertTrue(obj.isPalindrome3("A man, a plan, a canal: Panama"));
		assertFalse(obj.isPalindrome3("race a car"));
	}
}
