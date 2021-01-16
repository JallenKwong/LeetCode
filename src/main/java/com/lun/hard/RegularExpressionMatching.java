package com.lun.hard;

public class RegularExpressionMatching {
	//方法一：动态规划
	public boolean isMatch1(String s, String p) {
		if (p == null || p.length() == 0)
			return (s == null || s.length() == 0);

		boolean dp[][] = new boolean[s.length() + 1][p.length() + 1];
		dp[0][0] = true;
		for (int j = 2; j <= p.length(); j++) {
			dp[0][j] = p.charAt(j - 1) == '*' && dp[0][j - 2];
		}

		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= p.length(); j++) {
				if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.')
					dp[i][j] = dp[i - 1][j - 1];
				else if (p.charAt(j - 1) == '*')
					dp[i][j] = dp[i][j - 2]
							|| ((s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') && dp[i - 1][j]);
			}
		}

		return dp[s.length()][p.length()];
	}

	//方法二：递归
	public boolean isMatch2(String s, String p) {
		if (p.length() == 0) {
			return s.length() == 0;
		}
		if (p.length() > 1 && p.charAt(1) == '*') { // second char is '*'
			if (isMatch2(s, p.substring(2))) {
				return true;
			}
			if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0))) {
				return isMatch2(s.substring(1), p);
			}
			return false;
		} else { // second char is not '*'
			if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0))) {
				return isMatch2(s.substring(1), p.substring(1));
			}
			return false;
		}
	}

}
