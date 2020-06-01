package com.lun.swordtowardoffer;

public class FindNumberInTwoDimensionalIntegerArray {
	public int[] find(int[][] matrix, int target) {
		int[] result = {-1, -1};
		
		if(matrix != null && matrix.length > 0 && matrix[0].length > 0) {
			
			int row = 0;
			int col = matrix[0].length - 1;
			
			int rowNum = matrix.length;
			
			while(row < rowNum && col >= 0) {
				if(matrix[row][col] == target) {
					//return true;
					return new int[] {row, col};
				}else if(matrix[row][col] > target) {
					col--;
				}else {
					row++;
				}
			}
		}
		
		return result;
	}
}
