package com.lun.swordtowardoffer;

import java.util.ArrayList;
import java.util.List;

import com.lun.util.Pair;

public class FindNumbersWithSum2 {
	
	
	public List<Pair<Integer, Integer>> find(int sum) {
		List<Pair<Integer, Integer>> result = new ArrayList<>();
		
		if(sum < 3) {			
			return result;
		}
		
		int small = 1;
		int big = 2;
		int middle = (1 + sum) / 2;
		int curSum = small + big;
		
		while(small < middle) {
			if(curSum == sum) {
				result.add(new Pair<>(small, big));
			}
			
			while(curSum > sum && small < middle) {
				curSum -= small;
				small++;
				
				if(curSum == sum) {
					result.add(new Pair<>(small, big));
				}
			}
			
			big++;
			curSum += big;
		}
		
		return result;
	}
}
