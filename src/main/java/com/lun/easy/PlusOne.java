package com.lun.easy;

public class PlusOne {
	public int[] plusOne1(int[] digits) {
		boolean carry = true;

		for (int i = digits.length - 1; carry && i >= 0; i--) {
			digits[i] = (carry = ++digits[i] == 10) ? 0 : digits[i];
		}

		if (carry) {
			digits = new int[digits.length + 1];
			digits[0] = 1;
		}

		return digits;
	}

	public int[] plusOne2(int[] digits) {
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;

		return newNumber;
	}
}
