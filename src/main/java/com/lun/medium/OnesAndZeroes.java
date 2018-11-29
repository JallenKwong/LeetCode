package com.lun.medium;

public class OnesAndZeroes {
	public int findMaxForm(String[] strs, int m, int n) {
		int[][] dp = new int[m + 1][n + 1];
		for (String s : strs) {
			int[] count = count(s);
			for (int i = m; i >= count[0]; i--)
				for (int j = n; j >= count[1]; j--)
					dp[i][j] = Math.max(1 + dp[i - count[0]][j - count[1]], dp[i][j]);
		}
		return dp[m][n];
	}

	public int[] count(String str) {
		int[] res = new int[2];
		for (int i = 0; i < str.length(); i++)
			res[str.charAt(i) - '0']++;
		return res;
	}

	public int findMaxForm2(String[] strs, int m, int n) {
		return findMaxFormStartingWith(strs, m, n, 0);
	}

	private int findMaxFormStartingWith(String[] strs, int m, int n, int begin) {
		if ((begin == strs.length) || (m + n == 0)) {
			return 0;
		}
		int countByAddingString = 0;
		String current = strs[begin];
		int zeroes = countZeroesIn(current);
		int ones = current.length() - zeroes;
		
		if (m >= zeroes && n >= ones) {
			countByAddingString = 1 + findMaxFormStartingWith(strs, m - zeroes, n - ones, begin + 1);
		}
		
		int countBySkippingString = findMaxFormStartingWith(strs, m, n, begin + 1);
		
		if (countByAddingString > countBySkippingString) {
			return countByAddingString;
		}
		
		return countBySkippingString;
	}

	private int countZeroesIn(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				count++;
			}
		}
		return count;
	}

}
