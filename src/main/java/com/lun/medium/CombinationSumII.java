package com.lun.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	// 版本一：公众号“代码随想录”的
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		Arrays.sort(candidates);
		boolean[] used = new boolean[candidates.length];
		backtracking(path, candidates, target, used, 0, 0, result);
		return result;
	}

	private void backtracking(List<Integer> path, int[] candidates, int target, //
			boolean[] used, int sum, int startIndex, List<List<Integer>> result) {
		if (target == sum) {
			result.add(new ArrayList<>(path));
			return;
		}

		for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {
			if (i > 0 && candidates[i - 1] == candidates[i] && used[i - 1] == false)
				continue;

			sum += candidates[i];
			path.add(candidates[i]);
			used[i] = true;
			backtracking(path, candidates, target, used, sum, i + 1, result);
			sum -= candidates[i];
			path.remove(path.size() - 1);
			used[i] = false;
		}
	}

	// 版本二，跟版本一相比，没有sum，used变量
	public List<List<Integer>> combinationSum2_(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		Arrays.sort(candidates);
		backtracking_(candidates, 0, target, path, res);
		return res;
	}

	private void backtracking_(int[] candidates, int startIndex, int target, List<Integer> path,
			List<List<Integer>> res) {
		if (target == 0) {
			res.add(new ArrayList<>(path));
			return;
		}

		for (int i = startIndex; i < candidates.length && target >= candidates[i]; i++) {
			if (i > startIndex && candidates[i] == candidates[i - 1])
				continue;
			path.add(candidates[i]);
			backtracking_(candidates, i + 1, target - candidates[i], path, res);
			path.remove(path.size() - 1);
		}
	}

	// 版本三，将版本一的used剔除掉，以及backtracking__方法体的 `i > 0 &&` 改为 `i > startIndex &&`
	public List<List<Integer>> combinationSum2__(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		Arrays.sort(candidates);
		backtracking__(path, candidates, target, 0, 0, result);
		return result;
	}

	private void backtracking__(List<Integer> path, int[] candidates, int target, //
			int sum, int startIndex, List<List<Integer>> result) {
		if (target == sum) {
			result.add(new ArrayList<>(path));
			return;
		}

		for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {
			if (i > startIndex && candidates[i - 1] == candidates[i])
				continue;

			sum += candidates[i];
			path.add(candidates[i]);
			backtracking__(path, candidates, target, sum, i + 1, result);
			sum -= candidates[i];
			path.remove(path.size() - 1);
		}
	}
}
