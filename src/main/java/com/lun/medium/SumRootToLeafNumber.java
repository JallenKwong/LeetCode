package com.lun.medium;

import java.util.Stack;

import com.lun.util.BinaryTree.TreeNode;

public class SumRootToLeafNumber {
	
    /**
     * 非递归版的
     * 
     * @param root
     * @return
     */
    public int sumNumbers(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	
    	TreeNode p = root;
    	int sum = 0, tmp = 0;
    	
    	Stack<TreeNode> nodeStack = new Stack<TreeNode>();
    	Stack<Integer> sumStack = new Stack<Integer>();
    	
    	while(true) {
    		
    		if(p.left == null && p.right == null) {
    			sum += tmp*10 + p.val;
    			if(nodeStack.isEmpty()) {
    				break;
    			}else {
    				p = nodeStack.pop();
    				tmp = sumStack.pop();
    				p = p.right;
    			}
    		}else if(p.left != null && p.right == null) {
    			tmp = tmp * 10 + p.val;
    			p = p.left;
    		}else if(p.left == null && p.right != null) {
    			tmp = tmp * 10 + p.val;
    			p = p.right;
    		}else {
    			tmp = tmp * 10 + p.val;
    			nodeStack.push(p);    			
    			sumStack.push(tmp);
    			p = p.left;
    		}
    	}
    	
        return sum;
    }
    
    public int sumNumbers2(TreeNode root) {
    	return sum(root, 0);
    }

    public int sum(TreeNode n, int s){
    	if (n == null) return 0;
    	if (n.right == null && n.left == null) return s*10 + n.val;
    	return sum(n.left, s*10 + n.val) + sum(n.right, s*10 + n.val);
    }
}
