package com.lun.easy;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		int result = 0;

		if (nums.length > 0) {
			for (int i = result + 1; i < nums.length; i++) {
				if (nums[result] != nums[i]) {
					nums[++result] = nums[i];
				}
			}
			result++;
		}

		return result;
	}
}
