package com.lun.medium;

import com.lun.util.SinglyLinkedList.ListNode;

public class RemoveNthNodeFromEndOfList {

	// 方法一：我写的
	public ListNode removeNthFromEnd1(ListNode head, int n) {
		if (head == null || n <= 0)
			return head;
		int count = 1;
		ListNode fakeHead = new ListNode(-1, head);
		ListNode p1 = head, p2 = head.next, prev = fakeHead;

		while (p2 != null && count < n) {
			p2 = p2.next;
			count++;
		}

		if (n != count)
			return fakeHead.next;// count > 链表长度的情况

		// 齐步走
		while (p2 != null) {
			prev = p1;
			p1 = p1.next;
			p2 = p2.next;
		}

		// 移除
		prev.next = p1.next;
		p1.next = null; // help GC

		p2 = fakeHead.next;
		fakeHead.next = null; // help GC

		return p2;
	}

	// 方法二：别人写的
	public ListNode removeNthFromEnd2(ListNode head, int n) {

		ListNode start = new ListNode(0);
		ListNode slow = start, fast = start;
		slow.next = head;

		// Move fast in front so that the gap between slow and fast becomes n
		for (int i = 1; i <= n + 1; i++) {
			fast = fast.next;
		}
		// Move fast to the end, maintaining the gap
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		// Skip the desired node
		slow.next = slow.next.next;
		return start.next;
	}

}
