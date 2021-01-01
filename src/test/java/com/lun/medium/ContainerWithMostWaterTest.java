package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContainerWithMostWaterTest {

	@Test
	public void test() {
		ContainerWithMostWater obj = new ContainerWithMostWater();

		assertEquals(49, obj.maxArea1(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
		assertEquals(1, obj.maxArea1(new int[] {1, 1}));
		assertEquals(16, obj.maxArea1(new int[] {4, 3, 2, 1, 4}));
		assertEquals(2, obj.maxArea1(new int[] {1, 2, 1}));
		
		assertEquals(49, obj.maxArea2(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
		assertEquals(1, obj.maxArea2(new int[] {1, 1}));
		assertEquals(16, obj.maxArea2(new int[] {4, 3, 2, 1, 4}));
		assertEquals(2, obj.maxArea2(new int[] {1, 2, 1}));
	}
}
