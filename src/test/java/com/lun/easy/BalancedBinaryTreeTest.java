package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class BalancedBinaryTreeTest {

	@Test
	public void test1() {
		BalancedBinaryTree obj = new BalancedBinaryTree();
		TreeNode root = new TreeNode(3);
		
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		assertTrue(obj.isBalanced1(root));
		assertTrue(obj.isBalanced2(root));
	}
	
	@Test
	public void test2() {
		BalancedBinaryTree obj = new BalancedBinaryTree();
		TreeNode root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(3);
		
		root.left.left.left = new TreeNode(4);
		root.left.left.right = new TreeNode(4);

		assertFalse(obj.isBalanced1(root));
		assertFalse(obj.isBalanced2(root));
	}
	
	@Test
	public void test3() {
		BalancedBinaryTree obj = new BalancedBinaryTree();
		TreeNode root = null;
		
		assertTrue(obj.isBalanced1(root));
		assertTrue(obj.isBalanced2(root));
	}
	
}
