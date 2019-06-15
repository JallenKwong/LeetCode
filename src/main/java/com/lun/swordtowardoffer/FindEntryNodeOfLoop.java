package com.lun.swordtowardoffer;

import com.lun.util.SinglyLinkedList.ListNode;

public class FindEntryNodeOfLoop {

	public ListNode find(ListNode head) {
		
		ListNode meetNode = meetNode(head);
		
		//1.判断是否存在环
		if(meetNode == null) {
			return null;
		}
		
		int nodesInLoop = 1;
		
		ListNode node1 = meetNode;
		
		//2.计算环内节点
		while(node1.next != meetNode) {
			nodesInLoop++;
			node1 = node1.next;
		}
		
		//3.先移动node1, 次数为环中节点的数目
		node1 = head;
		for(int i = 0; i < nodesInLoop; i++)
			node1 = node1.next;
		
		ListNode node2 = head;
		while(node1 != node2) {
			node1 = node1.next;
			node2 = node2.next;
		}
		
		return node1;
	}

	
	public ListNode meetNode(ListNode head) {
		
		if(head == null)
			return null;
		
		ListNode slow = head.next;
		
		if(slow == null) {//链表只有一个节点
			return null;
		}
			
		ListNode fast = slow.next;
		
		while(fast != null && slow != null) {//可能循环几次才能碰上
		
			if(fast == slow) {
				return fast;
			}
			
			slow = slow.next;
			fast = fast.next;
			
			if(fast != null) {
				fast = fast.next;
			}
		}
		
		return null;
	}
	
}
