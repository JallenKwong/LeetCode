package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlusOneTest {

	@Test
	public void test() {
		PlusOne obj = new PlusOne();

		assertArrayEquals(new int[] {1, 2, 4}, obj.plusOne1(new int[] {1, 2, 3}));
		assertArrayEquals(new int[] {4, 3, 2, 2}, obj.plusOne1(new int[] {4, 3, 2, 1}));
		assertArrayEquals(new int[] {1}, obj.plusOne1(new int[] {0}));
		assertArrayEquals(new int[] {1, 0, 0, 0}, obj.plusOne1(new int[] {9, 9, 9}));
		assertArrayEquals(new int[] {6, 7, 9, 0}, obj.plusOne1(new int[] {6, 7, 8, 9}));
		
		assertArrayEquals(new int[] {1, 2, 4}, obj.plusOne2(new int[] {1, 2, 3}));
		assertArrayEquals(new int[] {4, 3, 2, 2}, obj.plusOne2(new int[] {4, 3, 2, 1}));
		assertArrayEquals(new int[] {1}, obj.plusOne2(new int[] {0}));
		assertArrayEquals(new int[] {1, 0, 0, 0}, obj.plusOne2(new int[] {9, 9, 9}));
		assertArrayEquals(new int[] {6, 7, 9, 0}, obj.plusOne2(new int[] {6, 7, 8, 9}));
		
	}
}
