package com.lun.hard;

import com.lun.util.SinglyLinkedList.ListNode;

public class ReverseNodesInKGroup {

	// 方法一：递归版
	public ListNode reverseKGroup1(ListNode head, int k) {
		if (k < 2 || head == null)
			return head;

		int count = 0;
		ListNode tail = head;
		while (tail != null && k != count) {
			count++;
			tail = tail.next;
		}

		if (count == k) {
			ListNode newHead = reverseKGroup1(tail, k);

			while (count-- > 0) {
				ListNode next = head.next;
				head.next = newHead;
				newHead = head;
				head = next;
			}
			return newHead;
		}
		return head;
	}

	// 方法二：非递归版
	public ListNode reverseKGroup2(ListNode head, int k) {
		if (k < 2 || head == null)
			return head;
		
		ListNode fakeHead = new ListNode(-1);
		ListNode tail = fakeHead, secondTail = head, secondHead = head;
		while(true) {
			int count = 0;
			while (secondHead != null && k != count) {
				count++;
				secondHead = secondHead.next;
			}
			
			if(k == count) {
				ListNode newHead = secondHead;
				while(count-- > 0) {
					ListNode next = head.next;
					head.next = newHead;
					newHead = head;
					head = next;
				}
				tail.next = newHead;
				tail = secondTail;
				head = secondHead;
				secondTail = head;
			}else
				break;
		}
		return fakeHead.next;
	}

}
