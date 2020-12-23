package com.lun.easy;

public class TwoSumIIInputArrayIsSorted {
	// 方法一：
	public int[] twoSum1(int[] numbers, int target) {
		if (numbers == null || numbers.length == 0)
			return null;

		for (int i = 0; i < numbers.length; i++) {

			int diff = target - numbers[i];

			int otherTargetIndex = -1;
			if (diff < numbers[i]) {
				otherTargetIndex = binarySearch(numbers, 0, i - 1, diff);
			} else {
				otherTargetIndex = binarySearch(numbers, i + 1, numbers.length - 1, diff);
			}

			if (otherTargetIndex != -1)
				return new int[] { Math.min(otherTargetIndex, i) + 1, Math.max(otherTargetIndex, i) + 1 };
		}

		return null;
	}

	private int binarySearch(int[] numbers, int left, int right, int value) {
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (value < numbers[mid]) {
				right = mid - 1;
			} else if (numbers[mid] < value) {
				left = mid + 1;
			} else {
				return mid;
			}

		}
		return -1;
	}

	// 方法二：双指针
	public int[] twoSum2(int[] numbers, int target) {
		int first = 0, last = numbers.length - 1;
		while (numbers[first] + numbers[last] != target) {
			if (numbers[first] + numbers[last] > target)
				last--;
			else
				first++;
		}
		return new int[] { first + 1, last + 1 };
	}

	// 方法三：
	public int[] twoSum3(int[] numbers, int target) {
		if (numbers == null || numbers.length == 0)
			return null;

		for (int i = 0; i < numbers.length; i++) {
			
			//在i后面查找，前面的不用管，这是与方法一的区别
			int start = i + 1, 
					end = numbers.length - 1, gap = target - numbers[i];
			while (start <= end) {
				int m = start + (end - start) / 2;
				if (numbers[m] == gap)
					return new int[] { i + 1, m + 1 };
				else if (numbers[m] > gap)
					end = m - 1;
				else
					start = m + 1;
			}
		}
		return null;
	}

}
