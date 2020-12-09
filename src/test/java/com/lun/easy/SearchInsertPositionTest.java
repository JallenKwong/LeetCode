package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class SearchInsertPositionTest {

	@Test
	public void test() {
		SearchInsertPosition obj = new SearchInsertPosition();

		int[] array1 = { 1, 3, 5, 6 };

		assertEquals(2, obj.searchInsert(array1, 5));
		assertEquals(1, obj.searchInsert(array1, 2));
		assertEquals(4, obj.searchInsert(array1, 7));
		assertEquals(0, obj.searchInsert(array1, 0));

		int[] array2 = { 1 };
		assertEquals(0, obj.searchInsert(array2, 0));

	}
}
