package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lun.util.SinglyLinkedList;
import com.lun.util.SinglyLinkedList.ListNode;

public class FindKthToTailTest {

	@Test
	public void testFind() {
		
		FindKthToTail ft = new FindKthToTail();
		
		
		ListNode list = SinglyLinkedList.intArray2List(new int[] {1,2,3,4,5,6});
		
		ListNode list2 = ft.find(list, 3);
		assertEquals(4, list2.val);
		
	}
	
	@Test
	public void testFind2() {
		
		FindKthToTail ft = new FindKthToTail();
		
		ListNode list = SinglyLinkedList.intArray2List(new int[] {1,2,3,4,5,6});
		
		ListNode list2 = ft.find2(list, 3);
		assertEquals(4, list2.val);
		
		list2 = ft.find2(list, 6);
		assertEquals(1, list2.val);

		list2 = ft.find2(list, 1);
		assertEquals(6, list2.val);
		
		list2 = ft.find2(list, 7);
		assertNull(list2);
		
		list2 = ft.find2(list, 98);
		assertNull(list2);
		
		
		list = SinglyLinkedList.intArray2List(new int[] {1});
		
		list2 = ft.find2(list, 1);
		assertEquals(1, list2.val);
	}
	
	@Test
	public void testFind3() {
		
		FindKthToTail ft = new FindKthToTail();
		
		ListNode list = SinglyLinkedList.intArray2List(new int[] {1,2,3,4,5,6});
		
		ListNode list2 = ft.find3(list, 3);
		assertEquals(4, list2.val);
		
		list2 = ft.find3(list, 6);
		assertEquals(1, list2.val);
		
		list2 = ft.find3(list, 1);
		assertEquals(6, list2.val);
		
		list2 = ft.find3(list, 7);
		assertNull(list2);
		
		list2 = ft.find3(list, 98);
		assertNull(list2);
		
		
		list = SinglyLinkedList.intArray2List(new int[] {1});
		
		list2 = ft.find3(list, 1);
		assertEquals(1, list2.val);
	}

}
