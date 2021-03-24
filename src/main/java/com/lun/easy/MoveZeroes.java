package com.lun.easy;

public class MoveZeroes {

	//方法一：从尾向前遍历，如果是0移到尾后，而后的元素向移位
	public void moveZeroes1(int[] nums) {
		if (nums == null)
			return;

		int end = nums.length - 1;
		for (int i = nums.length - 1; i > -1; i--) {
			if (nums[i] == 0) {
				for (int j = i + 1; j <= end; j++)
					nums[j - 1] = nums[j];
				nums[end--] = 0;
			}
		}
	}

	//方法二：滚雪球法
	public void moveZeroes2(int[] nums) {
		if (nums == null)
			return;

		int cur = 0;

		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] != 0) {
				int temp = nums[cur];
				nums[cur++] = nums[i];
				nums[i] = temp;
			}
		}
	}
}
