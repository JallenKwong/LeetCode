package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class LowestCommonAncestorOfABinarySearchTreeTest {

	@Test
	public void test() {
		LowestCommonAncestorOfABinarySearchTree obj = new LowestCommonAncestorOfABinarySearchTree();
		
		TreeNode root = new TreeNode(6);
		
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(4);
		
		root.left.right.left = new TreeNode(3);
		root.left.right.right = new TreeNode(5);
		
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);
		
		assertEquals(6, obj.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)).val);
		assertEquals(2, obj.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)).val);
		
	}
}
