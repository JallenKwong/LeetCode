package com.lun.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

	public List<List<Integer>> combinationSum3(int size, int targetSum) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		backtracking(path, size, targetSum, 0, 1, result);
		return result;
	}

	private void backtracking(List<Integer> path, int size, int targetSum, //
			int currentSum, int startIndex, List<List<Integer>> result) {
		// 剪枝
		if (targetSum < currentSum)
			return;

		if (path.size() == size) {
			if (targetSum == currentSum)
				result.add(new ArrayList<>(path));
			return;
		}

		for (int i = startIndex; i <= 9; i++) {
			path.add(i);
			currentSum += i;
			backtracking(path, size, targetSum, currentSum, i + 1, result);
			path.remove(path.size() - 1);
			currentSum -= i;
		}
	}
}
