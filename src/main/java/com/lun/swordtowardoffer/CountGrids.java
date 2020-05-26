package com.lun.swordtowardoffer;

public class CountGrids {
	
	public int movingCount(int threshold, int rows, int cols) {
		
		if(threshold < 0 || rows <= 0 || cols <= 0)
			return 0;
		
		boolean[][] visited = new boolean[rows][cols];
		
		return movingCountCore(threshold, rows, cols, 0, 0, visited);
	}
	
	private int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[][] visited ) {
		int count = 0;
		
		if(check(threshold, rows, cols, row, col, visited)) {
			visited[row][col] = true;
			
			count = 1 + movingCountCore(threshold, rows, cols, row + 1, col, visited)
				+ movingCountCore(threshold, rows, cols, row, col + 1, visited)
				+ movingCountCore(threshold, rows, cols, row - 1, col, visited)
				+ movingCountCore(threshold, rows, cols, row, col - 1, visited);
		}
		
		return count;
	}

	private boolean check(int threshold, int rows, int cols, int row, int col, boolean[][] visited) {
		return 0 <= row && row < rows && 0 <= col && col < cols
				&& getDigitSun(row) + getDigitSun(col) <= threshold
				&& !visited[row][col];
	}
	
	private int getDigitSun(int number) {
		int sum = 0;
		
		while(number > 0) {
			sum += number % 10;
			number /= 10;
		}
		
		return sum;
	}
	
}
