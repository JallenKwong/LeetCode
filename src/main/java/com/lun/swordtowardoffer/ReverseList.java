package com.lun.swordtowardoffer;

import com.lun.util.SinglyLinkedList.ListNode;

public class ReverseList {

	public ListNode reverse(ListNode head){
		
		if(head == null) {
			return head;
		}
		
		ListNode a = head;
		ListNode b = a.next;
		ListNode c = null;
		
		while(a != null) {
			
			//真正改变转向
			a.next = c;

			//开始移位
			c = a;
			a = b;
			if(b != null)
				b = b.next;
		}
		
		
		return c;
		
	}
	
}
