package com.lun.easy;

import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfInteger {
	public List<Integer> addToArrayForm(int[] A, int K) {
		List<Integer> result = new LinkedList<>();
		int index = A.length - 1, carry = 0;
		while (index >= 0 || K > 0 || carry == 1) {
			int a = index < 0 ? 0 : A[index--];
			int b = K - (K / 10) * 10;
			K /= 10;
			int s = a + b + carry;
			result.add(0, s - (carry = s / 10) * 10);
		}

		return result;
	}
}
