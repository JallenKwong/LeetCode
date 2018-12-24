package com.lun.swordtowardoffer;

import com.lun.util.BinaryTree.TreeNode;

public class GetTheNthNodeInBST {

	private int num;
	
	
	public TreeNode get(TreeNode root, int n) {
		
		if(root == null || n <= 0)
			return null;
		
		num = n;
		
		return get2(root);
	}

	public TreeNode get2(TreeNode node) {
		TreeNode target = null;
		
		if(node.left != null) {
			target = get2(node.left);
		}
		
		if(target == null) {
			if(num == 1)
				target = node;
			num--;
		}
		
		if(target == null && node.right != null) {
			target = get2(node.right);
		}
		
		return target;
		
		
	}
	
}
