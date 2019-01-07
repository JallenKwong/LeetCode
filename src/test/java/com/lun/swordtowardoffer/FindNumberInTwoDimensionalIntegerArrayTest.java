package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindNumberInTwoDimensionalIntegerArrayTest {

	@Test
	public void testFind() {
		FindNumberInTwoDimensionalIntegerArray fa = new FindNumberInTwoDimensionalIntegerArray();
		
		int[][] matrix = {{1,2,8,9},
						{2,4,9,12},
						{4,7,10,13},
						{6,8,11,15}};
		
		assertArrayEquals(new int[]{2, 1}, fa.find(matrix, 7));
		assertArrayEquals(new int[]{-1, -1}, fa.find(matrix, 5));
		
	}

}
