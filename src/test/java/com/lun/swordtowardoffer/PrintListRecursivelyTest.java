package com.lun.swordtowardoffer;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lun.util.SinglyLinkedList;

public class PrintListRecursivelyTest {

	@Test
	public void testPrintListNode() {
		PrintListRecursively pr = new PrintListRecursively();
		assertEquals("3,2,1", pr.print(SinglyLinkedList.intArray2List(new int[] {1,2,3})));
		assertEquals("1", pr.print(SinglyLinkedList.intArray2List(new int[] {1})));
		
		assertEquals("3,2,1", pr.print2(SinglyLinkedList.intArray2List(new int[] {1,2,3})));
		assertEquals("1", pr.print2(SinglyLinkedList.intArray2List(new int[] {1})));
	}

}
