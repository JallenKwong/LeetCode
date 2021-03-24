package com.lun.easy;

//我写的
public class RangeSumQueryImmutable {

	private int[] sums;

	public RangeSumQueryImmutable(int[] nums) {
		sums = new int[nums.length];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			sums[i] = sum;
		}

	}

	public int sumRange(int i, int j) {
		return sums[j] - (i == 0 ? 0 : sums[i - 1]);
	}
}

// 别人写的
class RangeSumQueryImmutable2 {

	private int[] sums;

	public RangeSumQueryImmutable2(int[] nums) {
		for (int i = 1; i < nums.length; i++)
			nums[i] += nums[i - 1];

		this.sums = nums;
	}

	public int sumRange(int i, int j) {
		if (i == 0)
			return sums[j];

		return sums[j] - sums[i - 1];
	}
}