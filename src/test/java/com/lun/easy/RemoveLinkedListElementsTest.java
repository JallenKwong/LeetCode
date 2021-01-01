package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.SinglyLinkedList;
import com.lun.util.SinglyLinkedList.ListNode;

public class RemoveLinkedListElementsTest {

	@Test
	public void test1() {
		RemoveLinkedListElements obj = new RemoveLinkedListElements();
		
		ListNode original1 = SinglyLinkedList.ints2List(1, 2, 6, 3, 4, 5, 6);
		ListNode expected1 = SinglyLinkedList.ints2List(1, 2, 3, 4, 5);
		assertTrue(SinglyLinkedList.areTwoListEqual(expected1, obj.removeElements1(original1, 6)));
		
		ListNode original2 = SinglyLinkedList.ints2List(6, 6, 6, 1, 2, 6, 3, 4, 5, 6);
		ListNode expected2 = SinglyLinkedList.ints2List(1, 2, 3, 4, 5);
		assertTrue(SinglyLinkedList.areTwoListEqual(expected2, obj.removeElements1(original2, 6)));
	}
	
	@Test
	public void test2() {
		RemoveLinkedListElements obj = new RemoveLinkedListElements();

		ListNode original1 = SinglyLinkedList.ints2List(1, 2, 6, 3, 4, 5, 6);
		ListNode expected1 = SinglyLinkedList.ints2List(1, 2, 3, 4, 5);
		assertTrue(SinglyLinkedList.areTwoListEqual(expected1, obj.removeElements2(original1, 6)));
		
		ListNode original2 = SinglyLinkedList.ints2List(6, 6, 6, 1, 2, 6, 3, 4, 5, 6);
		ListNode expected2 = SinglyLinkedList.ints2List(1, 2, 3, 4, 5);
		assertTrue(SinglyLinkedList.areTwoListEqual(expected2, obj.removeElements2(original2, 6)));
	}
	
	@Test
	public void test3() {
		RemoveLinkedListElements obj = new RemoveLinkedListElements();
		
		ListNode original1 = SinglyLinkedList.ints2List(1, 2, 6, 3, 4, 5, 6);
		ListNode expected1 = SinglyLinkedList.ints2List(1, 2, 3, 4, 5);
		assertTrue(SinglyLinkedList.areTwoListEqual(expected1, obj.removeElements3(original1, 6)));
		
		ListNode original2 = SinglyLinkedList.ints2List(6, 6, 6, 1, 2, 6, 3, 4, 5, 6);
		ListNode expected2 = SinglyLinkedList.ints2List(1, 2, 3, 4, 5);
		assertTrue(SinglyLinkedList.areTwoListEqual(expected2, obj.removeElements3(original2, 6)));
	}
}
