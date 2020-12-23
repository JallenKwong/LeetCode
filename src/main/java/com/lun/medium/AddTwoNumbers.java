package com.lun.medium;

import com.lun.util.SinglyLinkedList.ListNode;

public class AddTwoNumbers {
	
	//方法一：假设l1,l2都是合法参数，返回新的链表
	public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		
		//进位
		int carry = 0;
		
		ListNode head = null, tail = null;
		
		while(l1 != null || l2 != null) {
			
			int a = l1 != null ? l1.val : 0 ;
			int b = l2 != null ? l2.val : 0;
			
			int sum = a + b + carry;
			carry = sum / 10;
			
			ListNode tmp = new ListNode(sum % 10);
			
			if(head == null && tail == null) {
				head = tail = tmp;
			}else {
				tail.next = tmp;
				tail = tail.next;
			}
			
			if(l1 != null) {
				l1 = l1.next;
			}
			if(l2 != null) {
				l2 = l2.next;
			}
		}
		
		if(carry != 0) {
			tail.next = new ListNode(carry);
			tail = tail.next;
		}
		
		return head;
	}
	
	//方法二：比方法一精简些
	public ListNode addTwoNumbers2(ListNode l1, ListNode l2) { 
		int carry = 0;
		ListNode head = null, tail = null;
		while(l1 != null || l2 != null || carry != 0) {
			
			int a = l1 != null ? l1.val : 0 ;
			int b = l2 != null ? l2.val : 0;
			
			int sum = a + b + carry;
			carry = sum / 10;
			
			ListNode tmp = new ListNode(sum % 10);
			
			if(head == null && tail == null) {
				head = tail = tmp;
			}else {
				tail.next = tmp;
				tail = tail.next;
			}
			
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		
		return head;
	}
	

}
