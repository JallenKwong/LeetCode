package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class PrintBinaryTreeByLevelTest {

	@Test
	public void testPrint() {
		TreeNode root = BinaryTree.integerArray2BinarySearchTree(new int[] {8,6,10,5,7,9,11});
		PrintBinaryTreeByLevel pl = new PrintBinaryTreeByLevel();
		assertEquals("8,6,10,5,7,9,11", pl.print(root));
	}

}
