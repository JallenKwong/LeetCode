package com.lun.swordtowardoffer;


public class NextNodeOfBinaryTree {

	public static class TreeNode {
		public int val;
		public TreeNode left, right, parent;
		public TreeNode(int x) { val = x; }
	}
	
	public TreeNode next(TreeNode node) {
		TreeNode result = null;
		
		if(node == null)
			return result;
		
		//1. 若一个节点有右子树，那么它的下一个节点就是它的右子树的最左子树
		if(node.left != null) {
			TreeNode right = node.right;
			
			while(right.left != null)
				right = right.left;
			
			result = right;
		}else if(node.parent != null) {
			//2. 没有右子树
			
			TreeNode current = node;
			TreeNode parent = node.parent;
			
			//3. 即没有右子树，且父节点的右节点
			while(parent != null && current.val == parent.right.val) {
				current = parent;
				parent = parent.parent;
			}
			
			result = parent;
		}
		
		return result;
	}
	
}
