package com.lun.easy;

public class ReverseBits {

	// 方法一：双指针 + 位操作
	public int reverseBits1(int n) {
		int p1 = Integer.MIN_VALUE, p2 = 1;
		do {
			boolean b1 = (n & p1) == 0;
			boolean b2 = (n & p2) == 0;
			if (b1 ^ b2) {
				n = b1 ? (n | p1) : (n & ~p1);
				n = b2 ? (n | p2) : (n & ~p2);
			}
			p1 >>>= 1;
			p2 <<= 1;
		} while (p1 > p2);

		return n;
	}

	// 方法二：乾坤大挪移
	public int reverseBits2(int n) {
		n = (n >>> 16) | (n << 16);
		n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);
		n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);
		n = ((n & 0xcccccccc) >>> 2) | ((n & 0x33333333) << 2);
		n = ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);
		return n;
	}

	// 方法三：队列 + 位操作
	public int reverseBits3(int n) {
		if (n == 0)
			return 0;

		int result = 0;
		for (int i = 0; i < 32; i++) {
			result <<= 1;
			if ((n & 1) == 1)
				result++;// 可写成 result += n&1;
			n >>= 1;
		}
		return result;
	}

	// 方法四：比方法三精简些
	public int reverseBits4(int n) {
		int result = 0;
		for (int i = 0; i < 32; i++)
			result = (result << 1) + (n >> i & 1);

		return result;
	}

}
