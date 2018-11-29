package com.lun.util;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;


public class BinaryTreeTest {

	@Test
	public void test() {
		TreeNode root = BinaryTree.integerArray2BinaryTree(new int[] {600,424,612,499,689});
		
		BinaryTree.preorderTraversing(root);//600 424 499 612 689 
		System.out.println();
		
		BinaryTree.inorderTraversing(root);//424 499 600 612 689 
		System.out.println();
		
		BinaryTree.postTraversing(root);
		
	}
	
}
