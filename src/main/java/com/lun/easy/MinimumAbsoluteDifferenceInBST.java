package com.lun.easy;

import java.util.Stack;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class MinimumAbsoluteDifferenceInBST {
	
    public int getMinimumDifference(TreeNode root) {
    	
    	//There are at least two nodes in this BST.
    	boolean throwException = false;
    	if(root == null) {
    		throwException = true;
    	}else {
    		if(root.left == null && root.right == null) {
    			throwException = true;
    		}
    	}
    	if(throwException) {
    		throw new IllegalArgumentException();
    	}
    	
    	//正戏
    	int min = Integer.MAX_VALUE;
    	
    	Stack<TreeNode> stack = new Stack<>();
    	
    	while(true) {
    		if(root.left == null && root.right == null) {
    			if(stack.isEmpty()) {
    				break;
    			}else {
    				root = stack.pop();
    			}
    		}else if(root.left != null && root.right == null){
    			min = Math.min(getMinAbsDiff(root), min);
    			root = root.left;
    		}else if(root.left == null && root.right != null){
    			min = Math.min(getMinAbsDiff(root), min);
    			root = root.right;
    		}else {
    			min = Math.min(getMinAbsDiff(root), min);
    			stack.push(root.right);
    			root = root.left;
    		}
    	}
    	
        return min;
    }
    
    
    private int getMinAbsDiff(TreeNode p) {
    	
    	int a = p.val; 
    	Integer	leftDiff = null, rightDiff = null;
    	
    	TreeNode leftMaxNode = BinaryTree.max(p.left);
    	TreeNode rightMinNode = BinaryTree.min(p.right);
    	
    	if(leftMaxNode != null) {
    		leftDiff = Math.abs(a - leftMaxNode.val);
    	}
    	
    	if(rightMinNode != null) {
    		rightDiff = Math.abs(a - rightMinNode.val);
    	}
    	
    	
    	if(leftDiff != null && rightDiff == null) {
    		return leftDiff;
    	}

    	if(leftDiff == null && rightDiff != null) {
    		return rightDiff;
    	}
    	
    	return Math.min(leftDiff, rightDiff);
    	
    }
    
    //////////////////////////////////////////////////
    
    int minDiff = Integer.MAX_VALUE;
    TreeNode prev;
    
    /**
     * 
     * <p>Since this is a BST, the inorder traversal of its nodes results in a sorted list of values. <strong>Thus, the minimum absolute difference must occur in any adjacently traversed nodes.</strong> I use the global variable "prev" to keep track of each node's inorder predecessor.</p>
     * 
     * <p>
     * 例如：输入的二叉树<br>
     *root->600<br>
	 *&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/  \<br>
	 *&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;424  612<br>
	 *&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\   /<br>
	 *&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;499 689<br>
     * </p>
     * 
     * <p>中序遍历后得 424 499 600 612 689 ，得出一个升序的数列。显然，最小值绝对差就由两个相邻的数的出。</p>
     * 
     * @param root
     * @return
     */
    public int getMinimumDifference2(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (prev != null) 
        	minDiff = Math.min(minDiff, root.val - prev.val);
        prev = root;
        inorder(root.right);
    }
    
   

}
