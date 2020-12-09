package com.lun.easy;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int lastIndex = 0;

		if (nums.length > 0) {

			lastIndex = nums.length - 1;

			for (int i = 0; i <= lastIndex; i++) {
				while (nums[i] == val) {
					nums[i] = nums[lastIndex--];
					if (i > lastIndex)
						break;
				}
			}
			lastIndex++;
		}

		return lastIndex;
	}

	public int removeElement2(int[] nums, int val) {
		int m = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != val) {
				nums[m] = nums[i];
				m++;
			}
		}

		return m;
	}
}
