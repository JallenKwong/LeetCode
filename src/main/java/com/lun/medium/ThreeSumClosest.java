package com.lun.medium;

import java.util.Arrays;

public class ThreeSumClosest {

	// 方法一：我写的
	public int threeSumClosest1(int[] nums, int target) {
		if (nums == null || nums.length < 3)
			throw new IllegalArgumentException();

		Arrays.sort(nums);
		int closestSum = nums[0] + nums[1] + nums[nums.length - 1];
		int minDistance = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {

				int left = i + 1, right = nums.length - 1;
				while (left < right) {
					int sum = nums[i] + nums[left] + nums[right];
					int diff = target - sum;
					int distance = Math.abs(diff);

					if (diff == 0)
						return sum;

					if (distance < minDistance) {
						closestSum = sum;
						minDistance = distance;
					}

					if (diff < 0) {
						while (left < right && nums[right] == nums[right - 1])
							right--;
						right--;
					} else if (diff > 0) {
						while (left < right && nums[left] == nums[left + 1])
							left++;
						left++;
					}
				}
			}
		}

		return closestSum;
	}

	// 方法二：别人写的，比方法一
	public int threeSumClosest2(int[] num, int target) {
		int result = num[0] + num[1] + num[num.length - 1];
		Arrays.sort(num);
		for (int i = 0; i < num.length - 2; i++) {
			int start = i + 1, end = num.length - 1;
			while (start < end) {
				int sum = num[i] + num[start] + num[end];
				if (sum > target) {
					end--;
				} else {
					start++;
				}
				if (Math.abs(sum - target) < Math.abs(result - target)) {
					result = sum;
				}
			}
		}
		return result;
	}

}
