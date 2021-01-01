package com.lun.medium;

public class ContainerWithMostWater {

	// 方法一：暴力算法
	public int maxArea1(int[] height) {
		int maxCapacity = 0;

		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int min = Math.min(height[i], height[j]);
				int distance = j - i;
				maxCapacity = Math.max(maxCapacity, min * distance);
			}
		}
		return maxCapacity;
	}

	// 方法二：双指针
	public int maxArea2(int[] height) {
		int S = 0, i = 0, j = height.length - 1;
		while (i < j) {
			S = Math.max(S, (j - i) * Math.min(height[i], height[j]));
			if (height[i] < height[j])
				i++;
			else
				j--;
		}
		return S;
	}

}
