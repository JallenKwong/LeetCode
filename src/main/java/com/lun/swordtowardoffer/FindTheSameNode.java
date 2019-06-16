package com.lun.swordtowardoffer;

import com.lun.util.SinglyLinkedList.ListNode;

public class FindTheSameNode {
	
	public ListNode find(ListNode head1, ListNode head2) {
		
		int length1 = count(head1);
		int length2 = count(head2);
		
		int diff = Math.abs(length1 - length2);
		
		ListNode pLong = length1 > length2 ? head1 : head2, 
				pShort = length1 > length2 ? head2 : head1;
		
		while(diff > 0) {
			pLong = pLong.next;
			diff--;
		}
		
		while(pLong != null && pShort != null 
				&& pLong != pShort) {
			
			pLong = pLong.next;
			pShort = pShort.next;
		}
		
		return pLong;
	}
	
	
	public int count(ListNode head) {
		int result = 0;
		
		ListNode p = head;
		
		while(p != null) {
			result++;
			p = p.next;
		}
			
		return result;
	}
	
	
}
