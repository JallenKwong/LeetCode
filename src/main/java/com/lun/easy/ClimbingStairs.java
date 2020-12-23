package com.lun.easy;

public class ClimbingStairs {
	public int climbStairs1(int n) {
		if (n == 1 || n == 2)
			return n;

		int first = 1, second = 2;

		for (int i = 2; i < n; i++) {
			int temp = first + second;
			first = second;
			second = temp;
		}

		return second;
	}

	public int climbStairs2(int n) {
		if (n == 1)
			return 1;
		return climbStairs2(1, 2, n, 2);
	}

	private int climbStairs2(int first, int second, int num, int index) {
		return index == num ? second : climbStairs2(second, first + second, num, index + 1);
	}

	public int climbStairs3(int n) {
		int a = 1, b = 1;
		while (n-- > 0)
			a = (b += a) - a;
		return a;
	}

}
