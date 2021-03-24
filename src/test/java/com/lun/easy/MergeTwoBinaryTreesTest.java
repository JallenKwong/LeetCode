package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class MergeTwoBinaryTreesTest {


	@Test
	public void test1() {

		MergeTwoBinaryTrees obj = new MergeTwoBinaryTrees();
		TreeNode[] trees = makeTrees();
		TreeNode result = obj.mergeTrees1(trees[0], trees[1]);
		
		assertTrue(BinaryTree.equals(trees[2], result));
	}
	
	@Test
	public void test2() {
		
		MergeTwoBinaryTrees obj = new MergeTwoBinaryTrees();
		TreeNode[] trees = makeTrees();
		TreeNode result = obj.mergeTrees2(trees[0], trees[1]);
		
		assertTrue(BinaryTree.equals(trees[2], result));
	}
	
	@Test
	public void test3() {
		
		MergeTwoBinaryTrees obj = new MergeTwoBinaryTrees();
		TreeNode[] trees = makeTrees();
		TreeNode result = obj.mergeTrees2(trees[0], trees[1]);
		
		assertTrue(BinaryTree.equals(trees[2], result));
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
		
		TreeNode expected = new TreeNode(3);
		expected.left = new TreeNode(4);
		expected.right = new TreeNode(5);
		
		expected.left.left = new TreeNode(5);
		expected.left.right = new TreeNode(4);
		
		expected.right.right = new TreeNode(7);
		
		return new TreeNode[]{root1, root2, expected};
	}
}
