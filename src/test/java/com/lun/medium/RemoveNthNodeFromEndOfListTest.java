package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.SinglyLinkedList;
import com.lun.util.SinglyLinkedList.ListNode;

public class RemoveNthNodeFromEndOfListTest {

	@Test
	public void test1() {
		RemoveNthNodeFromEndOfList obj = new RemoveNthNodeFromEndOfList();

		ListNode original1 = SinglyLinkedList.ints2List(1, 2, 3, 4, 5);
		ListNode expected1 = SinglyLinkedList.ints2List(1, 2, 3, 5);
		assertTrue(SinglyLinkedList.areTwoListEqual(expected1, obj.removeNthFromEnd1(original1, 2)));

		ListNode original2 = new ListNode(1);
		assertNull(obj.removeNthFromEnd1(original2, 1));

		ListNode original3 = SinglyLinkedList.ints2List(1, 2);
		ListNode expected3 = new ListNode(1);
		assertTrue(SinglyLinkedList.areTwoListEqual(expected3, obj.removeNthFromEnd1(original3, 1)));
	}
	
	@Test
	public void test2() {
		RemoveNthNodeFromEndOfList obj = new RemoveNthNodeFromEndOfList();
		
		ListNode original1 = SinglyLinkedList.ints2List(1, 2, 3, 4, 5);
		ListNode expected1 = SinglyLinkedList.ints2List(1, 2, 3, 5);
		assertTrue(SinglyLinkedList.areTwoListEqual(expected1, obj.removeNthFromEnd2(original1, 2)));
		
		ListNode original2 = new ListNode(1);
		assertNull(obj.removeNthFromEnd2(original2, 1));
		
		ListNode original3 = SinglyLinkedList.ints2List(1, 2);
		ListNode expected3 = new ListNode(1);
		assertTrue(SinglyLinkedList.areTwoListEqual(expected3, obj.removeNthFromEnd2(original3, 1)));
	}
}
