package com.lun.medium;

public class LongestCommonSubsequence {
	// 方法一：标准DP
	public int longestCommonSubsequence(String text1, String text2) {

		int[][] dp = new int[text1.length() + 1][text2.length() + 1];

		for (int i = 1; i <= text1.length(); i++) {
			for (int j = 1; j <= text2.length(); j++) {
				if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		return dp[text1.length()][text2.length()];
	}

	// 方法二：方法一的空间优化
	public int longestCommonSubsequence2(String s1, String s2) {
		int m = s1.length(), n = s2.length();
		if (m < n)// 本判断语句目的可以减少空间复杂度。可以移除本判断语句。
			return longestCommonSubsequence2(s2, s1);
		int[][] dp = new int[2][n + 1];
		for (int i = 1, k = 1; i <= m; ++i, k ^= 1)
			for (int j = 1; j <= n; ++j)
				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					dp[k][j] = 1 + dp[k ^ 1][j - 1];
				else
					dp[k][j] = Math.max(dp[k ^ 1][j], dp[k][j - 1]);
		return dp[m & 1][n];
	}

	// 方法三：方法一的空间优化Plus
	public int longestCommonSubsequence3(String text1, String text2) {
		int m = text1.length(), n = text2.length();
		if (m < n) {// 本判断语句目的可以减少空间复杂度。可以移除本判断语句。
			return longestCommonSubsequence3(text2, text1);
		}

		int[] dp = new int[n + 1];
		for (int i = 1; i <= text1.length(); ++i) {
			for (int j = 1, left = 0, leftUp = 0, newOne = 0; j <= text2.length(); ++j) {

				if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
					newOne = leftUp + 1;
				} else {
					newOne = Math.max(left, dp[j]);
				}
				leftUp = dp[j];
				left = dp[j] = newOne;// 为同行下一元素以及下行元素做准备

			}
		}
		return dp[n];
	}
}
