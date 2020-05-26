package com.lun.swordtowardoffer;

public class FindPathInMatrix {

	public boolean find(char[][] matrix, String str) {
		
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0 
				|| str == null || str.length() == 0) {
			return false;
		}
		
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		
		int[] pathLength = {0};
		
		for(int row = 0; row < matrix.length; row++) {
			
			for(int col = 0; col < matrix[0].length; col++) {
				if(findCore(matrix, row, col, str, pathLength, visited))
					return true;
			}
			
		}
		
		return false;
	}

	private boolean findCore(char[][] matrix, int row, int col, String str
								, int[] pathLength, boolean[][] visited) {
		
		if(str.length() == pathLength[0]) {
			return true;
		}
		
		boolean result = false;
		
		if(row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length
				&& matrix[row][col] == str.charAt(pathLength[0])
				&& !visited[row][col]) {
			
			++pathLength[0];
			
			visited[row][col] = true;
			
			result = findCore(matrix, row, col - 1, str, pathLength, visited)
					|| findCore(matrix, row - 1, col, str, pathLength, visited)
					|| findCore(matrix, row, col + 1, str, pathLength, visited)
					||findCore(matrix, row + 1, col, str, pathLength, visited);
			
			//尝试失败，进行补偿
			if(!result) {
				pathLength[0]--;
				visited[row][col] = false;
			}
			
		}
		
		return result;
	}
	
}
