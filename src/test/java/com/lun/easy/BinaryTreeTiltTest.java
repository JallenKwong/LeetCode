package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree;

public class BinaryTreeTiltTest {

	@Test
	public void test() {
		BinaryTreeTilt obj = new BinaryTreeTilt();

		assertEquals(1, obj.findTilt(BinaryTree.integers2BinaryTree(1, 2, 3)));
		assertEquals(15, obj.findTilt(BinaryTree.integers2BinaryTree(4, 2, 9, 3, 5, null, 7)));
		assertEquals(9, obj.findTilt(BinaryTree.integers2BinaryTree(21, 7, 14, 1, 1, 2, 2, 3, 3)));
	}
	
}
