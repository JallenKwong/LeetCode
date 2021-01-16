package com.lun.medium;

import static org.junit.Assert.*;

import java.util.Arrays;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

public class FourSumTest {

	@Test
	@SuppressWarnings("unchecked")
	public void test() {
		FourSum obj = new FourSum();

		assertThat(obj.fourSum(new int[] {}, 0), IsEmptyCollection.empty());
		assertThat(obj.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0), containsInAnyOrder(Arrays.asList(-2, -1, 1, 2),
				Arrays.asList(-2, 0, 0, 2), Arrays.asList(-1, 0, 0, 1)));
	}
}
