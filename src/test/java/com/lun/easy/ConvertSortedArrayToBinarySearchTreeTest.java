package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class ConvertSortedArrayToBinarySearchTreeTest {

	@Test
	public void test() {
		ConvertSortedArrayToBinarySearchTree obj = new ConvertSortedArrayToBinarySearchTree();

		int[] array = {-10, -3, 0, 5, 9};
		
		TreeNode expected = new TreeNode(0);
		
		expected.left = new TreeNode(-3);
		expected.right = new TreeNode(9);
		
		expected.left.left = new TreeNode(-10);
		expected.right.left = new TreeNode(5);
		
		assertTrue(BinaryTree.equals(expected, obj.sortedArrayToBST1(array)));
		assertTrue(BinaryTree.equals(expected, obj.sortedArrayToBST2(array)));
		assertTrue(BinaryTree.equals(expected, obj.sortedArrayToBST3(array)));
		assertTrue(BinaryTree.equals(expected, obj.sortedArrayToBST4(array)));
	}
}
