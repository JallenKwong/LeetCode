package com.lun.swordtowardoffer;

public class ScanMatrixClockwisely {

	public String scanMatrixClockwisely(int[][] numbers) {
		if(numbers == null || numbers.length == 0 || numbers[0].length == 0) {//不完整检验
			return "";
		}
		StringBuilder sb = new StringBuilder();
		int start = 0;
		
		int colNum = numbers[0].length, rowNum = numbers.length; 
		
		while(colNum > start * 2 && rowNum > start * 2) {
			scanMatrixInCircle(numbers, colNum, rowNum, start, sb);
			start++;
		}
		
		return sb.substring(0, sb.length() - 1);
	}
	
	private void scanMatrixInCircle(int[][] numbers,int colNum, int rowNum, int start, StringBuilder sb) {
		int endX = colNum - start - 1;
		int endY = rowNum - start - 1;
		
		//从左到右打印一行
		for(int i = start; i <= endX; i++) {
			sb.append(numbers[start][i]);
			sb.append(",");
		}
		
		//从上到下打印一列
		if(start < endY) {
			for(int i = start + 1; i <= endY;i++) {
				sb.append(numbers[i][endX]); 
				sb.append(",");
			}
		}
		
		//从右到左打印一行
		if(start < endX && start < endY) {
			for(int i = endX - 1; i >= start; i--) {
				sb.append(numbers[endY][i]); 
				sb.append(",");
			}
		}
		
		//从下到上打印一列
		if(start < endX && start < endY - 1) {
			for(int i = endX - 1; i >= start + 1; i--) {
				sb.append(numbers[i][start]);
				sb.append(",");
			}
		}
	}
	
}
