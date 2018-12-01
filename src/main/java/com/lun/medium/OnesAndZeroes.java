package com.lun.medium;

public class OnesAndZeroes {
	public int findMaxForm(String[] strs, int m, int n) {
		int[][] dp = new int[m + 1][n + 1];//the maximum number using limited m number of '0's and n number of '1's
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
	
	/* findMaxForm的轨迹
		输入：
		array = {"10", "0", "1"}
		
		m = 1 //0s
		n = 1 //1s
		
		dp = new int[2][2]
		
		第0集循环 s in strs
			s = "10"
			count = count(s) = {1, 1}
			
			第1集循环
				i = m = 1, i >= count[0] = 1 为 true
					第2级循环
						j = n = 1, j >= count[1] = 1 为 true
							a = 1 + dp [(i = 1) - (count[0]= 1) = 0][(j = 1) - (count[1] = 1) = 0]
							  = 1 + dp[0][0] = 1
							b = dp[i = 1][j = 1] = 0
							dp[i = 1][j = 1] = max(a, b) = 1//<-----------------------------
							j--,j = 0
						j = 0, j >= count[1] = 1 为 false跳出第2级循环
					i--, i = 0		
				i = 0, i >= count[0] = 1 为 false跳出第1级循环
						
			s = "0"
			count = count(s) = {1, 0}
				第1集循环
				i = m = 1, i >= count[0] = 1 为 true
					第2级循环
						j = n = 1, j >= count[1] = 0 为 true
							a = 1 + dp [(i = 1) - (count[0]= 1) = 0][(j = 1) - (count[1] = 0) = 1] = 1
							  = 1 + dp[0][1] = 1
							b = dp[i = 1][j = 1] = 1
							
							dp[i = 1][j = 1] = max(a, b) = 1//<-----------------------------
							j--,j = 0
							
						j = 0, j >= count[1] = 0 为 true
							a = 1 + dp [(i = 1) - (count[0]= 1) = 0][(j = 0) - (count[1] = 0) = 0] = 1
							  = 1 + dp [0][0] = 1
							b = dp[i = 1][j = 0] = 1
							dp[i = 1][j = 0] = max(a, b) = 1//<-----------------------------
							j--,j = -1
						j = -1, j >= count[1] = 0 为 false跳出第2级循环
					
					i--, i = 0		
				i = 0, i >= count[0] = 1 为 false跳出第1级循环
		
			s = "1"
			count = count(s) = {0, 1}
				第1集循环
				i = m = 1, i >= count[0] = 0 为 true
					第2级循环
						j = n = 1, j >= count[1] = 1 为 true
							a = 1 + dp [(i = 1) - (count[0]= 0) = 1][(j = 1) - (count[1] = 1) = 0] = 1
							  = 1 + dp [1][0] = 2
							b = dp[i = 1][j = 1] = 1
							
							dp[i = 1][j = 1] = max(a, b) = 2//<-----------------------------
							j--, j = 0
						j = 0, j >= count[1] = 1 为 false跳出第2级循环
					i--, i = 0
					
				i = 0, i >= count[0] = 0 为 true
					第2级循环
						j = n = 1, j >= count[1] = 1 为 true
							a = 1 + dp [(i = 0) - (count[0]= 0) = 0][(j = 1) - (count[1] = 1) = 0] = 1
							  = 1 + dp [0][0] = 1
							b = dp[i = 0][j = 1] = 1
							
							dp[i = 0][j = 1] = max(a, b) = 1//<-----------------------------
							j--, j = 0
						j = 0, j >= count[1] = 1 为 false跳出第2级循环
					i--, i = -1
					
				i = -1, i >= count[0] = 0 为 false跳出第1级循环	
					
			跳出第0集循环
		
		输出:dp[m = 1][n = 1] = 2
		
		/////////////////////////////////////////////////////////////////

		The idea is to build up the solution for 0..m zeros and 0..n ones, from only knowing 1 string, 2 strings, ..., up to n strings.
		
		For example, for array = {"10", "0", "1"}, m = 1, n = 1.
		
			for first string "10":
				zero = 0, one = 0
				zero = 1, one = 0
				zero = 0, one = 1
				zero = 1, one = 1, can form "10" [+1]
				
			continue on the second string "0", with previous knowledge of string "10":
				zero = 0, one = 0
				zero = 1, one = 0, can form "0" [+1]
				zero = 0, one = 1
				zero = 1, one = 1, can form "0" [+1] or 1 string ("10"), known from previous string
			
			continue on the last string "1", with previous knowledge of strings "10" and "0":
				zero = 0, one = 0
				zero = 1, one = 0, can't form "1", but we know it can form 1 string ("0") from previous set of strings
				zero = 0, one = 1, can form "1" (+1)
				zero = 1, one = 1, (can form "1" and 1 more string ("0") with zero = 1, one = 0, known from previous set of strings) or (1 string ("10"), known from previous set of strings)
		
		Hence, at the end, we know that with zero = 1, one = 1, with string "10", "0", and "1", the maximum number of strings we can form is 2.
		
	*/
	

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
