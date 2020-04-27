package com.lun.swordtowardoffer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class PrintBinaryTreeByLevel3Test {

	@Test
	public void testPrint() {
		TreeNode root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		root.left.left.left = new TreeNode(8);
		root.left.left.right = new TreeNode(9);
		
		root.left.right.left = new TreeNode(10);
		root.left.right.right = new TreeNode(11);
		
		root.right.left.left = new TreeNode(12);
		root.right.left.right = new TreeNode(13);
				
		root.right.right.left = new TreeNode(14);
		root.right.right.right = new TreeNode(15);
				
				
		PrintBinaryTreeByLevel3 pl = new PrintBinaryTreeByLevel3();
		assertEquals("1\n3 2\n4 5 6 7\n15 14 13 12 11 10 9 8", pl.print(root));
	}
	
}
