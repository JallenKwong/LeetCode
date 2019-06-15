package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lun.util.SinglyLinkedList;
import com.lun.util.SinglyLinkedList.ListNode;

public class FindEntryNodeOfLoopTest {

	@Test
	public void test() {
		
		FindEntryNodeOfLoop fl = new FindEntryNodeOfLoop();
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		n6.next = n3;//n3为入口节点
		
		assertEquals(3, fl.find(n1).val);
		
		//没有环的链表
		assertNull(fl.find(SinglyLinkedList.intArray2List(new int[] {1, 2, 3, 4, 5, 6})));
		
	}
	
	
	@Test
	public void test2() {
		
		FindEntryNodeOfLoop fl = new FindEntryNodeOfLoop();
		
		assertNull(fl.meetNode(SinglyLinkedList.intArray2List(new int[] {1, 2, 3, 4, 5, 6})));
		
	}
	

}
