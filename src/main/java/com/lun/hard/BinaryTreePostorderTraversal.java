package com.lun.hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.lun.util.BinaryTree.TreeNode;

public class BinaryTreePostorderTraversal {
	
	//非递归版
    public List<Integer> postorderTraversal(TreeNode root) {
    	
    	if(root == null) {
    		throw new IllegalArgumentException();
    	}
    	
        List<Integer> result = new ArrayList<>();
        LinkedList<Object> stack = new LinkedList<>();
        
        TreeNode node = root;
        outter : while(true) {
        	
        	if(node.left != null && node.right != null) {
        		stack.push(node);
        		stack.push(2);
        		node = node.left;
        	}else if(node.left != null && node.right == null) {
        		stack.push(node);
        		stack.push(1);
        		node = node.left;
        	}else if(node.left == null && node.right != null) {
        		stack.push(node);
        		stack.push(1);
        		node = node.right;
        	}else {
        		result.add(node.val);
    			while(true) {
    				if(stack.isEmpty()) {
    					break outter;
    				}
	    			int count = (int)stack.pop();
	    			if(count == 1) {
	    				TreeNode tmp = (TreeNode)stack.pop();
	    				result.add(tmp.val);
	    			}else if(count == 2) {
	    				stack.push(1);
	    				node = ((TreeNode)stack.get(1)).right;
	    				break;
	    			}
    			}
        	}
        }
        
        return result;
    }
    
    //精简的非递归版
    public List<Integer> postorderTraversal2(TreeNode root) {
    	LinkedList<Integer> ans = new LinkedList<>();
    	Stack<TreeNode> stack = new Stack<>();
    	if (root == null) return ans;
    	
    	stack.push(root);
    	while (!stack.isEmpty()) {
    		TreeNode cur = stack.pop();
    		ans.addFirst(cur.val);
    		if (cur.left != null) {
    			stack.push(cur.left);
    		}
    		if (cur.right != null) {
    			stack.push(cur.right);
    		} 
    	}
    	return ans;
    }
    
    //传统的递归版
    public List<Integer> postorderTraversal3(TreeNode root) {
    	List<Integer> result = new ArrayList<>();
    	postorderTraversal3(root, result);
    	return result;
    }
    
    private void postorderTraversal3(TreeNode root, List<Integer> list) {
    	if(root != null) {
    		postorderTraversal3(root.left, list);
    		postorderTraversal3(root.right, list);
    		list.add(root.val);
    	}
    }
    
}
