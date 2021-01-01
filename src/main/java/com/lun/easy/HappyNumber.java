package com.lun.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	// 方法一：
	public boolean isHappy1(int n) {
		if (n < 1) return false;
		Set<Integer> cache = new HashSet<>();

		while (!cache.contains(n)) {
			cache.add(n);
			int sum = 0;
			while (n > 0) {
				int temp = n % 10;
				sum += temp * temp;
				n /= 10;
			}
			if ((n = sum) == 1) return true;
		}
		return false;
	}

	// 方法二：
	public boolean isHappy2(int n) {
		int slow, fast;
		slow = fast = n;
		do {
			slow = digitSquareSum(slow);
			fast = digitSquareSum(fast);
			if (fast == 1) return true;
			fast = digitSquareSum(fast);
			if (fast == 1) return true;
		} while (slow != fast);

		return false;
	}

	private int digitSquareSum(int n) {
		int sum = 0, tmp;
		while (n > 0) {
			tmp = n % 10;
			sum += tmp * tmp;
			n /= 10;
		}
		return sum;
	}

}
