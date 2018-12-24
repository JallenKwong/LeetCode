package com.lun.swordtowardoffer;

import org.junit.Test;

import com.lun.swordtowardoffer.GetDepthOfBinaryTree.BinaryTreeNode;

import static org.junit.Assert.*;

public class GetDepthOfBinaryTreeTest {
	
	@Test
	public void test() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		
		root.left = new BinaryTreeNode(2);
		root.right = new BinaryTreeNode(3);
		
		root.left.left = new BinaryTreeNode(4);
		root.left.right = new BinaryTreeNode(5);
		root.left.right.left = new BinaryTreeNode(5);
		
		root.right.right = new BinaryTreeNode(3);
		
		assertEquals(4, new GetDepthOfBinaryTree().getDepthOfBinaryTree(root));
	}
}
