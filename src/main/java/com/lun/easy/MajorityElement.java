package com.lun.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	// 方法一：使用排序
	public int majorityElement1(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	// 方法二：使用HashMap
	public int majorityElement2(int[] nums) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		// Hashtable<Integer, Integer> myMap = new Hashtable<Integer, Integer>();
		int ret = 0;
		for (int num : nums) {
			if (!myMap.containsKey(num))
				myMap.put(num, 1);
			else
				myMap.put(num, myMap.get(num) + 1);
			if (myMap.get(num) > nums.length / 2) {
				ret = num;
				break;
			}
		}
		return ret;
	}

	// 方法三：Moore 投票算法
	public int majorityElement3(int[] nums) {
		int count = 0, ret = 0;
		for (int num : nums) {
			if (count == 0)
				ret = num;
			if (num != ret)
				count--;
			else
				count++;
		}
		return ret;
	}

	// 方法四：位操作1
	public int majorityElement4_1(int[] nums) {
		int[] bit = new int[32];
		for (int num : nums)
			for (int i = 0; i < 32; i++)
				if ((num >> (31 - i) & 1) == 1)
					bit[i]++;
		int ret = 0;
		for (int i = 0; i < 32; i++) {
			bit[i] = bit[i] > nums.length / 2 ? 1 : 0;
			ret += bit[i] * (1 << (31 - i));
		}
		return ret;
	}

	// 方法四：位操作2
	public int majorityElement4_2(int[] nums) {
		int majority = 0;
		for (int i = 0, mask = 1; i < 32; i++, mask <<= 1) {
			int bits = 0;
			for (int num : nums) {
				if ((num & mask) > 0) {
					bits++;
				}
			}
			if (bits > nums.length / 2) {
				majority |= mask;
			}
		}
		return majority;
	}

	// 方法五：概率计算
	public int majorityElement5(int[] nums) {
		int n = nums.length, candidate = 0;
		while (true) {
			candidate = nums[(int) (Math.random() * n)];
			int counter = 0;
			for (int num : nums) {
				if (num == candidate) {
					counter++;
				}
			}
			if (counter > n / 2) {
				break;
			}
		}
		return candidate;
	}

	// 方法六：分治算法
	public int majorityElement6(int[] nums) {
		return findMajority(nums, 0, nums.length - 1);
	}

	private int findMajority(int[] nums, int low, int high) {
		if (low == high)
			return nums[low];

		int mid = low + (high - low) / 2;

		int left = findMajority(nums, low, mid);
		int right = findMajority(nums, mid + 1, high);

		if (left == right)
			return left;

		int countLeft = getFreq(nums, left, low, mid);
		int countRight = getFreq(nums, right, mid + 1, high);
		if (countLeft > countRight)
			return left;
		return right;
	}

	private int getFreq(int[] nums, int val, int low, int high) {
		int res = 0;

		for (int i = low; i <= high; i++) {
			if (nums[i] == val)
				res++;
		}
		return res;
	}

}
