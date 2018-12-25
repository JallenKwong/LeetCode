package com.lun.swordtowardoffer;

import java.util.LinkedList;

import com.lun.util.BinaryTree.TreeNode;

public class PrintBinaryTreeByLevel2 {
	
	public String print(TreeNode root) {
		if(root == null)
			return "";
		
		StringBuilder sb = new StringBuilder();
		
		LinkedList<TreeNode> queue1 = new LinkedList<>(), queue2 = new LinkedList<>();
		
		queue1.addLast(root);
		
		while(!queue1.isEmpty()) {
			
			while(!queue1.isEmpty()) {
				TreeNode node = queue1.removeFirst();
				
				sb.append(node.val);
				sb.append(' ');
				
				if(node.left != null)
					queue2.addLast(node.left);
				if(node.right != null)
					queue2.addLast(node.right);				
			}
			
			sb.deleteCharAt(sb.length() - 1);
			sb.append('\n');
			
			if(!queue2.isEmpty()) {
				queue1.addAll(queue2);
				queue2.clear();
			}
		}
		
		return sb.substring(0, sb.length() - 1);
	}
	
}
