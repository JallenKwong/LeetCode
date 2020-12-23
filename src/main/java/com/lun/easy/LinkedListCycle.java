package com.lun.easy;

import com.lun.util.SinglyLinkedList.ListNode;

public class LinkedListCycle {
	// 方法一：我写的方法
	public boolean hasCycle1(ListNode head) {
		if (head == null)
			return false;
		ListNode p1 = head, p2 = head.next;

		while (true) {
			if (p2 == null)
				break;

			if (p1 == p2) {
				return true;
			} else {
				p1 = p1.next;
				p2 = p2.next;
				if (p2 == null) {
					break;
				} else {
					if (p1 == p2)
						return true;
					p2 = p2.next;
				}
			}
		}

		return false;
	}

	// 方法二：别人写的方法
	public boolean hasCycle2(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        while(runner != null && runner.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker == runner) return true;
        }
        return false;
	}

}
