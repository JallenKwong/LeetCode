package com.lun.medium;

import static org.junit.Assert.*;
import static com.lun.util.SinglyLinkedList.*;


import org.junit.Test;

import com.lun.util.SinglyLinkedList.ListNode;


public class AddTwoNumbersTest {

	@Test
	public void testTransform() {
		assertTrue(areTwoListEqual(ints2List(1), transform(1)));
		assertTrue(areTwoListEqual(ints2List(9, 8, 7, 6, 9, 8, 7, 6), transform(67896789)));
		assertTrue(areTwoListEqual(ints2List(3, 2, 1), transform(123)));
	}
	
	@Test
	public void testAddTwoNumbers() {
		AddTwoNumbers an = new AddTwoNumbers();

		assertTrue(areTwoListEqual(ints2List(2, 2, 2), an.addTwoNumbers1(transform(111), transform(111))));
		assertTrue(areTwoListEqual(ints2List(7, 0, 8), an.addTwoNumbers1(transform(342), transform(465))));
		assertTrue(areTwoListEqual(ints2List(0, 0, 0, 1), an.addTwoNumbers1(transform(990), transform(10))));

		assertTrue(areTwoListEqual(ints2List(2, 2, 2), an.addTwoNumbers2(transform(111), transform(111))));
		assertTrue(areTwoListEqual(ints2List(7, 0, 8), an.addTwoNumbers2(transform(342), transform(465))));
		assertTrue(areTwoListEqual(ints2List(0, 0, 0, 1), an.addTwoNumbers2(transform(990), transform(10))));
		
	}
	
	//将整数转换成链表
	private ListNode transform(int from) {
		
		//个位
		int digit = from % 10;
		ListNode tail = new ListNode(digit);
		ListNode head = tail;
		from = (from - digit) / 10; 
		
		while(from > 0) {
			digit = from % 10;
			tail.next = new ListNode(digit);
			tail = tail.next;
			from = (from - digit) / 10; 
		}
		
		return head;
	}
}
