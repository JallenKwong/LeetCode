package com.lun.easy;

public class ShuffleTheArray {

	// 方法一：双指针，新数组，最直接的方法
	public int[] shuffle1(int[] nums, int n) {
		int[] result = new int[nums.length];
		int p1 = 0, p2 = n;
		for (int i = 0; i < nums.length;) {
			result[i++] = nums[p1++];
			result[i++] = nums[p2++];
		}
		return result;
	}

	// 方法二：位运算
	public int[] shuffle2(int[] nums, int n) {
		int i = n - 1;
		for (int j = nums.length - 1; j >= n; j--) {
			nums[j] <<= 10;
			nums[j] |= nums[i];
			i--;
		}

		i = 0;
		for (int j = n; j < nums.length; j++) {
			int num1 = nums[j] & 1023;
			int num2 = nums[j] >> 10;
			nums[i] = num1;
			nums[i + 1] = num2;
			i += 2;
		}

		return nums;
	}

	// 方法三
	public int[] shuffle3(int[] nums, int n) {
		for (int i = 1; i < nums.length; i++) {
			int j = i;
			int buffer = nums[i];
			while (buffer >= 0) {
				j = j < n ? j * 2 : ((j - n) * 2 + 1);
				int tmp = buffer;
				buffer = nums[j];
				nums[j] = -tmp;
			}
		}
		for (int i = 1; i < nums.length; i++) {
			nums[i] *= -1;
		}
		return nums;
	}

}
