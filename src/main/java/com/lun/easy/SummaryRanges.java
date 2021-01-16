package com.lun.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	
	//方法一：我写的
	public List<String> summaryRanges1(int[] nums) {
		List<String> result = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return result;

		int left = nums[0], right = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (right + 1 == nums[i]) {
				right++;
			} else {
				result.add(left == right ? left + "" : left + "->" + right);
				left = right = nums[i];
			}
		}
		result.add(left == right ? left + "" : left + "->" + right);
		return result;
	}

	//方法二：别人写的
	public List<String> summaryRanges2(int[] nums) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int a = nums[i];
			while (i + 1 < nums.length && nums[i + 1] - nums[i] == 1) 
				i++;
			list.add(a == nums[i] ? a + "" : a + "->" + nums[i]);
		}
		return list;
	}
}
