package com.lun.swordtowardoffer;


public class MaxValueGift {

	public int getMaxValue(int[][] values) {
		
		if(values == null || values.length == 0 || values[0].length == 0) {
			return 0;
		}
		int rowNum = values.length;
		int colNum = values[0].length;
		
		int[][] maxValues = new int[rowNum][colNum];
		
		for(int i = 0; i < rowNum; i++) {
			for(int j = 0; j < colNum; j++) {
				int left = 0, up = 0;
				
				if(i > 0) {
					up = maxValues[i - 1][j];
				}
				
				if(j > 0) {
					left = maxValues[i][j - 1];
				}
				
				maxValues[i][j] = Math.max(left, up) + values[i][j];
			}
		}
		
		return maxValues[rowNum - 1][colNum - 1];
	}
	
	//优化
	public int getMaxValue2(int[][] values) {
		
		if(values == null || values.length == 0 || values[0].length == 0) {
			return 0;
		}
		int rowNum = values.length;
		int colNum = values[0].length;
		
		int[] maxValues = new int[colNum];
		
		for(int i = 0; i < rowNum; i++) {
			for(int j = 0; j < colNum; j++) {
				int left = 0, up = 0;
				
				if(i > 0) {
					up = maxValues[j];
				}
				
				if(j > 0) {
					left = maxValues[j - 1];
				}
				
				maxValues[j] = Math.max(left, up) + values[i][j];
			}
		}
		
		return maxValues[colNum - 1];
	}
	
}
