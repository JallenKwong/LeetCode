package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeNumberTest {

	@Test
	public void test() {
		PalindromeNumber obj = new PalindromeNumber();
		assertTrue(obj.isPalindrome1(121));
		assertTrue(obj.isPalindrome1(2147447412));
		assertFalse(obj.isPalindrome1(-121));
		assertFalse(obj.isPalindrome1(10));
		assertFalse(obj.isPalindrome1(-101));
		assertFalse(obj.isPalindrome1(Integer.MAX_VALUE));
		
		assertTrue(obj.isPalindrome2(121));
		assertTrue(obj.isPalindrome2(2147447412));
		assertFalse(obj.isPalindrome2(-121));
		assertFalse(obj.isPalindrome2(10));
		assertFalse(obj.isPalindrome2(-101));
		assertFalse(obj.isPalindrome2(Integer.MAX_VALUE));
		
		assertTrue(obj.isPalindrome3(121));
		assertTrue(obj.isPalindrome3(2147447412));
		assertFalse(obj.isPalindrome3(-121));
		assertFalse(obj.isPalindrome3(10));
		assertFalse(obj.isPalindrome3(-101));
		assertFalse(obj.isPalindrome3(Integer.MAX_VALUE));
	}
}
