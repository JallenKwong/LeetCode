package com.lun.swordtowardoffer;

import com.lun.util.BinaryTree.TreeNode;

public class GetTheNthNodeInBST {

	//private int num;
	
	public TreeNode get(TreeNode root, int n) {
		if(root == null || n <= 0)
			return null;
		int[] num = {n};
		return get2(root, num);
	}

	public TreeNode get2(TreeNode node, int[] num) {
		TreeNode result = null;
		
		if(node.left != null) {
			result = get2(node.left, num);
		}
		
		if(result == null) {
			if(num[0] == 1)
				result = node;
			num[0]--;
		}
		
		if(result == null && node.right != null) {
			result = get2(node.right, num);
		}
		
		return result;
	}
	
}
