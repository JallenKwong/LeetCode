package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaximumSubarrayTest {

	@Test
	public void test() {
		MaximumSubarray obj = new MaximumSubarray();

		int[][] array = {{-2,1,-3,4,-1,2,1,-5,4}, {1}, {0}, {-1}, 
					{-2147483647}, {-2, -1}, {4, -3, 5, -2, -1, 2, 6, -2}}; 
		
		int expected[] = {6, 1, 0, -1, -2147483647, -1, 11};
		
		for(int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], obj.maxSubArray0(array[i]));
			assertEquals(expected[i], obj.maxSubArray1(array[i]));
			assertEquals(expected[i], obj.maxSubArray2(array[i]));
			assertEquals(expected[i], obj.maxSubArray3(array[i]));
		}
	}
}
