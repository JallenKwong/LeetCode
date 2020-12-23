package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class TwoSumIIInputArrayIsSortedTest {

	@Test
	public void test() {
		TwoSumIIInputArrayIsSorted obj = new TwoSumIIInputArrayIsSorted();

		assertArrayEquals(new int[] {1, 2},  obj.twoSum1(new int[] {2, 7, 11, 15}, 9));
		assertArrayEquals(new int[] {1, 3},  obj.twoSum1(new int[] {2, 3, 4}, 6));
		assertArrayEquals(new int[] {1, 2},  obj.twoSum1(new int[] {-1, 0}, -1));
		
		assertArrayEquals(new int[] {1, 2},  obj.twoSum2(new int[] {2, 7, 11, 15}, 9));
		assertArrayEquals(new int[] {1, 3},  obj.twoSum2(new int[] {2, 3, 4}, 6));
		assertArrayEquals(new int[] {1, 2},  obj.twoSum2(new int[] {-1, 0}, -1));
		
		assertArrayEquals(new int[] {1, 2},  obj.twoSum3(new int[] {2, 7, 11, 15}, 9));
		assertArrayEquals(new int[] {1, 3},  obj.twoSum3(new int[] {2, 3, 4}, 6));
		assertArrayEquals(new int[] {1, 2},  obj.twoSum3(new int[] {-1, 0}, -1));
	}
}
