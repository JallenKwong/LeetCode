package com.lun.swordtowardoffer;

import java.util.LinkedList;

import com.lun.util.BinaryTree.TreeNode;

public class PrintBinaryTreeByLevel {
	
	public String print(TreeNode root) {
		if(root == null)
			return "";
		
		StringBuilder sb = new StringBuilder();
		
		LinkedList<TreeNode> queue = new LinkedList<>();  
		queue.addLast(root);
		
		while(!queue.isEmpty()) {
			TreeNode node = queue.removeFirst();
			sb.append(node.val);
			sb.append(',');
			
			if(node.left != null)
				queue.addLast(node.left);
			
			if(node.right != null)
				queue.addLast(node.right);
			
		}
		
		return sb.substring(0, sb.length() - 1);
	}
}
