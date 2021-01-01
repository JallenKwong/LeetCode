package com.lun.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	// 方法一：暴力算法
	public boolean containsDuplicate1(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	// 方法二：先排序，再查找
	public boolean containsDuplicate2(int[] nums) {

		Arrays.sort(nums);
		for (int ind = 1; ind < nums.length; ind++) {
			if (nums[ind] == nums[ind - 1]) {
				return true;
			}
		}
		return false;
	}

	// 方法三：用哈希表作缓存
	public boolean containsDuplicate3(int[] nums) {
		Set<Integer> cache = new HashSet<>();
		for (int num : nums) {
			if (cache.contains(num))
				return true;
			cache.add(num);
		}
		return false;
	}
}
