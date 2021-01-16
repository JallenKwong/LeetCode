package com.lun.medium;

import com.lun.util.SinglyLinkedList.ListNode;

public class SwapNodesInPairs {

	// 方法一：
	public ListNode swapPairs1(ListNode head) {
		ListNode p1 = head;

		while (p1 != null) {
			ListNode p2 = p1.next;

			if (p2 != null) {
				int temp = p1.val;
				p1.val = p2.val;
				p2.val = temp;
				p1 = p1.next;
			}
			p1 = p1.next;
		}

		return head;
	}

	// 方法二：
	public ListNode swapPairs2(ListNode node) {
		if (node == null || node.next == null)
			return node;

		ListNode next = node.next;
		node.next = swapPairs2(next.next);
		next.next = node;
		return next;
	}

}
