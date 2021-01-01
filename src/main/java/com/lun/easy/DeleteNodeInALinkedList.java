package com.lun.easy;

import com.lun.util.SinglyLinkedList.ListNode;

public class DeleteNodeInALinkedList {

	// 方法一：
	public void deleteNode1(ListNode node) {
		ListNode p1 = node, p2 = node.next;

		while (p2 != null) {
			p1.val = p2.val;

			if (p2.next == null)
				p1.next = null;// help GC

			p1 = p2;
			p2 = p2.next;
		}
	}

	// 方法二：
	public void deleteNode2(ListNode node) {
		node.val = node.next.val;
		ListNode p = node.next;
		node.next = p.next;
		p = null;// help GC
	}

}
