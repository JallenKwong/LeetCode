package com.lun.swordtowardoffer;

import com.lun.util.SinglyLinkedList.ListNode;

public class DeleteListNode {
	
	public boolean delete(ListNode list, int val) {
		
		if(list == null) {
			return false;
		}
		
		ListNode p = list;
		
		//头节点
		if(p.val == val) {
			list = list.next;
			p.next = null;
		}
		
		
		
		return false;
	}
	
	
}
