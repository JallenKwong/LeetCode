package com.lun.hard;

import static org.junit.Assert.*;
import static com.lun.util.SinglyLinkedList.*;

import org.junit.Test;

public class ReverseNodesInKGroupTest {

	@Test
	public void test() {
		ReverseNodesInKGroup obj = new ReverseNodesInKGroup();

		assertTrue(areTwoListEqual(obj.reverseKGroup1(ints2List(1, 2, 3), 3), //
				ints2List(3, 2, 1)));

		assertTrue(areTwoListEqual(obj.reverseKGroup1(ints2List(1, 2, 3, 4, 5), 2), //
				ints2List(2, 1, 4, 3, 5)));

		assertTrue(areTwoListEqual(obj.reverseKGroup1(ints2List(1, 2, 3, 4, 5), 3), //
				ints2List(3, 2, 1, 4, 5)));

		assertTrue(areTwoListEqual(obj.reverseKGroup1(ints2List(1, 2, 3, 4, 5), 1), //
				ints2List(1, 2, 3, 4, 5)));

		assertTrue(areTwoListEqual(obj.reverseKGroup1(ints2List(1), 1), //
				ints2List(1)));
	}

	@Test
	public void test2() {
		ReverseNodesInKGroup obj = new ReverseNodesInKGroup();

		assertTrue(areTwoListEqual2(obj.reverseKGroup2(ints2List(1, 2, 3), 2), //
				ints2List(2, 1, 3)));

		assertTrue(areTwoListEqual2(obj.reverseKGroup2(ints2List(1, 2, 3), 3), //
				ints2List(3, 2, 1)));

		assertTrue(areTwoListEqual2(obj.reverseKGroup2(ints2List(1, 2, 3, 4, 5), 2), //
				ints2List(2, 1, 4, 3, 5)));

		assertTrue(areTwoListEqual2(obj.reverseKGroup2(ints2List(1, 2, 3, 4, 5), 3), //
				ints2List(3, 2, 1, 4, 5)));

		assertTrue(areTwoListEqual2(obj.reverseKGroup2(ints2List(1, 2, 3, 4, 5), 1), //
				ints2List(1, 2, 3, 4, 5)));

		assertTrue(areTwoListEqual2(obj.reverseKGroup2(ints2List(1), 1), //
				ints2List(1)));

		assertTrue(areTwoListEqual2(obj.reverseKGroup2(ints2List(1, 2, 3, 4, 5, 6), 2), //
				ints2List(2, 1, 4, 3, 6, 5)));
	}
}
