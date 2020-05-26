package com.lun.hard;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class BinaryTreePostorderTraversalTest {

	@Test
	public void test() {
		BinaryTreePostorderTraversal obj = new BinaryTreePostorderTraversal();

		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		
		List<Integer> actual = obj.postorderTraversal(root);
		List<Integer> actual2 = obj.postorderTraversal2(root);
		List<Integer> actual3 = obj.postorderTraversal3(root);
		assertThat(actual, is(Arrays.asList(3,2,1)));
		assertThat(actual2, is(Arrays.asList(3,2,1)));
		assertThat(actual3, is(Arrays.asList(3,2,1)));
	}
	

	@Test
	public void test2() {
		BinaryTreePostorderTraversal obj = new BinaryTreePostorderTraversal();
		
		//https://blog.csdn.net/qq_34840129/article/details/80619761
		TreeNode root = new TreeNode('A');
		root.left = new TreeNode('B');
		root.right = new TreeNode('C');
		
		root.left.left = new TreeNode('D');
		root.left.right = new TreeNode('E');
		
		root.left.left.right = new TreeNode('H');
		root.left.right.right = new TreeNode('I');
		
		//---
		
		root.right.left = new TreeNode('F');
		root.right.right = new TreeNode('G');
		
		root.right.left.left = new TreeNode('J');
		root.right.left.right = new TreeNode('K');
		
		inorder(root);
		
		List<Integer> actual = obj.postorderTraversal(root);
		List<Integer> actual2 = obj.postorderTraversal2(root);
		List<Integer> actual3 = obj.postorderTraversal3(root);
		List<Integer> expect = Arrays.asList('H', 'D', 'I', 'E', 'B', 'J', 'K', 'F', 'G', 'C', 'A')
				.stream().map(a->a-'A').collect(Collectors.toList());
		
		assertThat(actual, is(expect));
		assertThat(actual2, is(expect));
		assertThat(actual3, is(expect));
		
	}
	
	private static void inorder(TreeNode node) {
		if(node != null) {
			inorder(node.left);
			node.val = node.val - 'A';
			inorder(node.right);
		}
	}
	
}
