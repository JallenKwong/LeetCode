package com.lun.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateImageTest {

	@Test
	public void test1() {
		RotateImage obj = new RotateImage();

		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, //
				expected1 = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };

		int[][] array2 = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } }, //
				expected2 = { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } };

		int[][] array3 = { { 1 } }, //
				expected3 = { { 1 } };

		int[][] array4 = { { 1, 2 }, { 3, 4 } }, //
				expected4 = { { 3, 1 }, { 4, 2 } };

		obj.rotate1(array1);
		obj.rotate1(array2);
		obj.rotate1(array3);
		obj.rotate1(array4);

		assertArrayEquals(expected1, array1);
		assertArrayEquals(expected2, array2);
		assertArrayEquals(expected3, array3);
		assertArrayEquals(expected4, array4);

	}

	@Test
	public void test2() {
		RotateImage obj = new RotateImage();

		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, //
				expected1 = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };

		int[][] array2 = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } }, //
				expected2 = { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } };

		int[][] array3 = { { 1 } }, //
				expected3 = { { 1 } };

		int[][] array4 = { { 1, 2 }, { 3, 4 } }, //
				expected4 = { { 3, 1 }, { 4, 2 } };

		obj.rotate2(array1);
		obj.rotate2(array2);
		obj.rotate2(array3);
		obj.rotate2(array4);

		assertArrayEquals(expected1, array1);
		assertArrayEquals(expected2, array2);
		assertArrayEquals(expected3, array3);
		assertArrayEquals(expected4, array4);
	}

}
