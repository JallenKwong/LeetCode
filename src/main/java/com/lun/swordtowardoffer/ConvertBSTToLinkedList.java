package com.lun.swordtowardoffer;

import com.lun.util.BinaryTree.TreeNode;

public class ConvertBSTToLinkedList {

	private TreeNode last;//用于指向双向链表的尾节点
	
	public TreeNode convert(TreeNode root) {
		convertNode(root);
		
		TreeNode head = last;
		while(head != null && head.left != null) {
			head = head.left;
		}
		return head;
	}

	private void convertNode(TreeNode node) {
		
		if(node == null) {
			return;
		}
		
		TreeNode current = node;
		
		if(current.left != null) {
			convertNode(current.left);
		}
		
		current.left = last;//1.执行到这步，左子树已经转换成有序双向链表
		
		if(last != null) {
			last.right = current;//2。
		}
		
		last = current;//3.current转换成有序双向链表的新尾节点
		
		if(current.right != null) {
			convertNode(current.right);
		}
	}
	
}
