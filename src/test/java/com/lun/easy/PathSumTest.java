package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class PathSumTest {

	@Test
	public void test1() {
		PathSum obj = new PathSum();

		TreeNode root = new TreeNode(5);
		
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		
		root.left.left = new TreeNode(11);
		
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		
		root.right.right.right = new TreeNode(1);

		assertTrue(obj.hasPathSum1(root, 22));
		assertTrue(obj.hasPathSum2(root, 22));
		assertTrue(obj.hasPathSum3(root, 22));
	}
	
	@Test
	public void test2() {
		PathSum obj = new PathSum();
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		
		assertFalse(obj.hasPathSum1(root, 1));
		assertFalse(obj.hasPathSum2(root, 1));
		assertFalse(obj.hasPathSum3(root, 1));
	}
}
