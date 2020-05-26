package com.lun.swordtowardoffer;

import java.util.LinkedList;

import com.lun.util.SinglyLinkedList.ListNode;

public class PrintListRecursively {

	//用递归(隐性栈)实现
	public String print(ListNode head) {
		String result = print(head, "");
		return result.startsWith(",") ? result.substring(1, result.length()) : result;
	}
	
	private String print(ListNode head, String str) {
		if(head != null) {
			return print(head.next) + "," + head.val + str; 
		}else {
			return "";
		}
	}
	
	//用栈实现
	public String print2(ListNode head) {
		LinkedList<ListNode> stack = new LinkedList<>();
		String result = "";
		
		ListNode p = head;
		while(p != null) {
			stack.push(p);
			p = p.next;
		}
		
		while(!stack.isEmpty()) {
			ListNode node = stack.pop();
			result += (node.val + (!stack.isEmpty() ? "," : ""));
		}
		
		return result;
	}
}
