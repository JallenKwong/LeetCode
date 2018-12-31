package com.lun.swordtowardoffer;

import com.lun.util.BinaryTree.TreeNode;

public class MirrorRecursively {
	
	public void mirror(TreeNode node) {
		
		if(node == null || 
				node.left == null && node.right == null) {
			return;
		}
		
		TreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
		
		mirror(node.left);
		mirror(node.right);
		
	}
	
}
