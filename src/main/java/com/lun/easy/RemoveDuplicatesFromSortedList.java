package com.lun.easy;

import com.lun.util.SinglyLinkedList.ListNode;

public class RemoveDuplicatesFromSortedList {
	
	//方法一：逐个扫描，重复的逐个删除
    public ListNode deleteDuplicates1(ListNode head) {
    	if(head == null) return head;
    	
        ListNode prev = head, curr = head.next;
        
        while(curr != null) {
        	if(curr.val == prev.val) {
        		prev.next = curr.next;
        		curr.next = null;//垃圾回收
        		curr = prev.next;
        	}else {
        		prev = curr;
        		curr = curr.next;
        	}
        }
        
        return head;
    }
    
    
    //方法二：将不重复的值，替换重复的值
    public ListNode deleteDuplicates2(ListNode head) {
    	if(head == null) return head;
        ListNode p1 = head, p2 = head.next;
        
        while (p2 != null) {
        	if(p1.val != p2.val) {
        		p1.next.val = p2.val;
        		p1 = p1.next;
        	}
        	p2 = p2.next;
        }
        
    	p1.next = null;//垃圾回收
    	return head;
    }
    
    //方法三：递归法
    public ListNode deleteDuplicates3(ListNode head) {
		if(head == null || head.next == null) return head;
		
		head.next = deleteDuplicates3(head.next);
		
		ListNode result = null;
		
		if(head.val == head.next.val) {
			result = head.next;
			head.next = null;//垃圾回收
		}else {
			result = head;
		}
		
		return result;
    } 
    
}
