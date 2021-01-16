package com.lun.easy;

public class RomanToInteger {
	
	//方法一：我写的早期版本
	public int romanToInt1(String romanNum) {
		int sum = 0;
		int[] in = new int[romanNum.length()];
		for (int i = 0; i != in.length; i++) {
			in[i] = map(romanNum.charAt(i));
			if (i != 0) {
				if (in[i - 1] < in[i]) {
					in[i - 1] = -in[i - 1];
				}
			}
		}
		for (int t : in) {
			sum += t;
		}
		return sum;
	}

	//方法二：我写的，方法一的改进版
	public int romanToInt2(String romanNum) {
		int sum = 0, last = Integer.MAX_VALUE;

		for (int i = 0; i < romanNum.length(); i++) {
			int current = map(romanNum.charAt(i));
			sum += current;
			if (last < current)
				sum += -2 * last;
			last = current;
		}

		return sum;
	}

	private int map(char c) {
		switch (c) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return 0;
		}
	}

	//方法三：别人写的
	public int romanToInt3(String s) {
		int res = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			switch (c) {
			case 'I':
				res += (res >= 5 ? -1 : 1);
				break;
			case 'V':
				res += 5;
				break;
			case 'X':
				res += 10 * (res >= 50 ? -1 : 1);
				break;
			case 'L':
				res += 50;
				break;
			case 'C':
				res += 100 * (res >= 500 ? -1 : 1);
				break;
			case 'D':
				res += 500;
				break;
			case 'M':
				res += 1000;
				break;
			}
		}
		return res;
	}

}
