package com.lun.easy;

public class NumberOfOneBits {

	// 方法一：
	public int hammingWeight1(int n) {
		int result = 0;
		while (n != 0) {
			// if((n & 1) == 1) result++;
			result += (n & 1);
			n >>>= 1;
		}
		return result;
	}

	// 方法二：
	int hammingWeight2(int n) {
		int count = 0;

		while (n != 0) {
			n &= (n - 1);
			count++;
		}

		return count;
	}
}
