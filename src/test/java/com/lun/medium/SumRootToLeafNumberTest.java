package com.lun.medium;

import org.junit.Assert;
import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;


public class SumRootToLeafNumberTest {

	@Test
	public void test() {
		TreeNode root = BinaryTree.integerArray2BinaryTree(new int[]{1, 2, 3});
		BinaryTree.inorderTraversing(root);
	}
	
	@Test
	public void test2() {
		TreeNode root = BinaryTree.integerArray2BinaryTree(new int[]{4, 9, 0, 5, 1});
		BinaryTree.inorderTraversing(root);
	}
	
	@Test
	public void test3() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		SumRootToLeafNumber sn = new SumRootToLeafNumber();
		
		Assert.assertEquals(25, sn.sumNumbers(root));
		Assert.assertEquals(25, sn.sumNumbers2(root));
	}
	
	@Test
	public void test4() {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(9);
		root.right = new TreeNode(0);
		
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(1);
		
		SumRootToLeafNumber sn = new SumRootToLeafNumber();
		Assert.assertEquals(1026, sn.sumNumbers(root));
		Assert.assertEquals(1026, sn.sumNumbers2(root));
	}
	
	
}
