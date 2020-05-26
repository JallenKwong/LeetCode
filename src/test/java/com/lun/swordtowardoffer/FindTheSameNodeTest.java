package com.lun.swordtowardoffer;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lun.util.SinglyLinkedList.ListNode;

public class FindTheSameNodeTest {

	private static ListNode list1;
	private static ListNode list2;
	
	private static ListNode same;
	
	static {
		same = new ListNode(6);
		same.next = new ListNode(7);
		
		list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
		list1.next.next.next = same;
		
		list2 = new ListNode(4);
		list2.next = new ListNode(5);
		list2.next.next = same;
	}
	
	@Test
	public void testFind() {		
		FindTheSameNode fn = new FindTheSameNode();
		assertEquals(6, fn.find(list1, list2).val);
		assertEquals(same, fn.find(list1, list2));
	}

	@Test
	public void testCount() {
		FindTheSameNode fn = new FindTheSameNode();
		
		assertEquals(5, fn.count(list1));
		assertEquals(4, fn.count(list2));
	}

}
