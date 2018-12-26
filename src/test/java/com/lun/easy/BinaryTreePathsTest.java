package com.lun.easy;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class BinaryTreePathsTest {

	@Test
	public void test() {
		TreeNode root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		root.left.right = new TreeNode(5);
		
		BinaryTreePaths bp = new BinaryTreePaths();
		
		assertThat(bp.binaryTreePaths(root), containsInAnyOrder("1->2->5", "1->3"));
		assertThat(bp.binaryTreePaths2(root), containsInAnyOrder("1->2->5", "1->3"));
		
	}
}
