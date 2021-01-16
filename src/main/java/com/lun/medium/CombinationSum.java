package com.lun.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum1(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		backtracking1(path, candidates, target, 0, 0, result);
		return result;
	}

	private void backtracking1(List<Integer> path, int[] candidates, //
			int target, int sum, int startIndex, List<List<Integer>> result) {
		if (sum > target) {
			return;
		}

		if (sum == target) {
			result.add(new ArrayList<>(path));
			return;
		}

		for (int i = startIndex; i < candidates.length; i++) {
			sum += candidates[i];
			path.add(candidates[i]);
			backtracking1(path, candidates, target, sum, i, result);
			sum -= candidates[i];
			path.remove(path.size() - 1);
		}
	}

	// 剪枝优化后
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		Arrays.sort(candidates);
		backtracking2(path, candidates, target, 0, 0, result);
		return result;
	}

	private void backtracking2(List<Integer> path, int[] candidates, //
			int target, int sum, int startIndex, List<List<Integer>> result) {

		if (sum == target) {
			result.add(new ArrayList<>(path));
			return;
		}

		for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {
			sum += candidates[i];
			path.add(candidates[i]);
			backtracking2(path, candidates, target, sum, i, result);
			sum -= candidates[i];
			path.remove(path.size() - 1);
		}
	}

}
