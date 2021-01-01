package com.lun.easy;

public class ReverseInteger {
	public int reverse(int x) {
		int result = 0, last = 0;
		while (x != 0) {
			last = result;
			result = result * 10 + x % 10;
			if (result / 10 != last) {
				return 0;
			}
			x /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE + 1);// -2147483648
		System.out.println(964632435 * 10);// 1056389758
		int result = 0;
		for (int i = 0; i < 10; i++)
			result += 964632435;
		System.out.println(result);// 1056389758
	}

}
