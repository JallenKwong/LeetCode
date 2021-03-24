package com.lun.util;

import static org.junit.Assert.*;
import static com.lun.util.BinaryTree.*;

import org.junit.Test;



public class BinaryTreeTest {

	/**
	 * 检测前序遍历、中序遍历、后序遍历
	 */
	@Test
	public void test() {
		
		//  600
		// /   \
		//424  612
		// \    /
		// 499 689
		//
		TreeNode root = integerArray2BinarySearchTree(new int[] {600,424,612,499,689});
		
		assertEquals("600,424,499,612,689", preorderTraversing(root));
		assertEquals("424,499,600,612,689", inorderTraversing(root));
		assertEquals("499,424,689,612,600", postTraversing(root));
		
	}
	
	@Test
	public void testEquals() {
		TreeNode root1 = null;
		TreeNode root2 = null;
		assertTrue(BinaryTree.equals(root1, root2));
		
		root1 = integerArray2BinarySearchTree(new int[] {600,424,612,499,689});
		root2 = integerArray2BinarySearchTree(new int[] {600,424,612,499,689});
		assertTrue(BinaryTree.equals(root1, root2));

		root1 = integerArray2BinarySearchTree(new int[] {600,424,612,499,689});
		root2 = integerArray2BinarySearchTree(new int[] {600,424,612,499});
		assertFalse(BinaryTree.equals(root1, root2));
			
		//	1
		// /
		// 2
		root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		
		//	1
		// / \
		//2   3
		root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
			
		assertFalse(BinaryTree.equals(root1, root2));
		
		root1 = integerArray2BinarySearchTree(new int[] {600,424,612,499,689});
		root2 = integerArray2BinarySearchTree(new int[] {600,612,499,689});
		assertFalse(BinaryTree.equals(root1, root2));
		
		root1 = integerArray2BinarySearchTree(new int[] {1,2,3,4,5});
		root2 = integerArray2BinarySearchTree(new int[] {1,2,3,4,5});
		assertTrue(BinaryTree.equals(root1, root2));
		
		root1 = integerArray2BinarySearchTree(new int[] {1,2,3,4,5});
		root2 = integerArray2BinarySearchTree(new int[] {1,2,4,5});
		assertFalse(BinaryTree.equals(root1, root2));
		
		root1 = integerArray2BinarySearchTree(new int[] {1,2,3,4,5});
		root2 = integerArray2BinarySearchTree(new int[] {3,4,5,1,2});
		assertFalse(BinaryTree.equals(root1, root2));
		
	}
	
	@Test
	public void testIntegerArray2BinaryTree() {
		TreeNode[] expecteds = makeTrees();
		
		assertTrue(BinaryTree.equals(expecteds[0], integers2BinaryTree(1, 3, 2, 5)));
		assertTrue(BinaryTree.equals(expecteds[1], integers2BinaryTree(2, 1, 3, null, 4, null, 7)));
		assertTrue(BinaryTree.equals(expecteds[2], integers2BinaryTree(3, 4, 5, 5, 4, null, 7)));
		
	}
	
	private TreeNode[] makeTrees() {
		TreeNode root1 = new TreeNode(1);
		
		root1.left = new TreeNode(3);
		root1.right = new TreeNode(2);
		
		root1.left.left = new TreeNode(5);
		
		//---
		
		TreeNode root2 = new TreeNode(2);
		root2.left = new TreeNode(1);
		root2.right = new TreeNode(3);
		
		root2.left.right = new TreeNode(4);
		root2.right.right = new TreeNode(7);
		
		//---
		
		TreeNode root3 = new TreeNode(3);
		root3.left = new TreeNode(4);
		root3.right = new TreeNode(5);
		
		root3.left.left = new TreeNode(5);
		root3.left.right = new TreeNode(4);
		
		root3.right.right = new TreeNode(7);
		
		return new TreeNode[]{root1, root2, root3};
	}
	
}
