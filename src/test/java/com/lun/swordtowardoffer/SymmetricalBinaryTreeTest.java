package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class SymmetricalBinaryTreeTest {

	@Test
	public void testIsSymmetrical() {
		
		SymmetricalBinaryTree st = new SymmetricalBinaryTree();
		
		TreeNode tree = new TreeNode(8);
		
		tree.left = new TreeNode(6);
		tree.right = new TreeNode(6);
		
		tree.left.left = new TreeNode(5);
		tree.left.right = new TreeNode(7);

		tree.right.left = new TreeNode(7);
		tree.right.right = new TreeNode(5);
				
		assertTrue(st.isSymmetrical(tree));
		
	}
	
	@Test
	public void testIsSymmetrical2() {
		
		SymmetricalBinaryTree st = new SymmetricalBinaryTree();
		
		TreeNode tree = new TreeNode(8);
		
		tree.left = new TreeNode(6);
		tree.right = new TreeNode(9);
		
		tree.left.left = new TreeNode(5);
		tree.left.right = new TreeNode(7);

		tree.right.left = new TreeNode(7);
		tree.right.right = new TreeNode(5);
				
		assertFalse(st.isSymmetrical(tree));
		
	}
	
	@Test
	public void testIsSymmetrical3() {
		
		SymmetricalBinaryTree st = new SymmetricalBinaryTree();
		
		TreeNode tree = new TreeNode(7);
		
		tree.left = new TreeNode(7);
		tree.right = new TreeNode(7);
		
		tree.left.left = new TreeNode(7);
		tree.left.right = new TreeNode(7);

		tree.right.left = new TreeNode(7);
				
		assertFalse(st.isSymmetrical(tree));
		
	}
}
