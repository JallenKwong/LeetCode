package com.lun.medium;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class UglyNumberII {

	
	public int nthUglyNumber1(int n) {
		if (n < 1 || n > 1690)
			throw new IllegalArgumentException();

		int index = 0, result = 1;
		while (true) {
			if (isUgly(result))
				index++;
			if (index < n) {
				result++;
			} else
				break;
		}

		return result;
	}

	private boolean isUgly(int num) {
		for (int i = 2; i < 6 && num > 0; i++)
			while (num % i == 0)
				num /= i;
		return num == 1;
	}

	public int nthUglyNumber2(int n) {
		if (n < 1 || n > 1690)
			throw new IllegalArgumentException();

		int[] uglyNumbers = new int[n];
		uglyNumbers[0] = 1;

		int index2 = 0, index3 = 0, index5 = 0, uglyNumbersIndex = 1;
		while (uglyNumbersIndex < n) {
			int maybeNextUglyNumber2 = uglyNumbers[index2] * 2, //
					maybeNextUglyNumber3 = uglyNumbers[index3] * 3, //
					maybeNextUglyNumber5 = uglyNumbers[index5] * 5;

			int min = min(maybeNextUglyNumber2, maybeNextUglyNumber3, maybeNextUglyNumber5);

			uglyNumbers[uglyNumbersIndex++] = min;

			if (maybeNextUglyNumber2 == min)
				index2++;
			if (maybeNextUglyNumber3 == min)
				index3++;
			if (maybeNextUglyNumber5 == min)
				index5++;
		}
		return uglyNumbers[n - 1];
	}

	private int min(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	public int nthUglyNumber3(int n) {
		if (n == 1)
			return 1;
		PriorityQueue<Long> q = new PriorityQueue<>();
		q.add(1l);

		for (long i = 1; i < n; i++) {
			long tmp = q.poll();
			while (!q.isEmpty() && q.peek() == tmp)// 去重
				tmp = q.poll();

			q.add(tmp * 2);
			q.add(tmp * 3);
			q.add(tmp * 5);
		}
		return q.poll().intValue();
	}

	public int nthUglyNumber4(int n) {
		TreeSet<Long> ans = new TreeSet<>();
		ans.add(1L);
		for (int i = 0; i < n - 1; ++i) {
			long first = ans.pollFirst();
			ans.add(first * 2);
			ans.add(first * 3);
			ans.add(first * 5);
		}
		return ans.first().intValue();
	}

}
