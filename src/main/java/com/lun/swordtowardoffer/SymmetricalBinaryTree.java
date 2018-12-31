package com.lun.swordtowardoffer;

import com.lun.util.BinaryTree.TreeNode;

public class SymmetricalBinaryTree {
	public boolean isSymmetrical(TreeNode root) {
		return isSymmetrical(root, root); 
	}
	
	/**
	 * 与BinaryTree的equals的类似
	 * 
	 * @param node1
	 * @param node2
	 * @return
	 * 
	 */
	private boolean isSymmetrical(TreeNode node1, TreeNode node2) {
		
		if(node1 == null && node2 != null ||
				node1 != null && node2 == null) {
			return false;
		}
		
		if(node1 != null && node2 != null) {
			if(node1.val != node2.val) {
				return false;
			}
			
			return isSymmetrical(node1.left, node2.right)
					&& isSymmetrical(node1.right, node2.left);
		}
		
		return true;
	}
	
}
