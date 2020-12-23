package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.SinglyLinkedList.ListNode;

public class IntersectionOfTwoLinkedListsTest {

	@Test
	public void test1() {
		IntersectionOfTwoLinkedLists obj = new IntersectionOfTwoLinkedLists();
		
		ListNode a1 = new ListNode(4),
				a2 = new ListNode(1),
				ab1 = new ListNode(8),
				ab2 = new ListNode(4),
				ab3 = new ListNode(5),
				b1 = new ListNode(5),
				b2 = new ListNode(6),
				b3 = new ListNode(1);
		
		a1.next = a2;
		a2.next = ab1;
		
		ab1.next = ab2;
		ab2.next = ab3;
		
		b1.next = b2;
		b2.next = b3;
		b3.next = ab1;
				
		assertEquals(ab1, obj.getIntersectionNode1(a1, b1));
		assertEquals(ab1, obj.getIntersectionNode2(a1, b1));
		assertEquals(ab1, obj.getIntersectionNode3(a1, b1));
	}
	
	@Test
	public void test2() {
		IntersectionOfTwoLinkedLists obj = new IntersectionOfTwoLinkedLists();
		
		ListNode a1 = new ListNode(1),
				a2 = new ListNode(9),
				a3 = new ListNode(1),
				ab1 = new ListNode(2),
				ab2 = new ListNode(4),
				b1 = new ListNode(3);
		
		a1.next = a2;
		a2.next = a3;
		
		a3.next = ab1;
		ab1.next = ab2;
		
		b1.next = ab1;
		
		assertEquals(ab1, obj.getIntersectionNode1(a1, b1));
		assertEquals(ab1, obj.getIntersectionNode2(a1, b1));
		assertEquals(ab1, obj.getIntersectionNode3(a1, b1));
	}
	
	@Test
	public void test3() {
		IntersectionOfTwoLinkedLists obj = new IntersectionOfTwoLinkedLists();
		ListNode a1 = new ListNode(2, new ListNode(6, new ListNode(4)));
		ListNode b2 = new ListNode(1, new ListNode(5));
		
		assertNull(obj.getIntersectionNode1(a1, b2));
		assertNull(obj.getIntersectionNode2(a1, b2));
		assertNull(obj.getIntersectionNode3(a1, b2));
	}
	
	@Test
	public void test4() {
		IntersectionOfTwoLinkedLists obj = new IntersectionOfTwoLinkedLists();
		ListNode a1 = new ListNode(1);
		ListNode b1 = a1; 
		
		assertEquals(a1, obj.getIntersectionNode1(a1, b1));
		assertEquals(a1, obj.getIntersectionNode2(a1, b1));
		assertEquals(a1, obj.getIntersectionNode3(a1, b1));
	}
	
}
