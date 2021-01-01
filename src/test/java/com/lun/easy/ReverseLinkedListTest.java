package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.SinglyLinkedList;
import com.lun.util.SinglyLinkedList.ListNode;

public class ReverseLinkedListTest {

	@Test
	public void test1() {
		ReverseLinkedList obj = new ReverseLinkedList();
		
		ListNode original = SinglyLinkedList.ints2List(1, 2, 3, 4, 5);
		ListNode expected = SinglyLinkedList.ints2List(5, 4, 3, 2, 1);
		
		assertTrue(SinglyLinkedList.areTwoListEqual(expected, obj.reverseList1(original)));
	}
	
	@Test
	public void test2() {
		ReverseLinkedList obj = new ReverseLinkedList();
		
		ListNode original = SinglyLinkedList.ints2List(1, 2, 3, 4, 5);
		ListNode expected = SinglyLinkedList.ints2List(5, 4, 3, 2, 1);
		
		assertTrue(SinglyLinkedList.areTwoListEqual(expected, obj.reverseList2(original)));
	}
	
	@Test
	public void test3() {
		ReverseLinkedList obj = new ReverseLinkedList();
		
		ListNode original = SinglyLinkedList.ints2List(1, 2, 3, 4, 5);
		ListNode expected = SinglyLinkedList.ints2List(5, 4, 3, 2, 1);
		
		assertTrue(SinglyLinkedList.areTwoListEqual(expected, obj.reverseList3(original)));
	}
}
