package com.lun.easy;

import com.lun.util.BinaryTree.TreeNode;

public class BinaryTreeTilt {
	public int findTilt(TreeNode root) {
		int[] sum = {0};
		findTilt(root, sum);
		return sum[0];
	}

	private int findTilt(TreeNode root, int[] sum) {
		if (root == null) return 0;
		int leftSum = findTilt(root.left, sum);
		int rightSum = findTilt(root.right, sum);
		sum[0] += Math.abs(leftSum - rightSum);
		return leftSum + rightSum + root.val;
	}
}
