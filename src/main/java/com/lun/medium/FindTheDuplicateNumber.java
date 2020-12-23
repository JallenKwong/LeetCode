package com.lun.medium;

public class FindTheDuplicateNumber {

	// 方法一：
	public int findDuplicate1(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int should = i + 1;

			while (nums[i] != should) {
				if (nums[i] == nums[nums[i] - 1]) {
					return nums[i];
				}

				swap(nums, i, nums[i] - 1);
			}
		}

		return -1;
	}

	private void swap(int[] nums, int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}

	// 方法二
	public int findDuplicate2(int[] nums) {

		if (nums.length > 1) {

			int slow = nums[0];
			int fast = nums[nums[0]];

			while (slow != fast) {
				slow = nums[slow];
				fast = nums[nums[fast]];
			}

			fast = 0;
			while (fast != slow) {
				fast = nums[fast];
				slow = nums[slow];
			}
			return slow;
		}
		return -1;
	}

	// 方法三
	public int findDuplicate3(int[] nums) {
		int low = 1, high = nums.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			int cnt = 0;
			for (int a : nums) {
				if (a <= mid)
					++cnt;
			}
			if (cnt <= mid)
				low = mid + 1;
			else
				high = mid;
		}
		return low;
	}

}
