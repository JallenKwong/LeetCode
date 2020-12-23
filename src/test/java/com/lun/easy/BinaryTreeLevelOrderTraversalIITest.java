package com.lun.easy;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class BinaryTreeLevelOrderTraversalIITest {

	@Test
	public void test() {
		BinaryTreeLevelOrderTraversalII obj = new BinaryTreeLevelOrderTraversalII();
		List<List<Integer>> expected = new ArrayList<>(
				Arrays.asList(Arrays.asList(15, 7), Arrays.asList(9, 20), Arrays.asList(3)));

		TreeNode root = new TreeNode(3);

		root.left = new TreeNode(9);
		root.right = new TreeNode(20);

		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		assertThat(obj.levelOrderBottom1(root), is(expected));
		assertThat(obj.levelOrderBottom2(root), is(expected));
	}
}
