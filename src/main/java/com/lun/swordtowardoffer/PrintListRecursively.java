package com.lun.swordtowardoffer;

import com.lun.util.SinglyLinkedList.ListNode;

public class PrintListRecursively {

	
	public String print(ListNode head) {
		String result = print(head, "");
		return result.startsWith(",") ? result.substring(1, result.length()) : result;
	}
	
	public String print(ListNode head, String str) {
		if(head != null) {
			return print(head.next) + "," + head.val + str; 
		}else {
			return "";
		}
	}
	
}
