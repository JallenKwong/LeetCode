package com.lun.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		backtracking(list, new StringBuilder(), 0, 0, n);
		return list;
	}

	private void backtracking(List<String> list, StringBuilder sb, int open, int close, int max) {

		if (open == max && close == max) {
			list.add(sb.toString());
			return;
		}

		if (open < max) {
			backtracking(list, sb.append('('), open + 1, close, max);
			sb.setLength(sb.length() - 1);
		}

		if (close < open) {
			backtracking(list, sb.append(')'), open, close + 1, max);
			sb.setLength(sb.length() - 1);
		}
	}
}
