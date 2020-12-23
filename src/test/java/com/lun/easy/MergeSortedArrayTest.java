package com.lun.easy;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.lun.util.BinaryTree.TreeNode;

public class MergeSortedArrayTest {

	@Test
	public void test() {
		MergeSortedArray obj = new MergeSortedArray();

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };

		int[] expected = { 1, 2, 2, 3, 5, 6 };

		obj.merge1(nums1, 3, nums2, 3);

		System.out.println(Arrays.toString(nums1));
		assertArrayEquals(expected, nums1);

	}

	@Test
	public void test2() {
		MergeSortedArray obj = new MergeSortedArray();

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };

		int[] expected = { 1, 2, 2, 3, 5, 6 };

		obj.merge2(nums1, 3, nums2, 3);

		System.out.println(Arrays.toString(nums1));
		assertArrayEquals(expected, nums1);

	}


}
