package com.lun.swordtowardoffer;

import java.util.LinkedList;
import com.lun.util.SinglyLinkedList.ListNode;

public class ReverseList {

	//三指针操作
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
	
	//利用栈的先进后出性质
	public ListNode reverse2(ListNode head) {
		if(head == null) {
			return null;
		}
		
		LinkedList<ListNode> stack = new LinkedList<>();
		ListNode p = head;
		while( p != null) {
			stack.push(p);
			p = p.next;
		}
		
		ListNode result = stack.pop(), temp = null;;
		p = result;
		while(!stack.isEmpty()) {
			temp = stack.pop();
			temp.next = null;//防止最后元素死循环
			p.next = temp;
			p = p.next;
		}
	
		return result;
	}
	
}
