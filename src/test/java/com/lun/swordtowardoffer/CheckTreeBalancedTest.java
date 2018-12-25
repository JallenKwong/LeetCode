package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;


public class CheckTreeBalancedTest {

	public static TreeNode makeATree() {
		TreeNode root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(5);
		
		root.right.right = new TreeNode(3);
		return root;
	}
	
	@Test
	public void testCheck() {
		CheckTreeBalanced cb = new CheckTreeBalanced();
		assertTrue(cb.check(makeATree()));
		
	}

}
