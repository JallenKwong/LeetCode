package com.lun.easy;

import java.util.LinkedList;

import com.lun.util.SinglyLinkedList.ListNode;

public class PalindromeLinkedList {

	// 方法一：我写的
	public boolean isPalindrome1(ListNode head) {
		if (head == null)
			return false;

		ListNode p1 = head, p2 = head;
		int count = 0;

		while (p1 != null) {
			p1 = p1.next;
			count++;
		}

		int half = count - count / 2;

		while (half-- > 0) {
			p2 = p2.next;
		}

		p1 = head;
		for (int i = count / 2; i > 0; i--) {
			int step = i - 1;
			while (step-- > 0) {
				p1 = p1.next;
			}

			if (p1.val != p2.val) {
				return false;
			}
			p1 = head;
			p2 = p2.next;
		}

		return true;
	}

	// 方法二：使用栈
	public boolean isPalindrome2(ListNode head) {
		ListNode temp = head;
		LinkedList<Integer> stack = new LinkedList<>();
		while (temp != null) {
			stack.push(temp.val);
			temp = temp.next;
		}

		while (head != null) {
			if (head.val != (int) stack.pop()) {
				return false;
			}
			head = head.next;
		}
		return true;
	}

	// 方法三：递归
	ListNode ref;

	public boolean isPalindrome3(ListNode head) {
		ref = head;
		return check(head);
	}

	public boolean check(ListNode node) {
		if (node == null)
			return true;
		boolean ans = check(node.next);
		boolean isEqual = (ref.val == node.val) ? true : false;
		ref = ref.next;
		return ans && isEqual;
	}

	// 方法四：双指针，以及要反转链表
	public boolean isPalindrome4(ListNode head) {
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		if (fast != null) { // odd nodes: let right half smaller
			slow = slow.next;
		}
		slow = reverse(slow);
		fast = head;

		while (slow != null) {
			if (fast.val != slow.val) {
				return false;
			}
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}

	private ListNode reverse(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
}
