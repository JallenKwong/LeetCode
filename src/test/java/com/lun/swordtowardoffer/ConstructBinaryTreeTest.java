package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class ConstructBinaryTreeTest {

	@Test
	public void test() {
		ConstructBinaryTree cbt = new ConstructBinaryTree();
		TreeNode actual = cbt.construct(new int[] {1,2,4,7,3,5,6,8}, new int[] {4,7,2,1,5,3,8,6});
		
		TreeNode expected = new TreeNode(1);
		
		expected.left = new TreeNode(2);
		expected.left.left = new TreeNode(4);
		expected.left.left.right = new TreeNode(7);
		
		expected.right = new TreeNode(3);
		expected.right.left = new TreeNode(5);
		expected.right.right = new TreeNode(6);
		expected.right.right.left = new TreeNode(8);
		
		assertTrue(BinaryTree.equals(expected, actual));
	}

}
