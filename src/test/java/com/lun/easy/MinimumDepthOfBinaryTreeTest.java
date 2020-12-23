package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class MinimumDepthOfBinaryTreeTest {

	@Test
	public void test1() {
		MinimumDepthOfBinaryTree obj = new MinimumDepthOfBinaryTree();

		TreeNode root = new TreeNode(3);
		
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		assertEquals(2, obj.minDepth1(root));
		assertEquals(2, obj.minDepth2(root));
	}
	
	@Test
	public void test2() {
		MinimumDepthOfBinaryTree obj = new MinimumDepthOfBinaryTree();
		
		TreeNode root = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(5);
		root.right.right.right.right = new TreeNode(6);

		assertEquals(5, obj.minDepth1(root));
		assertEquals(5, obj.minDepth2(root));
	}
}
