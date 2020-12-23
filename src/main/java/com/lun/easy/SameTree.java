package com.lun.easy;

import java.util.Arrays;
import java.util.LinkedList;

import com.lun.util.BinaryTree.TreeNode;

public class SameTree {
    public boolean isSameTree1(TreeNode p, TreeNode q) {
        if (p == null && q != null || p != null && q == null)
			return false;

		if (p != null && q != null) {
			if (p.val != q.val) {
				return false;
			}

			// 判断左右子树
			return isSameTree1(p.left, q.left) && isSameTree1(p.right, q.right);
		}

		return true;
    }
    
    
    public boolean isSameTree2(TreeNode root1, TreeNode root2) {
    	TreeNode p = root1, q = root2;
    	
    	LinkedList<TreeNode> stack = new LinkedList<>();
    	
    	while(true) {
    		if(p == null && q != null || p != null && q == null) {
    			return false;
    		}
    		
    		if(p != null && q != null) {
    			if(p.val != q.val) {
    				return false;
    			}
    			
    			//下列push的精简
    			stack.addAll(0, Arrays.asList(p.left, q.left, p.right, q.right));
    			
//    			stack.push(q.right);
//    			stack.push(p.right);
//    			
//    			stack.push(q.left);
//    			stack.push(p.left);
    		}
    		
    		if(stack.isEmpty()) {
    			break;
    		}else {
    			p = stack.pop();
    			q = stack.pop();
    		}
    	}
    	
    	return true;
    }
    
}
