package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.SinglyLinkedList;

public class RemoveDuplicatesFromSortedListTest {

	@Test
	public void test() {
		RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();

		int[] array1 = {1, 1, 2};
		int[] expected1 = {1, 2};
		
		assertTrue(SinglyLinkedList.areTwoListEqual(SinglyLinkedList.intArray2List(expected1), 
				obj.deleteDuplicates1(SinglyLinkedList.intArray2List(array1))));
		assertTrue(SinglyLinkedList.areTwoListEqual(SinglyLinkedList.intArray2List(expected1), 
				obj.deleteDuplicates2(SinglyLinkedList.intArray2List(array1))));
		assertTrue(SinglyLinkedList.areTwoListEqual(SinglyLinkedList.intArray2List(expected1), 
				obj.deleteDuplicates3(SinglyLinkedList.intArray2List(array1))));
		
		
		int[] array2 = {1, 1, 2, 3, 3};
		int[] expected2 = {1, 2, 3};
		
		assertTrue(SinglyLinkedList.areTwoListEqual(SinglyLinkedList.intArray2List(expected2), 
				obj.deleteDuplicates1(SinglyLinkedList.intArray2List(array2))));
		assertTrue(SinglyLinkedList.areTwoListEqual(SinglyLinkedList.intArray2List(expected2), 
				obj.deleteDuplicates2(SinglyLinkedList.intArray2List(array2))));
		assertTrue(SinglyLinkedList.areTwoListEqual(SinglyLinkedList.intArray2List(expected2), 
				obj.deleteDuplicates3(SinglyLinkedList.intArray2List(array2))));
		
		
	}
}
