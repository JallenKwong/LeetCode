package com.lun.swordtowardoffer;


import org.junit.Test;
import static org.junit.Assert.*;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class GetTheNthNodeInBSTTest {
	
	@Test
	public void test() {
		TreeNode root = BinaryTree.integerArray2BinarySearchTree(new int[] {5, 3, 7, 2, 4, 6, 8});
		GetTheNthNodeInBST gb = new GetTheNthNodeInBST();
		
		assertEquals(4, gb.get(root, 3).val);
	}
}
