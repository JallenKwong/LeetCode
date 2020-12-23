package com.lun.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate1(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		if (numRows <= 0)
			return result;

		for (int i = 1; i <= numRows; i++) {
			List<Integer> tempList = new ArrayList<>();

			for (int j = 0; j < i; j++) {
				if (j == 0 || j == i - 1) {
					tempList.add(1);
					continue;
				}

				List<Integer> lastList = result.get(i - 2);
				tempList.add(lastList.get(j) + lastList.get(j - 1));
			}

			result.add(tempList);
		}

		return result;
	}

	public List<List<Integer>> generate2(int numRows) {
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for (int i = 0; i < numRows; i++) {
			row.add(0, 1);
			for (int j = 1; j < row.size() - 1; j++)
				row.set(j, row.get(j) + row.get(j + 1));
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows;

	}
}
