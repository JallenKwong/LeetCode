package com.lun.medium;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import com.lun.util.SinglyLinkedList.ListNode;

public class LinkedListCycleIITest {

	@Test
	public void test() {
		LinkedListCycleII obj = new LinkedListCycleII();

		ListNode node1 = new ListNode(3), node2 = new ListNode(2), 
				node3 = new ListNode(0), node4 = new ListNode(-4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;
		
		assertEquals(node2, obj.detectCycle1(node1));
		assertEquals(node2, obj.detectCycle1(node2));
	}
	
	@Test
	public void test2() {
		LinkedListCycleII obj = new LinkedListCycleII();
		ListNode node1 = new ListNode(1), node2 = new ListNode(2);
		
		node1.next = node2;
		node2.next = node1;
		
		assertEquals(node1, obj.detectCycle1(node1));
		assertEquals(node1, obj.detectCycle2(node1));
	}
	
	@Test
	public void test3() {
		LinkedListCycleII obj = new LinkedListCycleII();
		ListNode node1 = new ListNode(1);
		
		assertNull(obj.detectCycle1(node1));
		assertNull(obj.detectCycle2(node1));
	}
	
	
	@Test
	public void testCount() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		LinkedListCycleII obj = new LinkedListCycleII();
		
		ListNode node1 = new ListNode(3), node2 = new ListNode(2), 
				node3 = new ListNode(0), node4 = new ListNode(-4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;
		
		Method countMethod = obj.getClass()
				.getDeclaredMethod("count", ListNode.class);
		countMethod.setAccessible(true);
		assertEquals(3, countMethod.invoke(obj, node3));
		
		node1 = new ListNode(1); 
		node1.next = node1;
		assertEquals(1, countMethod.invoke(obj, node1));
	}
	
}
