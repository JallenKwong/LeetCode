package com.lun.swordtowardoffer;

import com.lun.util.BinaryTree.TreeNode;

public class CheckTreeBalanced {

	
	public boolean check(TreeNode node) {
		int[] depth = {0};
		return isBalanced(node, depth);
	}
	
	
	public boolean isBalanced(TreeNode node, int[] depth) {
		
		if(node == null) {
			depth[0] = 0;
			return true;
		}
		
		int[] left = {0};
		int[] right = {0};
		if(isBalanced(node.left, left) && isBalanced(node.right, right)) {
			int diff = Math.abs(left[0] - right[0]);
			
			if(diff <= 1) {
				depth[0] = 1 + Math.max(left[0], right[0]);
				return true;
			}
			
		}
		
		return false;		
	}
	
	
}
