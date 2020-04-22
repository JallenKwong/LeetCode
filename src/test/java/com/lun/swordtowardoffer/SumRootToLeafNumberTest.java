package com.lun.swordtowardoffer;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class SumRootToLeafNumberTest {

	@Test
	public void testSumNumbers() {
		TreeNode root = BinaryTree.integerArray2BinarySearchTree(new int[] {10,5,12,4,7});
		SumRootToLeafNumber sn = new SumRootToLeafNumber();
		
		assertThat(sn.sumNumbers(root, 22), containsInAnyOrder("10,5,7","10,12"));
		assertThat(sn.sumNumbers2(root, 22), containsInAnyOrder("10,5,7","10,12"));
	}

}
