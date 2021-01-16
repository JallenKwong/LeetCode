package com.lun.util;

import static org.junit.Assert.*;

import org.junit.Test;
import com.lun.util.SinglyLinkedList.ListNode;

public class SinglyLinkedListTest {

	@Test
	public void testIntArray2List() {
		ListNode list1 = SinglyLinkedList.intArray2List(new int[] {1,2,3});
		System.out.println(SinglyLinkedList.print(list1));
	}

	@Test
	public void testEqualsListNodeListNode() {
		ListNode list1 = SinglyLinkedList.intArray2List(new int[] {1,2,3});
		ListNode list2 = SinglyLinkedList.intArray2List(new int[] {1,2,3});
		assertTrue(SinglyLinkedList.areTwoListEqual(list1, list2));
		
		list1 = SinglyLinkedList.intArray2List(new int[] {1,2,3});
		list2 = SinglyLinkedList.intArray2List(new int[] {1,2});
		assertFalse(SinglyLinkedList.areTwoListEqual(list1, list2));
		
		list1 = SinglyLinkedList.intArray2List(null);
		list2 = SinglyLinkedList.intArray2List(new int[] {1,2});
		assertFalse(SinglyLinkedList.areTwoListEqual(list1, list2));
		
		list1 = SinglyLinkedList.intArray2List(null);
		list2 = SinglyLinkedList.intArray2List(null);
		assertTrue(SinglyLinkedList.areTwoListEqual(list1, list2));
	}
	
	
	@Test(expected = RuntimeException.class)
	public void testEqualsListNodeListNode2() {
		ListNode list1 = SinglyLinkedList.ints2List(1, 2, 3);
		ListNode list2 = SinglyLinkedList.ints2List(1, 2, 4);
		
		assertTrue(SinglyLinkedList.areTwoListEqual2(list1, list2));
	}

}
