package com.lun.easy;

import com.lun.util.BinaryTree.TreeNode;

public class BalancedBinaryTree {

	public boolean isBalanced1(TreeNode node) {
		if (node == null)
			return true;
		int leftHight = height1(node.left);
		int rightHight = height1(node.right);
		boolean balance = Math.abs(leftHight - rightHight) <= 1;
		return balance && isBalanced1(node.left) && isBalanced1(node.right);
	}

	private int height1(TreeNode node) {
		return node == null ? 0 : Math.max(height1(node.left), height1(node.right)) + 1;
	}

	public boolean isBalanced2(TreeNode node) {
		return height2(node) != -1;
	}

	private int height2(TreeNode node) {
		if (node == null)
			return 0;

		int leftHeight = height2(node.left);
		if (leftHeight == -1)
			return -1;

		int rightHeight = height2(node.right);
		if (rightHeight == -1)
			return -1;

		boolean balance = Math.abs(leftHeight - rightHeight) <= 1;

		return balance ? Math.max(leftHeight, rightHeight) + 1 : -1;
	}

}
