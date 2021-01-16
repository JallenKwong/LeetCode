package com.lun.hard;

import static org.junit.Assert.*;
import static com.lun.util.SinglyLinkedList.*;

import org.junit.Test;

import com.lun.util.SinglyLinkedList.ListNode;

public class MergeKSortedListsTest {

	@Test
	public void test() {
		MergeKSortedLists obj = new MergeKSortedLists();

		ListNode[] lists1 = {ints2List(1, 4, 5), ints2List(1, 3, 4), ints2List(2, 6)};
		ListNode expected1 = ints2List(1, 1, 2, 3, 4, 4, 5, 6);
		
		assertTrue(areTwoListEqual(obj.mergeKLists(lists1), expected1));
		
		ListNode[] list2 = null;
		assertNull(obj.mergeKLists(list2));
		
		ListNode[] list3 = {};
		assertNull(obj.mergeKLists(list3));
	}
}
