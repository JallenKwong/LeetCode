package com.lun.medium;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.hamcrest.collection.IsEmptyCollection;
import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Test;

public class CombinationSumTest {

	@Test
	@SuppressWarnings("unchecked")
	public void test1() {
		CombinationSum obj = new CombinationSum();

		assertThat(obj.combinationSum1(new int[] { 2, 3, 6, 7 }, 7), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(2, 2, 3), Arrays.asList(7)));

		assertThat(obj.combinationSum1(new int[] { 2, 3, 5 }, 8), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(2, 2, 2, 2), //
						Arrays.asList(2, 3, 3), Arrays.asList(3, 5)));

		assertThat(obj.combinationSum1(new int[] { 2 }, 1), IsEmptyCollection.empty());

		assertThat(obj.combinationSum1(new int[] { 1 }, 1), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1)));

		assertThat(obj.combinationSum1(new int[] { 1 }, 2), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1, 1)));

	}

	@Test
	@SuppressWarnings("unchecked")
	public void test2() {
		CombinationSum obj = new CombinationSum();

		assertThat(obj.combinationSum2(new int[] { 2, 3, 6, 7 }, 7), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(2, 2, 3), Arrays.asList(7)));

		assertThat(obj.combinationSum2(new int[] { 2, 3, 5 }, 8), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(2, 2, 2, 2), //
						Arrays.asList(2, 3, 3), Arrays.asList(3, 5)));

		assertThat(obj.combinationSum2(new int[] { 2 }, 1), IsEmptyCollection.empty());

		assertThat(obj.combinationSum2(new int[] { 1 }, 1), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1)));

		assertThat(obj.combinationSum2(new int[] { 1 }, 2), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1, 1)));

	}
}
