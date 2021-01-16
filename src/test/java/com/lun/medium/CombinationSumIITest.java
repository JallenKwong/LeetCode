package com.lun.medium;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Test;

public class CombinationSumIITest {

	@Test
	@SuppressWarnings("unchecked")
	public void test() {
		CombinationSumII obj = new CombinationSumII();

		assertThat(obj.combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1, 1, 6), Arrays.asList(1, 2, 5), //
						Arrays.asList(1, 7), Arrays.asList(2, 6)));
		
		assertThat(obj.combinationSum2(new int[] { 2, 5, 2, 1, 2 }, 5), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1, 2, 2), Arrays.asList(5)));
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void test2() {
		CombinationSumII obj = new CombinationSumII();
		
		assertThat(obj.combinationSum2_(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1, 1, 6), Arrays.asList(1, 2, 5), //
						Arrays.asList(1, 7), Arrays.asList(2, 6)));
		
		assertThat(obj.combinationSum2_(new int[] { 2, 5, 2, 1, 2 }, 5), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1, 2, 2), Arrays.asList(5)));
		
		assertThat(obj.combinationSum2_(new int[] { 1, 1, 1}, 3), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1, 1, 1)));
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void test3() {
		CombinationSumII obj = new CombinationSumII();
		
		assertThat(obj.combinationSum2__(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1, 1, 6), Arrays.asList(1, 2, 5), //
						Arrays.asList(1, 7), Arrays.asList(2, 6)));
		
		assertThat(obj.combinationSum2__(new int[] { 2, 5, 2, 1, 2 }, 5), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1, 2, 2), Arrays.asList(5)));
		
		assertThat(obj.combinationSum2__(new int[] { 1, 1, 1}, 3), //
				IsIterableContainingInAnyOrder.containsInAnyOrder(Arrays.asList(1, 1, 1)));
	}
}
