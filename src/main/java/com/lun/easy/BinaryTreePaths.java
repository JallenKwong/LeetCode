package com.lun.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.lun.util.BinaryTree.TreeNode;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> result = new ArrayList<>();
    	
    	TreeNode pointer = root;
    	StringBuilder sb = new StringBuilder();
    	
    	//两个栈 分别 保存 TreeNode, 路径String, 同有相同元素的数量值
    	LinkedList<TreeNode> nodeStack = new LinkedList<>();
    	LinkedList<String> pathStack = new LinkedList<>();
    	
    	//（可能情况 1.只有一个左子树，2.只有一个右子树，3.都有左右子树）
    	
    	while(true) {
    		
    		if(pointer == null && nodeStack.isEmpty() && pathStack.isEmpty()) {
    			break;
    		}
    		
    		if(sb.length() > 0) {//根节点前 不加->
    			sb.append("->");
    		}
    		
    		sb.append(pointer.val);
    		//判断一个节点都有左右子树
    		if(pointer.left != null && pointer.right != null) {
    			
    			//先分支到左子树，右子树
    			nodeStack.push(pointer);//存起来下，下次再遍历右子树
    			pathStack.push(sb.toString());
    			
    			pointer = pointer.left;
    		}else if(pointer.left != null && pointer.right == null) {//只有左子树，或者只有右子树
    			
    			pointer = pointer.left;
    		}else if(pointer.left == null && pointer.right != null) {
    			
    			pointer = pointer.right;
    		}else { //叶子节点
    			result.add(sb.toString());
    			
    			if(!nodeStack.isEmpty()) {
    				pointer = nodeStack.pop().right;//栈只会保存右子树的
    				sb = new StringBuilder(pathStack.pop());
    			}else {
    				pointer = null;
    			}
    			
    		}
    	}
    	
    	return result;
    }
    
    public List<String> binaryTreePaths2(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        if (root != null) searchBT(root, "", answer);
        return answer;
    }
    
    /**
     * 
     * 前序遍历
     * 
     * @param root
     * @param path
     * @param answer
     */
    private void searchBT(TreeNode root, String path, List<String> answer) {
        if (root.left == null && root.right == null) 
        	answer.add(path + root.val);
        if (root.left != null) 
        	searchBT(root.left, path + root.val + "->", answer);
        if (root.right != null) 
        	searchBT(root.right, path + root.val + "->", answer);
    }
    
}
