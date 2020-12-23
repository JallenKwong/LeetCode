package com.lun.easy;

import com.lun.util.SinglyLinkedList.ListNode;

public class IntersectionOfTwoLinkedLists {

	// 方法一：我写的
	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		int aLength = getLength(headA);
		int bLength = getLength(headB);

		if (aLength == 0 || bLength == 0)
			return null;

		int diff = aLength - bLength;
		ListNode p1 = headA, p2 = headB;
		if (diff >= 0) {

			while (diff-- > 0) {
				p1 = p1.next;
			}

		} else {
			diff = Math.abs(diff);

			while (diff-- > 0) {
				p2 = p2.next;
			}
		}

		while (p1 != null) {
			if (p1 == p2)
				return p1;
			p1 = p1.next;
			p2 = p2.next;
		}

		return null;
	}

	// 方法二：
	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
		int lenA = getLength(headA), lenB = getLength(headB);
		// move headA and headB to the same start point
		while (lenA > lenB) {
			headA = headA.next;
			lenA--;
		}
		while (lenA < lenB) {
			headB = headB.next;
			lenB--;
		}
		// find the intersection until end
		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}

	private int getLength(ListNode head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	//方法三
	public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
		// boundary check
		if (headA == null || headB == null)
			return null;
		ListNode a = headA, b = headB;

		// if a & b have different len, then we will stop the loop after second
		// iteration
		while (a != b) {
			// for the end of first iteration, we just reset the pointer to the head of
			// another linkedlist
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}

		return a;
	}

}
