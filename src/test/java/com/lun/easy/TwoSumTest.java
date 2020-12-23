package com.lun.easy;

import static org.junit.Assert.*;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.*;
import org.junit.Test;

public class TwoSumTest {

	@Test
	public void test() {
		TwoSum obj = new TwoSum();
		assertThat(toObject(obj.twoSum(new int[] { 2, 7, 11, 15 }, 9)), //
				arrayContainingInAnyOrder(0, 1));
		assertThat(toObject(obj.twoSum(new int[] { 3, 2, 4 }, 6)), //
				arrayContainingInAnyOrder(2, 1));
	}

	public static Integer[] toObject(int[] intArray) {
		Integer[] result = new Integer[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			result[i] = Integer.valueOf(intArray[i]);
		}
		return result;
	}
}
