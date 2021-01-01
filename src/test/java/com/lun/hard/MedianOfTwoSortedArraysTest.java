package com.lun.hard;

import static org.junit.Assert.*;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

	@Test
	public void test() {
		MedianOfTwoSortedArrays obj = new MedianOfTwoSortedArrays();
		
		int[][] array1 = {{1, 3}, {2}},
				array2 = {{1, 2}, {3, 4}},
				array3 = {{0, 0}, {0, 0}},
				array4 = {{}, {1}},
				array5 = {{2},{}};

		double delta = 10e-5;
		
		assertEquals(2.00000, obj.findMedianSortedArrays(array1[0], array1[1]), delta);
		assertEquals(2.50000, obj.findMedianSortedArrays(array2[0], array2[1]), delta);
		assertEquals(0.00000, obj.findMedianSortedArrays(array3[0], array3[1]), delta);
		assertEquals(1.00000, obj.findMedianSortedArrays(array4[0], array4[1]), delta);
		assertEquals(2.00000, obj.findMedianSortedArrays(array5[0], array5[1]), delta);
	}
}
