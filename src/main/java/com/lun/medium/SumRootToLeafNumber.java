package com.lun.medium;

import java.util.Stack;

public class SumRootToLeafNumber {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }

	}
	
	/**
	 * 非递归版二叉查找树的构建
	 * 
	 * @param array
	 * @return
	 */
	public static TreeNode integerArray2BinaryTree(Integer[] array) {
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("Illegal array.");
		}
		
		TreeNode root = new TreeNode(array[0]);
		
		for(int i = 1; i < array.length; i++) {
			
			TreeNode p = root;
			
			while(true) {
				if(array[i] < p.val) {
					
					if(p.left != null) {
						p = p.left;
					}else {
						p.left = new TreeNode(array[i]);
						break;
					}
					
				}
				
				if(array[i] > p.val){
					if(p.right != null) {
						p = p.right;
					}else {
						p.right = new TreeNode(array[i]);
						break;
					}
				}
				
				if(array[i] == p.val) 
					break;
			}
		}
		
		return root;
	}
	
	/**
	 * 中序遍历打印
	 * 
	 * @param root
	 */
	public static void print(TreeNode root) {
		if(root == null)
			return;
		print(root.left);
		System.out.println(root.val);
		print(root.right);
	}
	
	
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
