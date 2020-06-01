package com.lun.easy;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();

		while (n != 0) {
			int yu = n % 26;

			if (yu == 0) {
				yu = 26;
			}

			sb.insert(0, (char) (yu - 1 + 'A'));

			n = (n - yu) / 26;
		}

		return sb.toString();
	}
	
	public String convertToTitle2(int n) {
		return n == 0 ? "" : convertToTitle2(--n / 26) + (char) ('A' + (n % 26));
	}
}
