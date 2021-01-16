package com.lun.medium;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

	@Test
	public void test1() {
		SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();

		assertEquals(4, obj.search1(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
		assertEquals(-1, obj.search1(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
		assertEquals(-1, obj.search1(new int[] { 1 }, 0));
	}

	@Test
	public void test2() {
		SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();

		assertEquals(4, obj.search2(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
		assertEquals(-1, obj.search2(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
		assertEquals(-1, obj.search2(new int[] { 1 }, 0));
	}

	@Test
	public void test3() {
		SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();

		assertEquals(4, obj.search3(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
		assertEquals(-1, obj.search3(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
		assertEquals(-1, obj.search3(new int[] { 1 }, 0));
	}

	@Test
	public void test4() {
		SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();

		assertEquals(4, obj.search4(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
		assertEquals(-1, obj.search4(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
		assertEquals(-1, obj.search4(new int[] { 1 }, 0));
	}

	@Test
	public void testSearchStartIndexMethod() throws NoSuchMethodException, SecurityException //
			, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
		Method searchStartIndexMethod = obj.getClass().getDeclaredMethod("searchStartIndex", int[].class);
		searchStartIndexMethod.setAccessible(true);

		assertEquals(4, searchStartIndexMethod.invoke(obj, new int[] { 4, 5, 6, 7, 0, 1, 2 }));
		assertEquals(1, searchStartIndexMethod.invoke(obj, new int[] { 7, 0, 1, 2, 3, 4, 5, 6, }));
		assertEquals(0, searchStartIndexMethod.invoke(obj, new int[] { 1 }));
		assertEquals(0, searchStartIndexMethod.invoke(obj, new int[] { 1, 2 }));
		assertEquals(1, searchStartIndexMethod.invoke(obj, new int[] { 2, 1 }));
	}
}
