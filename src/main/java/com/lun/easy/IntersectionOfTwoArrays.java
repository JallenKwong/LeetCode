package com.lun.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

	// 方法一：我写的，使用 java8的特性
	public int[] intersection1(int[] nums1, int[] nums2) {
		Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

		Set<Integer> tmp = new HashSet<>();
		for (int x : nums2)
			if (set1.contains(x))
				tmp.add(x);

		return tmp.stream().mapToInt(Integer::intValue).toArray();
	}

	// 方法二：set的retainAll方法
	public int[] intersection2(int[] nums1, int[] nums2) {
		Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
		Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
		set1.retainAll(set2);
		return set1.stream().mapToInt(Integer::intValue).toArray();
	}

	// 方法三：传统做法
	public int[] intersection3(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> intersect = new HashSet<>();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i])) {
				intersect.add(nums2[i]);
			}
		}
		int[] result = new int[intersect.size()];
		int i = 0;
		for (Integer num : intersect) {
			result[i++] = num;
		}
		return result;
	}

	// 方法四：使用Java8的精简版
	public int[] intersection4(int[] nums1, int[] nums2) {
		Set<Integer> set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
		return Arrays.stream(nums1).distinct().filter(e -> set.contains(e)).toArray();
	}

	// 方法五：位图法
	public int[] intersection5(int[] nums1, int[] nums2) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int[] ans = new int[nums1.length];
		int idx = 0;
		for (int i : nums1) {
			if (i > max)
				max = i;
			if (i < min)
				min = i;
		}
		for (int i : nums2) {
			if (i > max)
				max = i;
			if (i < min)
				min = i;
		}
		boolean[] map = new boolean[max - min + 1];
		for (int i : nums1)
			map[i - min] = true;
		for (int i : nums2) {
			if (map[i - min]) {
				ans[idx++] = i;
				map[i - min] = false;
			}
		}
		return Arrays.copyOf(ans, idx);
	}

}
