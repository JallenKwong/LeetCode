package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lun.util.SinglyLinkedList;
import com.lun.util.SinglyLinkedList.ListNode;

public class ReverseListTest {

	@Test
	public void testReverse() {
		ReverseList rl = new ReverseList();
		
		ListNode raw = SinglyLinkedList.intArray2List(new int[] {1, 2, 3, 4, 5, 6, 7});
		ListNode expected = SinglyLinkedList.intArray2List(new int[] {7, 6, 5, 4, 3, 2, 1});
		
		assertTrue(SinglyLinkedList.areTwoListEqual(rl.reverse(raw), expected));
		
		//---
		
		raw = SinglyLinkedList.intArray2List(new int[] {1});
		expected = SinglyLinkedList.intArray2List(new int[] {1});
		assertTrue(SinglyLinkedList.areTwoListEqual(rl.reverse(raw), expected));
		
		//---
		
		raw = SinglyLinkedList.intArray2List(new int[] {1, 2});
		expected = SinglyLinkedList.intArray2List(new int[] {2, 1});
		assertTrue(SinglyLinkedList.areTwoListEqual(rl.reverse(raw), expected));

		//---
		
		assertNull(rl.reverse(null));
		
	}
	
	@Test
	public void testReverse2() {
		ReverseList rl = new ReverseList();
		
		ListNode raw = SinglyLinkedList.intArray2List(new int[] {1, 2, 3, 4, 5, 6, 7});
		ListNode expected = SinglyLinkedList.intArray2List(new int[] {7, 6, 5, 4, 3, 2, 1});
		
		
		//System.out.println(SinglyLinkedList.print(rl.reverse2(raw)));
		assertTrue(SinglyLinkedList.areTwoListEqual(rl.reverse2(raw), expected));
		
		//---
		
		raw = SinglyLinkedList.intArray2List(new int[] {1});
		expected = SinglyLinkedList.intArray2List(new int[] {1});
		assertTrue(SinglyLinkedList.areTwoListEqual(rl.reverse2(raw), expected));
		
		//---
		
		raw = SinglyLinkedList.intArray2List(new int[] {1, 2});
		expected = SinglyLinkedList.intArray2List(new int[] {2, 1});
		assertTrue(SinglyLinkedList.areTwoListEqual(rl.reverse2(raw), expected));
		
		//---
		
		assertNull(rl.reverse2(null));
		
	}

}
