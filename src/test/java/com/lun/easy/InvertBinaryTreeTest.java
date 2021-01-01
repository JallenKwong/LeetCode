package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class InvertBinaryTreeTest {

	@Test
	public void test1() {
		InvertBinaryTree obj = new InvertBinaryTree();
		TreeNode root = makeATree();
		TreeNode expected = makeExpectedTree();
		assertTrue(BinaryTree.equals(obj.invertTree1(root), expected));
	}

	@Test
	public void test2() {
		InvertBinaryTree obj = new InvertBinaryTree();
		TreeNode root = makeATree();
		TreeNode expected = makeExpectedTree();
		assertTrue(BinaryTree.equals(obj.invertTree2(root), expected));
	}

	@Test
	public void test3() {
		InvertBinaryTree obj = new InvertBinaryTree();
		TreeNode root = makeATree();
		TreeNode expected = makeExpectedTree();
		assertTrue(BinaryTree.equals(obj.invertTree3(root), expected));
	}
	
	private TreeNode makeATree() {
		return new TreeNode(4,//
				new TreeNode(2,// 
					new TreeNode(1),// 
					new TreeNode(3)),//
				new TreeNode(7, //
					new TreeNode(6),// 
					new TreeNode(9)));
	}
	
	private TreeNode makeExpectedTree() {
		return new TreeNode(4, //
				new TreeNode(7, // 
					new TreeNode(9), // 
					new TreeNode(6)), //
				new TreeNode(2,  //
					new TreeNode(3), // 
					new TreeNode(1)));
	}
}
