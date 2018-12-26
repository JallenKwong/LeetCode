package com.lun.swordtowardoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.lun.util.BinaryTree.TreeNode;

public class SumRootToLeafNumber {

	public static class Three{
		TreeNode node;
		int sum;
		String path;
		public Three(TreeNode node, int sum, String path) {
			this.node = node;
			this.sum = sum;
			this.path = path;
		}
	}
	
	public List<String> sumNumbers(TreeNode root, int target){
		List<String> result = new LinkedList<>();
		if(root == null) {
			return result;
		}
		
		StringBuilder sb = new StringBuilder();
		TreeNode p = root;
		int sum = 0;
		
    	Stack<Three> stack = new Stack<>();
    	
		while(true) {
			sum += p.val;
			sb.append(p.val);
			sb.append(',');
			
			if(p.left == null && p.right == null) {
				if(sum == target) {
					result.add(sb.substring(0, sb.length() - 1));
				}
				
				if(stack.isEmpty()) {
					break;
				}else {
					Three tmp = stack.pop();
    				sum = tmp.sum;
    				p = tmp.node.right;
    				sb = new StringBuilder(tmp.path);
				}
				
			}else if(p.left != null && p.right == null) {
				p = p.left;
			}else if(p.left == null && p.right != null) {
				p = p.right;
			}else {
    			stack.push(new Three(p, sum, sb.toString()));
				p = p.left;
			}
		}
		
		return result;
	}
	
	public List<String> sumNumbers2(TreeNode root, int target){
        List<String> result = new ArrayList<String>();
        if (root != null) sumNumbers2(root, "", 0, result, target);
        return result;
	}

	/**
	 *前序遍历二叉树
	 */
	private void sumNumbers2(TreeNode node, String path, int sum, List<String> result, int target) {
		
		if(node.left == null && node.right == null) {
			if(target == sum + node.val)
				result.add(path + node.val);
		}
		
		if(node.left != null)
			sumNumbers2(node.left, path + node.val + ",", sum + node.val, result, target);
		if(node.right != null) 
			sumNumbers2(node.right, path + node.val + ",", sum + node.val, result, target);
	}
	
	
}
