package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class MirrorRecursivelyTest {

	@Test
	public void testMirror() {
		MirrorRecursively mr = new MirrorRecursively();
		
		TreeNode actual = BinaryTree.integerArray2BinaryTree(new int[] {8,6,10,5,7,9,11});
		
		mr.mirror(actual);
		
		TreeNode expected = new TreeNode(8); 
		expected.left = new TreeNode(10);
		expected.right = new TreeNode(6);
		
		expected.left.left = new TreeNode(11);
		expected.left.right = new TreeNode(9);
		
		expected.right.left = new TreeNode(7);
		expected.right.right = new TreeNode(5);
		
		assertTrue(BinaryTree.equals(expected, actual));
	}

}
