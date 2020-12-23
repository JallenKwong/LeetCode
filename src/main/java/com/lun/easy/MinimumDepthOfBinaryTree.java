package com.lun.easy;

import java.util.LinkedList;
import java.util.Queue;

import com.lun.util.BinaryTree.TreeNode;

public class MinimumDepthOfBinaryTree {
	
	//方法一：DFS
	public int minDepth1(TreeNode root) {
		if (root == null)
			return 0;
		int left = minDepth1(root.left), right = minDepth1(root.right);
		return (left == 0 || right == 0) ? Math.max(left, right) + 1 : Math.min(left, right) + 1;
	}

	//方法二，BFS
	public int minDepth2(TreeNode root) {
		if (root == null) return 0;
		int depth = 1;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size();
			// for each level
			for (int i = 0; i < size; i++) {
				TreeNode node = q.poll();
				if (node.left == null && node.right == null) {
					return depth;
				}
				if (node.left != null) {
					q.offer(node.left);
				}
				if (node.right != null) {
					q.offer(node.right);
				}
			}
			depth++;
		}
		return depth;
	}
}
