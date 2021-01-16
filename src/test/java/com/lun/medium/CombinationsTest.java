package com.lun.medium;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CombinationsTest {

	@Test
	@SuppressWarnings("unchecked")
	public void test1() {
		Combinations obj = new Combinations();

		Object[] expected = {Arrays.asList(2,4),
				Arrays.asList(3,4),
				Arrays.asList(2,3),
				Arrays.asList(1,2),
				Arrays.asList(1,3),
				Arrays.asList(1,4)};
		
		assertThat(obj.combine1(4, 2), containsInAnyOrder(expected));
		assertThat(obj.combine1(1, 1), containsInAnyOrder(Arrays.asList(1)));
		assertThat(obj.combine1(4, 4), containsInAnyOrder(Arrays.asList(1, 2, 3, 4)));
		assertThat(obj.combine1(4, 3), containsInAnyOrder(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 4),//
				Arrays.asList(1, 2, 4), Arrays.asList(2, 3, 4)));
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void test2() {
		Combinations obj = new Combinations();
		
		Object[] expected = {Arrays.asList(2,4),
				Arrays.asList(3,4),
				Arrays.asList(2,3),
				Arrays.asList(1,2),
				Arrays.asList(1,3),
				Arrays.asList(1, 4) };

		assertThat(obj.combine2(4, 2), containsInAnyOrder(expected));
		assertThat(obj.combine2(1, 1), containsInAnyOrder(Arrays.asList(1)));
		assertThat(obj.combine2(4, 4), containsInAnyOrder(Arrays.asList(1, 2, 3, 4)));
		assertThat(obj.combine2(4, 3), containsInAnyOrder(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 4), //
				Arrays.asList(1, 2, 4), Arrays.asList(2, 3, 4)));
	}
}
