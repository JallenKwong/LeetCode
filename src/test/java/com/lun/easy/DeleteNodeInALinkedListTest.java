package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.SinglyLinkedList;
import com.lun.util.SinglyLinkedList.ListNode;

public class DeleteNodeInALinkedListTest {

	@Test
	public void test1() {
		DeleteNodeInALinkedList obj = new DeleteNodeInALinkedList();
		
		ListNode node1 = new ListNode(4),
				node2 = new ListNode(5),
				node3 = new ListNode(1),
				node4 = new ListNode(9);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		obj.deleteNode1(node2);
		assertEquals("4 -> 1 -> 9", SinglyLinkedList.print(node1));
	}
	
	@Test
	public void test1_2() {
		DeleteNodeInALinkedList obj = new DeleteNodeInALinkedList();
		
		ListNode node1 = new ListNode(4),
				node2 = new ListNode(5),
				node3 = new ListNode(1),
				node4 = new ListNode(9);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		obj.deleteNode2(node2);
		assertEquals("4 -> 1 -> 9", SinglyLinkedList.print(node1));
	}

	@Test
	public void test2() {
		DeleteNodeInALinkedList obj = new DeleteNodeInALinkedList();

		ListNode node1 = new ListNode(4),
				node2 = new ListNode(5),
				node3 = new ListNode(1),
				node4 = new ListNode(9);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		obj.deleteNode1(node3);
		
		assertEquals("4 -> 5 -> 9", SinglyLinkedList.print(node1));
		
	}
	
	@Test
	public void test2_2() {
		DeleteNodeInALinkedList obj = new DeleteNodeInALinkedList();
		
		ListNode node1 = new ListNode(4),
				node2 = new ListNode(5),
				node3 = new ListNode(1),
				node4 = new ListNode(9);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		obj.deleteNode2(node3);
		
		assertEquals("4 -> 5 -> 9", SinglyLinkedList.print(node1));
	}
	
	@Test
	public void test3() {
		DeleteNodeInALinkedList obj = new DeleteNodeInALinkedList();
		
		ListNode node1 = new ListNode(1),
				node2 = new ListNode(2),
				node3 = new ListNode(3),
				node4 = new ListNode(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		obj.deleteNode1(node3);
		
		assertEquals("1 -> 2 -> 4", SinglyLinkedList.print(node1));
		
	}
	
	@Test
	public void test4() {
		DeleteNodeInALinkedList obj = new DeleteNodeInALinkedList();
		
		ListNode node1 = new ListNode(0),
				node2 = new ListNode(1);
		
		node1.next = node2;
		
		obj.deleteNode1(node1);
		
		assertEquals("1", SinglyLinkedList.print(node1));
		
	}
	
	@Test
	public void test5() {
		DeleteNodeInALinkedList obj = new DeleteNodeInALinkedList();
		
		ListNode node1 = new ListNode(-3),
				node2 = new ListNode(5),
				node3 = new ListNode(-99);
		
		node1.next = node2;
		node2.next = node3;
		
		obj.deleteNode1(node1);
		
		assertEquals("5 -> -99", SinglyLinkedList.print(node1));
		
	}
}
