package com.lun.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateII {

	// 方法一：我写的，用哈希表实现
	public boolean containsNearbyDuplicate1(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 1)
			return false;

		Map<Integer, Integer> cache = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer existedIndex = cache.get(nums[i]);
			if (existedIndex != null && Math.abs(existedIndex - i) <= k)
				return true;
			cache.put(nums[i], i);
		}

		return false;
	}

	// 方法二：比方法一更加简单
	public boolean containsNearbyDuplicate2(int[] nums, int k) {
		Map<Integer, Integer> indices = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer lastIndex = indices.put(nums[i], i);
			if (lastIndex != null && (i - lastIndex) <= k)
				return true;
		}
		return false;
	}

	// 方法三：用HashSet实现
	public boolean containsNearbyDuplicate3(int[] nums, int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i > k)
				set.remove(nums[i - k - 1]);
			if (!set.add(nums[i]))
				return true;
		}
		return false;
	}

}
