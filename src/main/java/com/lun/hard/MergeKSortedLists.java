package com.lun.hard;

import com.lun.util.SinglyLinkedList.ListNode;

public class MergeKSortedLists {

	public ListNode mergeKLists(ListNode[] lists) {
		ListNode result = null;
		if (lists == null)
			return result;

		for (ListNode list : lists) {
			result = mergeTwoList(result, list);
		}

		return result;
	}

	private ListNode mergeTwoList(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else if (l1.val < l2.val) {
			l1.next = mergeTwoList(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoList(l1, l2.next);
			return l2;
		}
	}

}
