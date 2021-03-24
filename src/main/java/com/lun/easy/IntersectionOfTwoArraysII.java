package com.lun.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysII {

	// 方法一：我写的
	public int[] intersect1(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null || //
				nums1.length == 0 || nums2.length == 0)
			return new int[] {};

		if (nums1.length > nums2.length) {// 这if语块可省略
			int[] temp = nums1;
			nums1 = nums2;
			nums2 = temp;
		}

		Map<Integer, Integer> num2count = new HashMap<>();

		for (int n : nums1) {
			Integer count = num2count.get(n);
			if (count == null)
				count = 0;
			num2count.put(n, count + 1);
		}

		List<Integer> list = new ArrayList<>();
		for (int n : nums2) {
			Integer count = num2count.get(n);
			if (count != null && count > 0) {
				list.add(n);
				num2count.put(n, count - 1);
			}
		}
		int[] result = new int[list.size()];

		for (int i = 0; i < list.size(); i++)
			result[i] = list.get(i);

		return result;
	}

	// 方法二：别人写的，与方法一思路一致，代码简洁些
	public int[] intersect2(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : nums1)
			map.put(i, map.getOrDefault(i, 0) + 1);

		ArrayList<Integer> list = new ArrayList<>();
		for (int i : nums2) {
			if (map.get(i) != null && map.get(i) > 0) {
				list.add(i);
				map.put(i, map.get(i) - 1);
			}
		}
		int[] ret = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ret[i] = list.get(i);
		}
		return ret;
	}

	// 方法三：排序两数组，然后用两指针齐齐比较得出结果
	public int[] intersect3(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int n = nums1.length, m = nums2.length;
		int i = 0, j = 0;
		List<Integer> list = new ArrayList<>();
		while (i < n && j < m) {
			int a = nums1[i], b = nums2[j];
			if (a == b) {
				list.add(a);
				i++;
				j++;
			} else if (a < b) {
				i++;
			} else {
				j++;
			}
		}
		int[] ret = new int[list.size()];
		for (int k = 0; k < list.size(); k++)
			ret[k] = list.get(k);
		return ret;
	}

	// 方法四：Java8版
	public int[] intersect4(int[] nums1, int[] nums2) {
		Map<Integer, Long> map = Arrays.stream(nums2).boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		return Arrays.stream(nums1).filter(e -> {
			if (!map.containsKey(e))
				return false;
			map.put(e, map.get(e) - 1);
			if (map.get(e) == 0)
				map.remove(e);
			return true;
		}).toArray();
	}

}
