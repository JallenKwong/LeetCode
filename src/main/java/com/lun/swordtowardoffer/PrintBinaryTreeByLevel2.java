package com.lun.swordtowardoffer;

import java.util.LinkedList;

import com.lun.util.BinaryTree.TreeNode;

public class PrintBinaryTreeByLevel2 {
	
	/**
	 * 用两个队列
	 * 
	 * @param root
	 * @return
	 */
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
	
	/**
	 * 用两个变量标记
	 * 
	 * @param root
	 * @return
	 */
	public String print2(TreeNode root) {
		if(root == null)
			return "";
		StringBuilder sb = new StringBuilder();
		LinkedList<TreeNode> queue = new LinkedList<>();
		
		queue.addLast(root);
		
		int nextLevel = 0;
		int toBePrinted = 1;
		
		while(!queue.isEmpty()) {
			TreeNode node = queue.removeFirst();
			toBePrinted--;
			
			sb.append(node.val);
			sb.append(' ');
			
			if(node.left != null) {
				queue.addLast(node.left);
				nextLevel++;
			}
			if(node.right != null) {
				queue.addLast(node.right);		
				nextLevel++;
			}
			
			if(toBePrinted == 0) {
				sb.deleteCharAt(sb.length() - 1);//删除多余的空格
				sb.append('\n');
				toBePrinted = nextLevel;
				nextLevel = 0;
			}
		}
		return sb.substring(0, sb.length() - 1);
	}
}
