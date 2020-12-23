package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class SameTreeTest {

	@Test
	public void test() {
		SameTree obj = new SameTree();
		
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		
		assertTrue(obj.isSameTree1(root1, root2));
		assertTrue(obj.isSameTree2(root1, root2));
	}
	
	@Test
	public void test2() {
		SameTree obj = new SameTree();
		
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		
		TreeNode root2 = new TreeNode(1);
		root2.right = new TreeNode(2);
		
		assertFalse(obj.isSameTree1(root1, root2));
		assertFalse(obj.isSameTree2(root1, root2));
	}
	
	@Test
	public void test3() {
		SameTree obj = new SameTree();
		
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(1);
		
		TreeNode root2 = new TreeNode(1);
		root2.right = new TreeNode(1);
		root2.right = new TreeNode(2);
		
		assertFalse(obj.isSameTree1(root1, root2));
		assertFalse(obj.isSameTree2(root1, root2));
	}
}
