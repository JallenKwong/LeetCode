package com.lun.swordtowardoffer;

import java.util.LinkedList;

import com.lun.util.BinaryTree.TreeNode;

public class PrintBinaryTreeByLevel3 {
	
	public String print(TreeNode root) {
		if(root == null)
			return "";
		
		StringBuilder sb = new StringBuilder();
		
		int level = 0;
		LinkedList<TreeNode> stack1 = new LinkedList<>(), 
				stack2 = new LinkedList<>();
		
		stack1.push(root);
		
		while(!stack1.isEmpty()) {
			while(!stack1.isEmpty()) {
				
				TreeNode node = stack1.pop();
				
				sb.append(node.val);
				sb.append(' ');
				
				if(level % 2 == 0) {
					if(node.left != null)
						stack2.push(node.left);
					if(node.right != null)
						stack2.push(node.right);
				}else {
					if(node.right != null)
						stack2.push(node.right);
					if(node.left != null)
						stack2.push(node.left);
				}
			}
			
			sb.deleteCharAt(sb.length() - 1);
			sb.append('\n');
			level++;
			
			if(!stack2.isEmpty()) {
				stack1.addAll(stack2);
				stack2.clear();
			}
			
		}
		
		return sb.substring(0, sb.length() - 1);
	}
}
