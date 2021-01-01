package com.lun.medium;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

import java.util.Arrays;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

public class ThreeSumTest {

	@Test
	@SuppressWarnings("unchecked")
	public void test() {
		ThreeSum obj = new ThreeSum();

		assertThat(obj.threeSum1(new int[] { -1, 0, 1, 2, -1, -4 }),
				containsInAnyOrder(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)));
		assertThat(obj.threeSum1(new int[] {}), IsEmptyCollection.empty());
		assertThat(obj.threeSum1(new int[] { 0 }), IsEmptyCollection.empty());

		assertThat(obj.threeSum2(new int[] { -1, 0, 1, 2, -1, -4 }),
				containsInAnyOrder(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)));
		assertThat(obj.threeSum2(new int[] {}), IsEmptyCollection.empty());
		assertThat(obj.threeSum2(new int[] { 0 }), IsEmptyCollection.empty());

		assertThat(obj.threeSum3(new int[] { -1, 0, 1, 2, -1, -4 }),
				containsInAnyOrder(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)));
		assertThat(obj.threeSum3(new int[] {}), IsEmptyCollection.empty());
		assertThat(obj.threeSum3(new int[] { 0 }), IsEmptyCollection.empty());

	}
}
