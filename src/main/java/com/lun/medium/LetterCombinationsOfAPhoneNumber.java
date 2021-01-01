package com.lun.medium;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

	// 方法一：我写的BFS
	public static final String[] num2Letters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations1(String digits) {
		List<String> result = new LinkedList<>();
		if (digits == null || digits.trim().length() == 0)
			return result;
		result.add("");

		for (int i = 0; i < digits.length(); i++)
			letterCombinations(result, digits.charAt(i) - '0');

		return result;
	}

	private void letterCombinations(List<String> result, int num) {
		int originalResultSize = result.size();
		String[] letters = num2Letters[num].split("");
		for (int i = 0; i < originalResultSize; i++) {
			String temp = result.remove(0);
			for (int j = 0; j < letters.length; j++) {
				StringBuilder sb = new StringBuilder();
				sb.append(temp);
				sb.append(letters[j]);
				result.add(sb.toString());
			}
		}
	}

	// 方法二：别人A写的BFS
	public List<String> letterCombinations2_1(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		if (digits.isEmpty())
			return ans;
		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		ans.add("");
		for (int i = 0; i < digits.length(); i++) {
			int x = Character.getNumericValue(digits.charAt(i));
			while (ans.peek().length() == i) {
				String t = ans.remove();
				for (char s : mapping[x].toCharArray())
					ans.add(t + s);
			}
		}
		return ans;
	}

	// 方法二：别人A写的（第二版）BFS
	public List<String> letterCombinations2_2(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		if (digits.isEmpty())
			return ans;
		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		ans.add("");
		while (ans.peek().length() != digits.length()) {
			String remove = ans.remove();
			String map = mapping[digits.charAt(remove.length()) - '0'];
			for (char c : map.toCharArray()) {
				ans.addLast(remove + c);
			}
		}
		return ans;
	}

	// 方法三：别人B写的 DFS 递归
	private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations3(String digits) {
		List<String> ret = new LinkedList<String>();
		if (digits == null || digits.length() == 0)
			return ret;
		combination("", digits, 0, ret);
		return ret;
	}

	private void combination(String prefix, String digits, int offset, List<String> ret) {
		if (offset >= digits.length()) {
			ret.add(prefix);
			return;
		}
		String letters = KEYS[(digits.charAt(offset) - '0')];
		for (int i = 0; i < letters.length(); i++) {
			combination(prefix + letters.charAt(i), digits, offset + 1, ret);
		}
	}

}
