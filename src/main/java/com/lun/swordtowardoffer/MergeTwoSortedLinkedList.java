package com.lun.swordtowardoffer;

import com.lun.easy.MergeTwoSortedLists;
import com.lun.util.SinglyLinkedList.ListNode;

public class MergeTwoSortedLinkedList {
	public ListNode merge(ListNode l1, ListNode l2) {
		return new MergeTwoSortedLists().mergeTwoLists(l1, l2);
	}
}
