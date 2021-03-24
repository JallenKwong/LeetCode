package com.lun.easy;

import java.util.Arrays;
import java.util.HashSet;

public class PowerOfThree {

	//方法一：switch版
	public boolean isPowerOfThree1(int num) {
		switch (num) {
			case 1: return true;
			case 3: return true;
			case 9: return true;
			case 27: return true;
			case 81: return true;
			case 243: return true;
			case 729: return true;
			case 2187: return true;
			case 6561: return true;
			case 19683: return true;
			case 59049: return true;
			case 177147: return true;
			case 531441: return true;
			case 1594323: return true;
			case 4782969: return true;
			case 14348907: return true;
			case 43046721: return true;
			case 129140163: return true;
			case 387420489: return true;
			case 1162261467: return true;
			default: return false;
		}
	}
	
	//方法二：求余
	public boolean isPowerOfThree2(int n) {
		// 1162261467 is 3^19, 3^20 is bigger than int
		return n > 0 && 1162261467 % n == 0;
	}

	//方法三：递归
	public boolean isPowerOfThree3(int n) {
		return n > 0 && (n == 1 || (n % 3 == 0 && isPowerOfThree3(n / 3)));
	}

	//方法四：迭代
	public boolean isPowerOfThree4(int n) {
		if (n > 1)
			while (n % 3 == 0)
				n /= 3;
		return n == 1;
	}

	
	private static HashSet<Integer> POWER_OF_THREE_SET = new HashSet<>(
			Arrays.asList(1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969,
					14348907, 43046721, 129140163, 387420489, 1162261467));

	//方法五：哈希表缓存
	public boolean isPowerOfThree5(int n) {
		return POWER_OF_THREE_SET.contains(n);
	}

	private static int[] POWER_OF_THREE_LIST = new int[] { 1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147,
			531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467 };

	//方法六：二分查找缓存
	public boolean isPowerOfThree6(int n) {
		return Arrays.binarySearch(POWER_OF_THREE_LIST, n) >= 0;
	}

}

