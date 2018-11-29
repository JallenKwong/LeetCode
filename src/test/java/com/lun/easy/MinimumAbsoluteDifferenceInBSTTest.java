package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;


public class MinimumAbsoluteDifferenceInBSTTest {

	@Test
	public void test() {
		MinimumAbsoluteDifferenceInBST mad =  new MinimumAbsoluteDifferenceInBST();
		TreeNode root = BinaryTree.integerArray2BinaryTree(new int[] {1, 3, 2});
		assertEquals(1, mad.getMinimumDifference(root));
		assertEquals(1, mad.getMinimumDifference2(root));
	}
	
	@Test
	public void test4() {
		MinimumAbsoluteDifferenceInBST mad = new MinimumAbsoluteDifferenceInBST();
		TreeNode root = BinaryTree.integerArray2BinaryTree(new int[] {236,104,701,227,911});
		assertEquals(9, mad.getMinimumDifference(root));
		assertEquals(9, mad.getMinimumDifference2(root));
	}
	@Test
	public void test5() {
		MinimumAbsoluteDifferenceInBST mad = new MinimumAbsoluteDifferenceInBST();
		TreeNode root = BinaryTree.integerArray2BinaryTree(new int[] {600,424,612,499,689});
		assertEquals(12, mad.getMinimumDifference(root));
		assertEquals(12, mad.getMinimumDifference2(root));
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void test2() {
		MinimumAbsoluteDifferenceInBST mad = new MinimumAbsoluteDifferenceInBST();
		TreeNode root = BinaryTree.integerArray2BinaryTree(new int[] {1});
		mad.getMinimumDifference(root);
		//assertEquals(1, mad.getMinimumDifference(root));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test3() {
		MinimumAbsoluteDifferenceInBST mad = new MinimumAbsoluteDifferenceInBST();
		TreeNode root = null;
		mad.getMinimumDifference(root);
		//assertEquals(1, mad.getMinimumDifference(root));
	}
	
	
}
