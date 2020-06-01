package com.lun.easy;

public class SqrtX {
	public int mySqrt(int x) {

		int left = 1, right = x;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (mid == x / mid) {//A little trick is using i <= x / i for comparison, 
								//instead of i * i <= x, to avoid exceeding integer upper limit.
				return mid;
			} else if (mid < x / mid) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return right;
	}

	public int mySqrt2(int n) {
		if (n == 0)
			return 0;
		double last = 0;
		double res = 1;
		while (res != last) {
			last = res;
			res = (res + n / res) / 2;
		}
		return (int) res;
	}
}
