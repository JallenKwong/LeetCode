package com.lun.medium;

public class RotateImage {

	//方法一：我写的
	public void rotate1(int[][] matrix) {
		int n = matrix.length;

		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i - 1; j++) {
				int startX = i, startY = j;
				int nextX = startY, nextY = n - startX - 1;

				for (int k = 0; k < 3; k++) {
					int temp = matrix[nextX][nextY];
					matrix[nextX][nextY] = matrix[startX][startY];
					matrix[startX][startY] = temp;

					temp = nextX;
					nextX = nextY;
					nextY = n - temp - 1;
				}
			}
		}
	}

	//方法二：别人写的
	public void rotate2(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}
	}

}
