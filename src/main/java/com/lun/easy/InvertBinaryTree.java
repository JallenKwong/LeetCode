package com.lun.easy;

import java.util.LinkedList;
import java.util.Queue;

import com.lun.util.BinaryTree.TreeNode;

public class InvertBinaryTree {

	// 方法一：递归（DFS）
	public TreeNode invertTree1(TreeNode root) {
		if (root == null)
			return null;
		TreeNode temp = invertTree1(root.left);
		root.left = invertTree1(root.right);
		root.right = temp;
		return root;
	}

	// 方法二：迭代（DFS）
	public TreeNode invertTree2(TreeNode root) {
		if (root == null)
			return null;

		LinkedList<TreeNode> stack = new LinkedList<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			TreeNode left = node.left;
			node.left = node.right;
			node.right = left;

			if (node.left != null)
				stack.push(node.left);

			if (node.right != null)
				stack.push(node.right);
		}
		return root;
	}

	// 方法三：迭代（BFS）
	public TreeNode invertTree3(TreeNode root) {
		if (root == null)
			return null;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			TreeNode left = node.left;
			node.left = node.right;
			node.right = left;

			if (node.left != null)
				queue.offer(node.left);

			if (node.right != null)
				queue.offer(node.right);
		}
		return root;
	}

}
