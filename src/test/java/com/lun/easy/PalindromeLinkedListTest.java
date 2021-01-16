package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.SinglyLinkedList;

public class PalindromeLinkedListTest {

	@Test
	public void test() {
		PalindromeLinkedList obj = new PalindromeLinkedList();

		assertFalse(obj.isPalindrome1(SinglyLinkedList.ints2List(1, 2)));
		assertTrue(obj.isPalindrome1(SinglyLinkedList.ints2List(1, 2, 2, 1)));
		
		assertFalse(obj.isPalindrome2(SinglyLinkedList.ints2List(1, 2)));
		assertTrue(obj.isPalindrome2(SinglyLinkedList.ints2List(1, 2, 2, 1)));
		
		assertFalse(obj.isPalindrome3(SinglyLinkedList.ints2List(1, 2)));
		assertTrue(obj.isPalindrome3(SinglyLinkedList.ints2List(1, 2, 2, 1)));
		
		assertFalse(obj.isPalindrome4(SinglyLinkedList.ints2List(1, 2)));
		assertTrue(obj.isPalindrome4(SinglyLinkedList.ints2List(1, 2, 2, 1)));
	}
}
