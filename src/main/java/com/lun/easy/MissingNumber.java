package com.lun.easy;

import java.util.Arrays;

public class MissingNumber {

	// 方法一：我写的
	public int missingNumber1(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int targetIndex = nums[i] & Integer.MAX_VALUE;//忽视符号位
			if (targetIndex < nums.length) {
				nums[targetIndex] |= Integer.MIN_VALUE;//在符号位做标记
			}
		}

		int result = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0)
				result = i;
			nums[i] &= Integer.MAX_VALUE;// 复原
		}

		return result;
	}

	// 方法二：所有下标与元素累异或
	public int missingNumber2(int[] nums) { // xor
		int res = nums.length;
		for (int i = 0; i < nums.length; i++) {
			res ^= i ^ nums[i];
		}
		return res;
	}

	// 方法三：利用数学求和公式
	public int missingNumber3(int[] nums) { // sum
		int len = nums.length;
		int sum = len * (len + 1) / 2;
		for (int i = 0; i < len; i++)
			sum -= nums[i];
		return sum;
	}

	// 方法四：此消彼长
	public int missingNumber4(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i] - i;
		return nums.length - sum;//-sum + nums.length这样写法更让我明白
	}

	// 方法五：排序 + 二分查找
	public int missingNumber5(int[] nums) { // binary search
		Arrays.sort(nums);
		int left = 0, right = nums.length, mid = left + (left - right) / 2;
		while (left < right) {
			mid = (left + right) / 2;
			if (nums[mid] > mid)
				right = mid;
			else
				left = mid + 1;
		}
		return left;
	}

}
