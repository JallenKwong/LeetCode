package com.lun.swordtowardoffer;

public class MaxDiff {

	public int maxDiff(int[] numbers) {
		int maxDiff = 0;
				
		if(numbers == null || numbers.length < 2) {
			return maxDiff;
		}
		
		int min = numbers[0];
		maxDiff = numbers[1] - min;
		
		for(int i = 2; i < numbers.length; i++) {
			if(numbers[i - 1] < min) {
				min = numbers[i - 1];
			}
			
			int diff = numbers[i] - min;
			
			if(diff > maxDiff) {
				maxDiff = diff;
			}
		}
		
		return maxDiff;
	}
	
}
