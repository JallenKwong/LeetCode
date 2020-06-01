package com.lun.medium;

public class AddTwoNumbers {
	
	//假设l1,l2都是合法参数，返回新的链表
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
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
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(val);
			ListNode pointer = next;
			while(pointer != null) {
				sb.append("->");
				sb.append(pointer.val);
				pointer = pointer.next;
			}
			
			return sb.toString();
		}
		
		/* 
		 * 借助toString 判断链表相等
		 */
		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof ListNode))
				return false;
			
			return this.toString().equals(((ListNode)obj).toString());
		}

	}
	
	//辅助,非负数逆序队列,用队列实现
	public ListNode transform(int from) {
		
		//个位
		int digit = from % 10;
		ListNode tail = new ListNode(digit);
		ListNode head = tail;
		from = (from - digit) / 10; 
		
		while(from > 0) {
			digit = from % 10;
			tail.next = new ListNode(digit);
			tail = tail.next;
			from = (from - digit) / 10; 
		}
		
		return head;
	}
}
