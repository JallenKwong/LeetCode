package com.lun.swordtowardoffer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class PrintBinaryTreeByLevel2Test {
	
	@Test
	public void testPrint() {
		TreeNode root = BinaryTree.integerArray2BinaryTree(new int[] {8,6,10,5,7,9,11});
		PrintBinaryTreeByLevel2 pl = new PrintBinaryTreeByLevel2();
		assertEquals("8\n6 10\n5 7 9 11", pl.print(root));
	}
	
}
