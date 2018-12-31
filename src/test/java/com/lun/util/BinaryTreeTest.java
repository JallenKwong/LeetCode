package com.lun.util;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;


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
		TreeNode root = BinaryTree.integerArray2BinaryTree(new int[] {600,424,612,499,689});
		
		assertEquals("600,424,499,612,689", BinaryTree.preorderTraversing(root));
		assertEquals("424,499,600,612,689", BinaryTree.inorderTraversing(root));
		assertEquals("499,424,689,612,600", BinaryTree.postTraversing(root));
		
	}
	
	@Test
	public void testEquals() {
		TreeNode root1 = null;
		TreeNode root2 = null;
		assertTrue(BinaryTree.equals(root1, root2));
		
		root1 = BinaryTree.integerArray2BinaryTree(new int[] {600,424,612,499,689});
		root2 = BinaryTree.integerArray2BinaryTree(new int[] {600,424,612,499,689});
		assertTrue(BinaryTree.equals(root1, root2));

		root1 = BinaryTree.integerArray2BinaryTree(new int[] {600,424,612,499,689});
		root2 = BinaryTree.integerArray2BinaryTree(new int[] {600,424,612,499});
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
		
		root1 = BinaryTree.integerArray2BinaryTree(new int[] {600,424,612,499,689});
		root2 = BinaryTree.integerArray2BinaryTree(new int[] {600,612,499,689});
		assertFalse(BinaryTree.equals(root1, root2));
		
		root1 = BinaryTree.integerArray2BinaryTree(new int[] {1,2,3,4,5});
		root2 = BinaryTree.integerArray2BinaryTree(new int[] {1,2,3,4,5});
		assertTrue(BinaryTree.equals(root1, root2));
		
		root1 = BinaryTree.integerArray2BinaryTree(new int[] {1,2,3,4,5});
		root2 = BinaryTree.integerArray2BinaryTree(new int[] {1,2,4,5});
		assertFalse(BinaryTree.equals(root1, root2));
		
		root1 = BinaryTree.integerArray2BinaryTree(new int[] {1,2,3,4,5});
		root2 = BinaryTree.integerArray2BinaryTree(new int[] {3,4,5,1,2});
		assertFalse(BinaryTree.equals(root1, root2));
		
	}
	
	
	
}
