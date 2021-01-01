package com.lun.medium;

public class LongestPalindromicSubstring {

	// 方法一：以中心字符扩展探测回文
	public String longestPalindrome1(String s) {
		int maxLen = 0, startIndex = 0;

		for (int i = 0; i < s.length(); i++) {
			int len1 = extend(s, i, i);
			int len2 = extend(s, i, i + 1);
			int tempMax = Math.max(len1, len2);

			if (tempMax > maxLen) {
				maxLen = tempMax;
				startIndex = len1 > len2 ? i - len1 / 2 : i - len2 / 2 + 1;
			}
		}

		return s.substring(startIndex, startIndex + maxLen);
	}

	private int extend(String s, int i, int j) {
		for (; i > -1 && j < s.length(); i--, j++) {
			if (s.charAt(i) != s.charAt(j))
				break;
		}
		return j - i - 1;
	}

	// 方法二：使用动态规划算法
	public String longestPalindrome2(String s) {
		int sLength = s.length();
		String res = null;

		boolean[][] dp = new boolean[sLength][sLength];

		for (int startIndex = sLength - 1; startIndex >= 0; startIndex--) {
			for (int endIndex = startIndex; endIndex < sLength; endIndex++) {
				dp[startIndex][endIndex] = s.charAt(startIndex) == s.charAt(endIndex) // 
						&& (endIndex - startIndex < 3 || dp[startIndex + 1][endIndex - 1]);

				if (dp[startIndex][endIndex] && (res == null || endIndex - startIndex + 1 > res.length())) {
					res = s.substring(startIndex, endIndex + 1);
				}
			}
		}

		return res;
	}

}
