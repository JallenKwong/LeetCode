package com.lun.easy;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class IntersectionOfTwoArraysTest {

	@Test
	public void test1() {
		IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
		assertArrayEquals(new int[] { 2 }, // 
				obj.intersection1(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));

		int[] expected = { 9, 4 };
		int[] actual = obj.intersection1(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test2() {
		IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
		assertArrayEquals(new int[] { 2 }, // 
				obj.intersection2(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));

		int[] expected = { 9, 4 };
		int[] actual = obj.intersection2(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test3() {
		IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
		assertArrayEquals(new int[] { 2 }, //
				obj.intersection3(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));

		int[] expected = { 9, 4 };
		int[] actual = obj.intersection3(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test4() {
		IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
		assertArrayEquals(new int[] { 2 }, //
				obj.intersection4(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));

		int[] expected = { 9, 4 };
		int[] actual = obj.intersection4(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test5() {
		IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
		assertArrayEquals(new int[] { 2 }, //
				obj.intersection5(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));

		int[] expected = { 9, 4 };
		int[] actual = obj.intersection5(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}
}
