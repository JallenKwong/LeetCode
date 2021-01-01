package com.lun.easy;

import com.lun.util.SinglyLinkedList.ListNode;

public class ReverseLinkedList {

	// 方法一：
	public ListNode reverseList1(ListNode head) {
		ListNode p1 = null, p2 = head, p3 = head.next;

		while (p2 != null) {
			p2.next = p1;
			p1 = p2;
			p2 = p3;
			if (p3 != null)
				p3 = p3.next;
		}
		return p1;
	}

	// 方法二：
	public ListNode reverseList2(ListNode head) {
		/* iterative solution */
		ListNode newHead = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}

	// 方法三：
	public ListNode reverseList3(ListNode head) {
		/* recursive solution */
		return reverseListInt(head, null);
	}

	private ListNode reverseListInt(ListNode head, ListNode newHead) {
		if (head == null)
			return newHead;
		ListNode next = head.next;
		head.next = newHead;
		return reverseListInt(next, head);
	}

}
