package com.lun.easy;

public class LongestCommonPrefix {

	// 方法一：我写的
	public String longestCommonPrefix1(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		out: for (int i = 0; i < strs[0].length(); i++) {
			char current = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].length() == i || strs[j].charAt(i) != current)
					break out;
			}
			sb.append(current);
		}
		return sb.toString();
	}

	// 方法二：
	public String longestCommonPrefix2(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		for (int i = 0; i < strs[0].length(); i++) {
			char current = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].length() == i || strs[j].charAt(i) != current)
					return strs[0].substring(0, i);
			}
		}
		return strs[0];
	}

	// 方法三：
	public String longestCommonPrefix3(String[] strs) {
		if (strs == null)
			return null;
		if (strs.length == 0)
			return "";

		String theShortest = strs[0], theLongest = strs[0];

		for (String str : strs) {
			if (str.compareTo(theShortest) < 0)
				theShortest = str;
			if (str.compareTo(theLongest) > 0)
				theLongest = str;
		}

		int i = 0;

		while (i < theShortest.length() && theShortest.charAt(i) == theLongest.charAt(i))
			i++;

		return theShortest.substring(0, i);
	}
}
