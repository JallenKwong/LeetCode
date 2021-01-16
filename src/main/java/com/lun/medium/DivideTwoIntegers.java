package com.lun.medium;

public class DivideTwoIntegers {

	//方法一：我写的
	public int divide(int dividend, int divisor) {
		if (divisor == 0)
			throw new ArithmeticException();

		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;// 针对溢出情况

		boolean negative = dividend > 0 ^ divisor > 0;

		if (dividend > 0) dividend = -dividend;
		if (divisor > 0) divisor = -divisor;

		int quotient = 0, product = 0;

		// 粗略得出商
		for (int i = 0; i < 32; i++) {
			int temp = divisor << i;// 相当于divisor * 2的i次方

			// temp >> i != divisor, 溢出情况
			if (temp < dividend || temp >> i != divisor) {
				break;
			} else if (temp > dividend) {
				product = temp;
				quotient = 1 << i;
			} else {
				return (negative ? -1 : 1) << i;
			}
		}

		// 较精确逼近商
		while (true) {
			int temp = product + divisor;
			// temp > 0, 溢出情况
			if (temp < dividend || temp > 0)
				break;
			product = temp;
			quotient++;
		}

		return negative ? -quotient : quotient;
	}

	//方法二：
	public int divide2(int A, int B) {
		if (A == Integer.MIN_VALUE && B == -1)
			return Integer.MAX_VALUE;
		int a = Math.abs(A), b = Math.abs(B), res = 0, x = 0;
		while (a - b >= 0) {
			for (x = 0; a - (b << x << 1) >= 0; x++)
				;
			res += (1 << x);
			a -= (b << x);
		}
		return (A > 0) == (B > 0) ? res : -res;
	}

	//方法三：
	public int divide3(int A, int B) {
		if (A == Integer.MIN_VALUE && B == -1)
			return Integer.MAX_VALUE;
		int a = Math.abs(A), b = Math.abs(B), res = 0;
		for (int x = 31; x >= 0; x--)
			if ((a >>> x) - b >= 0) {
				res += 1 << x;
				a -= b << x;
			}
		return (A > 0) == (B > 0) ? res : -res;
	}

}
