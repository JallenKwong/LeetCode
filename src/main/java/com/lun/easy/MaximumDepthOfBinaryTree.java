package com.lun.easy;

import java.util.Arrays;
import java.util.LinkedList;

import com.lun.util.BinaryTree.TreeNode;

public class MaximumDepthOfBinaryTree {

	// 方法一：递归版(DFS)
	public int maxDepth1(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(maxDepth1(root.left), maxDepth1(root.right)) + 1;
	}

	// 方法二：非递归版(DFS)
	public int maxDepth2(TreeNode root) {
		if (root == null)
			return 0;

		int max = 1, count = 1;
		LinkedList<Object> stack = new LinkedList<>(Arrays.asList(root, max));
		TreeNode p = root;

		while (true) {
			if (p.left != null && p.right != null) {
				count++;
				stack.push(count);
				stack.push(p.right);
				p = p.left;
			} else if (p.left != null && p.right == null) {
				count++;
				p = p.left;
			} else if (p.left == null && p.right != null) {
				count++;
				p = p.right;
			} else {
				if (count > max)
					max = count;
				if (!stack.isEmpty()) {
					p = (TreeNode) stack.pop();
					count = (int) stack.pop();
				} else {
					break;
				}
			}
		}
		return max;
	}

	// 方法三：非递归版(BFS)
	public int maxDepth3(TreeNode root) {
		if (root == null)
			return 0;
		int count = 0;
		TreeNode p = root;

		LinkedList<TreeNode> queue = new LinkedList<TreeNode>(Arrays.asList(p));

		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size-- > 0) {
				p = queue.poll();
				if (p.left != null) {
					queue.offer(p.left);
				}

				if (p.right != null) {
					queue.offer(p.right);
				}

			}
			count++;
		}

		return count;
	}

}
