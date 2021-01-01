package com.lun.easy;

import com.lun.util.SinglyLinkedList.ListNode;

public class RemoveLinkedListElements {
	
	//方法一：三指针法
	public ListNode removeElements1(ListNode head, int val) {
		ListNode p0 = head, p1, p2;

		// 针对链头节点是val的情况
		while (p0 != null && p0.val == val) {
			p1 = p0.next;
			p0.next = null;// help GC
			p0 = p1;
		}

		if (p0 != null) {
			p1 = p0;
			p2 = p0.next;

			while (p2 != null) {
				if (p2.val == val) {
					p1.next = p2.next;
					p2.next = null;// help GC
					p2 = p1.next;
				} else {
					p1 = p2;
					p2 = p2.next;
				}
			}
		}

		return p0;
	}

	//方法二：递归法
	public ListNode removeElements2(ListNode head, int val) {
		if (head == null)
			return null;
		ListNode p1 = head;

		if (p1.val == val) {
			ListNode p2 = p1.next;
			p1.next = null;// help GC
			return removeElements2(p2, val);
		} else {
			p1.next = removeElements2(p1.next, val);
		}
		return p1;
	}

	//方法三：假头法，比方法一精简些
	public ListNode removeElements3(ListNode head, int val) {
		ListNode fakeHead = new ListNode(-1, head);
		ListNode p1 = fakeHead, p2 = fakeHead.next;

		while (p2 != null) {
			if (p2.val == val) {
				p1.next = p2.next;
				p2.next = null;// help GC
				p2 = p1.next;
			} else {
				p1 = p2;
				p2 = p2.next;
			}
		}

		p1 = fakeHead.next;
		fakeHead.next = null;// help GC
		return p1;
	}

}
