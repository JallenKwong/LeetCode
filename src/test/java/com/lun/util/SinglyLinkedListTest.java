package com.lun.util;

import static org.junit.Assert.*;

import org.junit.Test;
import com.lun.util.SinglyLinkedList.ListNode;

public class SinglyLinkedListTest {

	@Test
	public void testIntArray2List() {
		ListNode list1 = SinglyLinkedList.intArray2List(new int[] {1,2,3});
		System.out.println(list1);
	}

	@Test
	public void testEqualsListNodeListNode() {
		ListNode list1 = SinglyLinkedList.intArray2List(new int[] {1,2,3});
		ListNode list2 = SinglyLinkedList.intArray2List(new int[] {1,2,3});
		assertTrue(SinglyLinkedList.equals(list1, list2));
		
		list1 = SinglyLinkedList.intArray2List(new int[] {1,2,3});
		list2 = SinglyLinkedList.intArray2List(new int[] {1,2});
		assertFalse(SinglyLinkedList.equals(list1, list2));
		
		list1 = SinglyLinkedList.intArray2List(null);
		list2 = SinglyLinkedList.intArray2List(new int[] {1,2});
		assertFalse(SinglyLinkedList.equals(list1, list2));
		
		list1 = SinglyLinkedList.intArray2List(null);
		list2 = SinglyLinkedList.intArray2List(null);
		assertTrue(SinglyLinkedList.equals(list1, list2));
	}

}
