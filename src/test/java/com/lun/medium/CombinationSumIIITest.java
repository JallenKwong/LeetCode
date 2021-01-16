package com.lun.medium;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

public class CombinationSumIIITest {

	@Test
	@SuppressWarnings("unchecked")
	public void test() {
		CombinationSumIII obj = new CombinationSumIII();

		assertThat(obj.combinationSum3(3, 7), containsInAnyOrder(Arrays.asList(1, 2, 4)));
		assertThat(obj.combinationSum3(3, 9), containsInAnyOrder(Arrays.asList(1, 2, 6), //
													Arrays.asList(1, 3, 5), Arrays.asList(2, 3, 4)));
		
		assertThat(obj.combinationSum3(4, 1), IsEmptyCollection.empty());
		assertThat(obj.combinationSum3(3, 2), IsEmptyCollection.empty());

		assertThat(obj.combinationSum3(9, 45), containsInAnyOrder(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
	}
}
