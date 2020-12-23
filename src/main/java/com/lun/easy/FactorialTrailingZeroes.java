package com.lun.easy;

import java.math.BigInteger;

public class FactorialTrailingZeroes {

	// 方法一：暴力算法
	public int trailingZeroes1(int n) {
		int result = 0;
		BigInteger num = factorial(n);
		while (num.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
			result++;
			num = num.divide(BigInteger.TEN);
		}
		return result;
	}

	public BigInteger factorial(int n) {
		BigInteger product = BigInteger.valueOf(1);
		for (int i = n; i > 0; i--)
			product = product.multiply(BigInteger.valueOf(i));
		return product;
	}

	// 方法二：根据方法一规律可得
	public int trailingZeroes2(int n) {
		// if(n == 0) return 0;
		int num = (int) (Math.log(n) / Math.log(5));
		int result = 0;
		while (num > 0)
			result += (n / (int) Math.pow(5, num--));
		return result;
	}

	// 方法三：别人写的，更精简
	public int trailingZeroes3(int n) {
		return n == 0 ? 0 : n / 5 + trailingZeroes3(n / 5);
	}

}
