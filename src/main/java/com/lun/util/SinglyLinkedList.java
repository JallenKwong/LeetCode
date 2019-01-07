package com.lun.util;


public class SinglyLinkedList {
	public static class ListNode{
		public int val;
		public ListNode next;
		public ListNode(int val) {
			this.val = val;
		}
	}
	
	
	/**
	 * 基本整型数组转换成单项链表
	 * 
	 * @param src
	 * @return
	 */
	public static ListNode intArray2List(int[] src) {
		ListNode result = null;
		if(MyUtils.checkArrayEmpty(src)) {
			return result;
		}
		ListNode p = null;
		
		for(int temp : src) {
			if(result == null) {				
				p = result = new ListNode(temp);
			}else {
				p.next = new ListNode(temp);
				p = p.next;
			}
		}
		
		return result;
	}
	
	/**
	 * 
	 * 判断两条单向链表是否相同
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static boolean equals(ListNode list1, ListNode list2) {
		if(list1 == null && list2 != null
				|| list1 != null && list2 == null) {
			return false;
		}
		
		if(list1 != null && list2 != null) {
			if(list1.val != list2.val) {
				return false;
			}
			return equals(list1.next, list2.next);
		}
		
		return true;
	}
	
	
}
