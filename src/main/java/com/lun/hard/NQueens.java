package com.lun.hard;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<>();
		List<String> rows = new ArrayList<>();
		backstracking(rows, n, 0, result);
		return result;
	}

	private void backstracking(List<String> rows, int lengthOfSide, int depth, List<List<String>> result) {
		if (rows.size() == lengthOfSide) {
			result.add(new ArrayList<>(rows));
			return;
		}

		for (int i = 0; i < lengthOfSide; i++) {
			if (isValid(rows, depth, i, lengthOfSide)) {
				rows.add(makeRow(i, lengthOfSide));
				backstracking(rows, lengthOfSide, depth + 1, result);
				rows.remove(rows.size() - 1);
			}
		}
	}

	private String makeRow(int index, int lengthOfSide) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lengthOfSide; i++) {
			sb.append(i == index ? 'Q' : '.');
		}
		return sb.toString();
	}

	private boolean isValid(List<String> rows, int row, int col, int lengthOfSide) {

		// 上方向
		for (int i = row - 1; i > -1; i--) {
			if (rows.get(i).charAt(col) == 'Q')
				return false;
		}

		// 左上方向
		for (int i = row - 1, j = col - 1; i > -1 && j > -1; i--, j--) {
			if (rows.get(i).charAt(j) == 'Q')
				return false;
		}

		// 右上方向
		for (int i = row - 1, j = col + 1; i > -1 && j < lengthOfSide; i--, j++) {
			if (rows.get(i).charAt(j) == 'Q')
				return false;
		}

		return true;
	}

}
