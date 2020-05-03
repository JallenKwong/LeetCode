package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.SinglyLinkedList;
import com.lun.util.SinglyLinkedList.ListNode;

public class MergeTwoSortedListsTest {

	@Test
	public void test() {
		MergeTwoSortedLists ml = new MergeTwoSortedLists();
		
		ListNode L1 = SinglyLinkedList.intArray2List(new int[] {1, 2, 4});
		ListNode L2 = SinglyLinkedList.intArray2List(new int[] {1, 3, 4});
		
		ListNode expected = SinglyLinkedList.intArray2List(new int[] {1, 1, 2, 3, 4, 4});
		
		assertTrue(SinglyLinkedList.equals(expected, ml.mergeTwoLists(L1, L2)));
	}
	@Test
	public void test2() {
		MergeTwoSortedLists ml = new MergeTwoSortedLists();
		
		ListNode L1 = SinglyLinkedList.intArray2List(new int[] {2, 4, 6, 8});
		ListNode L2 = SinglyLinkedList.intArray2List(new int[] {1, 3, 5, 7});
		
		ListNode expected = SinglyLinkedList.intArray2List(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
		
		assertTrue(SinglyLinkedList.equals(expected, ml.mergeTwoLists(L1, L2)));
	}
}
