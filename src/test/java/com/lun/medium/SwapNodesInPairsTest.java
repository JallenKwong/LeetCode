package com.lun.medium;

import static org.junit.Assert.*;
import static com.lun.util.SinglyLinkedList.*;
import org.junit.Test;


public class SwapNodesInPairsTest {

	@Test
	public void test() {
		SwapNodesInPairs obj = new SwapNodesInPairs();
		
		assertTrue(areTwoListEqual(obj.swapPairs1(ints2List(1, 2, 3, 4)), ints2List(2, 1, 4, 3)));
		assertTrue(areTwoListEqual(obj.swapPairs1(ints2List(1, 2, 3, 4, 5)), ints2List(2, 1, 4, 3, 5)));
		assertNull(obj.swapPairs1(null));
		assertTrue(areTwoListEqual(obj.swapPairs1(ints2List(1)), ints2List(1)));
		
		assertTrue(areTwoListEqual(obj.swapPairs2(ints2List(1, 2, 3, 4)), ints2List(2, 1, 4, 3)));
		assertTrue(areTwoListEqual(obj.swapPairs2(ints2List(1, 2, 3, 4, 5)), ints2List(2, 1, 4, 3, 5)));
		assertNull(obj.swapPairs2(null));
		assertTrue(areTwoListEqual(obj.swapPairs2(ints2List(1)), ints2List(1)));
	}
}
