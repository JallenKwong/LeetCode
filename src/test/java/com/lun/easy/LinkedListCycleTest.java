package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.SinglyLinkedList.ListNode;

public class LinkedListCycleTest {

	@Test
	public void test1() {
		LinkedListCycle obj = new LinkedListCycle();
		ListNode node1 = new ListNode(3), node2 = new ListNode(2), 
				node3 = new ListNode(0), node4 = new ListNode(-4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;
		
		assertTrue(obj.hasCycle1(node1));
		assertTrue(obj.hasCycle2(node1));
	}
	
	@Test
	public void test2() {
		LinkedListCycle obj = new LinkedListCycle();
		ListNode node1 = new ListNode(1), node2 = new ListNode(2);
		
		node1.next = node2;
		node2.next = node1;
		
		assertTrue(obj.hasCycle1(node1));
		assertTrue(obj.hasCycle2(node1));
	}
	
	@Test
	public void test3() {
		LinkedListCycle obj = new LinkedListCycle();
		ListNode node1 = new ListNode(1);
		
		assertFalse(obj.hasCycle1(node1));
		assertFalse(obj.hasCycle2(node1));
	}
	
	
	
}
