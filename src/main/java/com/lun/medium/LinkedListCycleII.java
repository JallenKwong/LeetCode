package com.lun.medium;

import com.lun.util.SinglyLinkedList.ListNode;

public class LinkedListCycleII {

	//方法一：《剑指Offer》的解法
	public ListNode detectCycle1(ListNode head) {
		ListNode collision = hasCycle(head);

		if (collision != null) {
			int cycleLength = count(collision);

			ListNode p1 = head;
			ListNode p2 = head;

			while (cycleLength-- > 0) {
				p2 = p2.next;
			}

			while (p1 != p2) {
				p1 = p1.next;
				p2 = p2.next;
			}

			return p1;
		}

		return null;
	}

	// 判断是否存在环
	private ListNode hasCycle(ListNode head) {
		ListNode walker = head;
		ListNode runner = head;
		while (runner != null && runner.next != null) {
			walker = walker.next;
			runner = runner.next.next;
			if (walker == runner)
				return walker;
		}
		return null;
	}

	// 计算环有多少节点
	private int count(ListNode p1) {
		int count = 1;
		ListNode p = p1.next;

		while (p != p1) {
			count++;
			p = p.next;
		}

		return count;
	}

	//方法二：leetcode优秀回答
	public ListNode detectCycle2(ListNode head) {
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				ListNode slow2 = head;
				while (slow != slow2) {
					slow2 = slow2.next;
					slow = slow.next;
				}
				return slow;
			}
		}
		return null;
	}

}
