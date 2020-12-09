package com.lun.swordtowardoffer;

import org.junit.Assert;
import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class ConvertBSTToLinkedListTest {

	@Test
	public void test() {
		ConvertBSTToLinkedList cbl = new ConvertBSTToLinkedList();
		TreeNode root = makeABST();
		TreeNode head = cbl.convert(root);
		Assert.assertEquals("4 -> 6 -> 8 -> 10 -> 12 -> 14 -> 16 -> \n" + 
				"16 -> 14 -> 12 -> 10 -> 8 -> 6 -> 4 -> ", printList(head));
	}
	
	private TreeNode makeABST() {
		int[] array = {10, 6, 14, 4, 8, 12, 16};
		return BinaryTree.integerArray2BinarySearchTree(array);
	}
	
	private String printList(TreeNode head) {
		String result = "";
		
		TreeNode p = head;
		
		while(true) {
			result += (p.val + " -> ");
			
			if(p.right == null) {
				break;
			}
			p = p.right;
		}

		result += "\n";
		
		while(p != null) {
			result = result +  p.val + " -> ";
			p = p.left;
		}
		return result;
	}
	
}
