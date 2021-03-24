package com.lun.easy;

public class AddStrings {
	//方法一：最初版
	public String addStrings1(String num1, String num2) {
		int index1 = num1.length() - 1, index2 = num2.length() - 1;
		StringBuilder sb = new StringBuilder();

		int carry = 0;
		while (index1 >= 0 || index2 >= 0) {
			int a = index1 >= 0 ? num1.charAt(index1--) - '0' : 0;
			int b = index2 >= 0 ? num2.charAt(index2--) - '0' : 0;
			int s = a + b + carry;

			carry = s >= 10 ? 1 : 0;
			int rs = s >= 10 ? s - 10 : s;
			sb.insert(0, rs);
		}

		if (carry > 0)
			sb.insert(0, carry);

		return sb.toString();
	}

	//方法二：方法一的改进版
	public String addStrings2(String num1, String num2) {
		int index1 = num1.length() - 1, index2 = num2.length() - 1;
		StringBuilder sb = new StringBuilder();

		int carry = 0;
		while (index1 >= 0 || index2 >= 0 || carry == 1) {
			int a = index1 >= 0 ? num1.charAt(index1--) - '0' : 0;
			int b = index2 >= 0 ? num2.charAt(index2--) - '0' : 0;
			int s = a + b + carry;

			carry = s >= 10 ? 1 : 0;
			int rs = s >= 10 ? s - 10 : s;
			sb.append(rs);
		}

		return sb.reverse().toString();
	}
}
