package com.lun.easy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class SymmetricTreeTest {

	private TreeNode root = null;
	
	@Before
	public void init() {
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
	}
	
	
	@Test
	public void test1() {
		SymmetricTree obj = new SymmetricTree();

		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		
		assertTrue(obj.isSymmetric1(root));
		assertTrue(obj.isSymmetric2(root));
		assertTrue(obj.isSymmetric3(root));
	}
	
	@Test
	public void test2() {
		SymmetricTree obj = new SymmetricTree();
		
		root.left.right = new TreeNode(3);
		root.right.right = new TreeNode(3);
		
		assertFalse(obj.isSymmetric1(root));
		assertFalse(obj.isSymmetric2(root));
		assertFalse(obj.isSymmetric3(root));
	}
}
