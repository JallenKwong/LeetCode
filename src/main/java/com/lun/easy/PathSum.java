package com.lun.easy;

import java.util.LinkedList;

import com.lun.util.BinaryTree.TreeNode;

public class PathSum {

	// 方法一：递归版DFS
	public boolean hasPathSum1(TreeNode root, int sum) {
		return hasPathSum(root, 0, sum);
	}

	private boolean hasPathSum(TreeNode node, int currentSum, int sum) {
		if (node == null)
			return false;

		currentSum += node.val;

		if (node.left == null && node.right == null) {
			return currentSum == sum;
		}

		return hasPathSum(node.left, currentSum, sum) || hasPathSum(node.right, currentSum, sum);
	}

	// 方法二：非递归版DFS
	public boolean hasPathSum2(TreeNode root, int sum) {
		if (root == null)
			return false;

		LinkedList<Object> stack = new LinkedList<>();
		TreeNode p = root;
		int current = p.val;

		while (true) {

			if (p.left != null && p.right != null) {
				stack.push(new Object[] { p.right, current + p.right.val });
				current += p.left.val;
				p = p.left;
			} else if (p.left != null && p.right == null) {
				current += p.left.val;
				p = p.left;
			} else if (p.left == null && p.right != null) {
				current += p.right.val;
				p = p.right;
			} else {
				if (current == sum)
					return true;

				if (stack.isEmpty()) {
					break;
				} else {
					Object[] objs = (Object[]) stack.pop();
					p = (TreeNode) objs[0];
					current = (int) objs[1];
				}
			}
		}

		return false;
	}

	// 方法三：别人写的递归版DFS
	public boolean hasPathSum3(TreeNode root, int sum) {
		if (root == null)
			return false;

		if (root.left == null && root.right == null && sum - root.val == 0)
			return true;

		return hasPathSum3(root.left, sum - root.val) || hasPathSum3(root.right, sum - root.val);
	}

}
