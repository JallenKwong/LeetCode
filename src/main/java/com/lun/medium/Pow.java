package com.lun.medium;

public class Pow {
	public double myPow(double x, int n) {
		double spe = 1;
		if (n == Integer.MIN_VALUE) {// 针对最小值，Math.abs(Integer.MIN_VALUE)还是返回Integer.MIN_VALUE
			n++;
			spe = x;
		}

		int num = Math.abs(n);
		double product = helper(x, num);
		return n > 0 ? product : 1 / (product * spe);
	}

	private double helper(double x, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		double temp = helper(x, n / 2);
		return temp * temp * ((n & 1) == 1 ? x : 1);
	}

	public double myPow2(double x, int n) {
		if (n == 0)
			return 1;
		if (n < 0) {
			n = -n;
			x = 1 / x;
		}
		System.out.println(-Integer.MIN_VALUE);
		return myPow(x * x, n / 2) * ((n & 1) == 1 ? x : 1);
	}
}
