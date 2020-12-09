package com.lun.easy;

public class MaximumSubarray {

	//方法一：暴力算法
	public int maxSubArray0(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if (sum > max)
					max = sum;
			}
		}
		return max;
	}

	//方法二：
	public int maxSubArray1(int[] A) {
		int maxSoFar = A[0], maxEndingHere = A[0];
		for (int i = 1; i < A.length; ++i) {
			maxEndingHere = Math.max(maxEndingHere + A[i], A[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

	//方法三：分而治之
	public int maxSubArray2(int[] nums) {
		return maxSubSum(nums, 0, nums.length - 1);
	}

	private int maxSubSum(int A[], int left, int right) {

		/* Base case */
		if (left == right) {
			return A[left];
		}

		int center = left + (right - left) / 2;
		
		//第一部分，第二部分
		int maxLeftSum = maxSubSum(A, left, center);
		int maxRightSum = maxSubSum(A, center + 1, right);
		
		//第三部分的最大和可以通过求出前半部分的最大和（包括前半部分最后一个元素）以及后半部分的最大和（包括后半部分第一个元素）而得到
		int maxLeftBorderSum = Integer.MIN_VALUE, leftBorderSum = 0;
		for (int i = center; i >= left; i--) {
			leftBorderSum += A[i];
			if (leftBorderSum > maxLeftBorderSum)
				maxLeftBorderSum = leftBorderSum;
		}

		int maxRightBorderSum = Integer.MIN_VALUE, rightBorderSum = 0;
		for (int i = center + 1; i <= right; i++) {
			rightBorderSum += A[i];
			if (rightBorderSum > maxRightBorderSum)
				maxRightBorderSum = rightBorderSum;
		}
		
		return Math.max(Math.max(maxLeftSum, maxRightSum), maxLeftBorderSum + maxRightBorderSum);
	}

	//方法四：
	public int maxSubArray3(int[] nums) {
		int max = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (sum < 0)
				sum = nums[i];
			else
				sum += nums[i];
			if (sum > max)
				max = sum;
		}
		return max;
	}
}
