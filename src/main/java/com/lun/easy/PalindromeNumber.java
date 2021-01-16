package com.lun.easy;

public class PalindromeNumber {

	// 方法一：我写的
	public boolean isPalindrome1(int x) {
		if (x < 0)
			return false;
		int[] digits = new int[10];
		int leftIndex = 0, rightIndex = -1;

		while (x > 0) {
			digits[++rightIndex] = x % 10;
			x /= 10;
		}

		while (leftIndex < rightIndex) {
			if (digits[leftIndex++] != digits[rightIndex--])
				return false;
		}

		return true;//
	}

	// 方法二：
	public boolean isPalindrome2(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0))
			return false;
		int rev = 0;
		while (x > rev) {
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		return (x == rev || x == rev / 10);
	}

	// 方法三：
	public boolean isPalindrome3(int x) {
		int palindromeX = 0;
		int inputX = x;
		while (x > 0) {
			palindromeX = palindromeX * 10 + (x % 10);
			x = x / 10;
		}
		return palindromeX == inputX;
	}

}
