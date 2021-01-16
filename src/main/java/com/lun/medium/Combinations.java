package com.lun.medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public List<List<Integer>> combine1(int numRange, int expectedSize) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		backtracking(path, numRange, expectedSize, 1, result);
		return result;
	}

	private void backtracking(List<Integer> path, int numRange, int expectedSize, int startIndex,
			List<List<Integer>> result) {
		if (path.size() == expectedSize) {
			result.add(new ArrayList<>(path));
			return;
		}

		for (int i = startIndex; i <= numRange; i++) {
			path.add(i);
			backtracking(path, numRange, expectedSize, i + 1, result);
			path.remove(path.size() - 1);
		}
	}

	// 剪枝优化后的
	public List<List<Integer>> combine2(int numRange, int expectedSize) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		backtracking2(path, numRange, expectedSize, 1, result);
		return result;
	}

	private void backtracking2(List<Integer> path, int numRange, int expectedSize, int startIndex,
			List<List<Integer>> result) {
		if (path.size() == expectedSize) {
			result.add(new ArrayList<>(path));
			return;
		}

		for (int i = startIndex; i <= numRange - (expectedSize - path.size()) + 1; i++) {
			path.add(i);
			backtracking(path, numRange, expectedSize, i + 1, result);
			path.remove(path.size() - 1);
		}
	}
}
