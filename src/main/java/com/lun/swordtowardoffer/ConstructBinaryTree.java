package com.lun.swordtowardoffer;


import java.util.Arrays;
import java.util.HashSet;

import com.lun.util.BinaryTree.TreeNode;
import com.lun.util.MyUtils;

public class ConstructBinaryTree {
	public TreeNode construct(int[] preorder, int[] inorder) {
		
		if(MyUtils.checkArrayEmpty(preorder) || MyUtils.checkArrayEmpty(inorder)
				|| preorder.length != inorder.length) {
			return null;
		}
		
		return construct(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
	}
	
	/**
	 * 采用前序遍历来构建
	 * 
	 */
	private TreeNode construct(int[] preorder, int[] inorder
						, int preoStart, int preoEnd, int inStart, int inEnd) {
		
		TreeNode node = new TreeNode(preorder[preoStart]);
		if(preoStart == preoEnd) {
			return node;
		}
		
		int rootInoIndex = inStart;
		while(rootInoIndex <= inEnd && inorder[rootInoIndex] != node.val) {
			++rootInoIndex;
		}
		int leftLength = rootInoIndex - inStart;
		
		if(leftLength > 0)
			node.left = construct(preorder, inorder, preoStart + 1, preoStart + leftLength , 
					inStart, rootInoIndex - 1);
		
		
		if(preoStart + leftLength < preoEnd)
			node.right = construct(preorder, inorder, preoStart + leftLength + 1, preoEnd, 
					rootInoIndex + 1, inEnd);
				
		return node;
	}
	
}
