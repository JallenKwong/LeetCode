package com.lun.medium;

public class IntegerToRoman {

	// 方法一：我写的
	public String intToRoman1(int num) {
		if (num < 1 || num > 3999)
			throw new IllegalArgumentException(String.valueOf(num));

		StringBuilder sb = new StringBuilder();
		int digit = 0;
		while (num > 0) {
			int n1 = num % 10;
			if (n1 != 0) {
				int n2 = n1 * (int) Math.pow(10, digit);
				sb.insert(0, map(n2));
			}
			digit++;
			num /= 10;
		}
		return sb.toString();
	}

	private String map(int num) {
		if (0 < num && num <= 3)
			return repeat("I", num);
		if (num == 4)
			return "IV";
		if (5 <= num && num <= 8)
			return "V" + repeat("I", num - 5);
		if (num == 9)
			return "IX";
		if (10 <= num && num <= 30)
			return repeat("X", num / 10);
		if (num == 40)
			return "XL";
		if (50 <= num && num <= 80)
			return "L" + repeat("X", num / 10 - 5);
		if (num == 90)
			return "XC";
		if (100 <= num && num <= 300)
			return repeat("C", num / 100);
		if (num == 400)
			return "CD";
		if (500 <= num && num <= 800)
			return "D" + repeat("C", num / 100 - 5);
		if (num == 900)
			return "CM";
		if (1000 <= num && num <= 3000)
			return repeat("M", num / 1000);

		return "";
	}

	private String repeat(String str, int num) {
		if (num < 1)
			return "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

	// 方法二：
	public String intToRoman2(int num) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] strs = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num -= values[i];
				sb.append(strs[i]);
			}
		}
		return sb.toString();
	}

	// 方法三：
	public String intToRoman3(int num) {
		String M[] = { "", "M", "MM", "MMM" };
		String C[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String X[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String I[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
	}

}
