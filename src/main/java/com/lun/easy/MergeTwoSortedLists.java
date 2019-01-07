package com.lun.easy;

import com.lun.util.SinglyLinkedList.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) { 
			return l2;
		}else if(l2 == null) {
			return l1;
		}else if(l1.val < l2.val) {
    		l1.next = mergeTwoLists(l1.next, l2);
    		return l1;
    	}else {
    		l2.next = mergeTwoLists(l1, l2.next);
    		return l2;
    	}
    }
    
    /**
     * 初次回答
     * 
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
    	ListNode result = null, pointer1 = l1, pointer2 = l2, resultPointer = null;
    	
    	while(!(pointer1 == null && pointer2 == null)) {
    		
    		int tmp = 0;
    		
    		if(pointer1 != null && pointer2 == null) {			
    			tmp = pointer1.val;
    			pointer1 = pointer1.next;
    		}
    		
    		if(pointer1 == null && pointer2 != null) {
    			tmp = pointer2.val;
    			pointer2 = pointer2.next;
    		}

    		if(pointer1 != null && pointer2 != null) {
    			if(pointer1.val < pointer2.val) {
    				tmp = pointer1.val;
    				pointer1 = pointer1.next;
    			}else{
    				tmp = pointer2.val;
    				pointer2 = pointer2.next;
    			}
    		}
    		
    		if(result == null) {
    			result = new ListNode(tmp);
    			resultPointer = result;
    		}else {
    			resultPointer.next = new ListNode(tmp);
    			resultPointer = resultPointer.next;
    		}
    		
    	}
    	
    	return result;
    }
    
}
