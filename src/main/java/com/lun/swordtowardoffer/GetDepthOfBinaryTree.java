package com.lun.swordtowardoffer;

public class GetDepthOfBinaryTree {
	
	public static class BinaryTreeNode{
		public int value;
		public BinaryTreeNode left;
		public BinaryTreeNode right;
		
		public BinaryTreeNode(int value) {
			this.value = value;
		}
	}
	
	public int getDepthOfBinaryTree(BinaryTreeNode node) {
		if(node == null) {
			return 0;
		}
		
		int depthOfTheLeft = getDepthOfBinaryTree(node.left);
		int depthOfTheRight = getDepthOfBinaryTree(node.right);
		
		return depthOfTheLeft > depthOfTheRight ? depthOfTheLeft + 1 : depthOfTheRight + 1;
		
	}
	
}
