package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class MaximumDepthOfBinaryTreeTest {

	@Test
	public void test1() {
		MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();

		TreeNode root = new TreeNode(3);
		
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		assertEquals(3, obj.maxDepth1(root));
		assertEquals(3, obj.maxDepth2(root));
		assertEquals(3, obj.maxDepth3(root));
	}
	
	@Test
	public void test2() {
		MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();
		TreeNode root = new TreeNode(1);		
		root.right = new TreeNode(2);
		
		assertEquals(2, obj.maxDepth1(root));
		assertEquals(2, obj.maxDepth2(root));
		assertEquals(2, obj.maxDepth3(root));
	}
	
	@Test
	public void test3() {
		MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();
		TreeNode root = null;
		
		assertEquals(0, obj.maxDepth1(root));
		assertEquals(0, obj.maxDepth2(root));
		assertEquals(0, obj.maxDepth3(root));
	}
	
	@Test
	public void test4() {
		MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();
		TreeNode root = new TreeNode(0);
		
		assertEquals(1, obj.maxDepth1(root));
		assertEquals(1, obj.maxDepth2(root));
		assertEquals(1, obj.maxDepth3(root));
	}
}
