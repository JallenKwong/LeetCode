package com.lun.easy;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class IntersectionOfTwoArraysIITest {

	@Test
	public void test1() {
		IntersectionOfTwoArraysII obj = new IntersectionOfTwoArraysII();

		int[] array1 = { 1, 2, 2, 1 };
		int[] array2 = { 2, 2 };

		assertArrayEquals(array2, obj.intersect1(array1, array2));
		assertArrayEquals(array2, obj.intersect2(array1, array2));
		assertArrayEquals(array2, obj.intersect3(array1, array2));
		assertArrayEquals(array2, obj.intersect4(array1, array2));
	}

	@Test
	public void test2() {
		IntersectionOfTwoArraysII obj = new IntersectionOfTwoArraysII();

		int[] array1 = { 4, 9, 5 };
		int[] array2 = { 9, 4, 9, 8, 4 };
		int[] expected = { 9, 4 }, actual;
		Arrays.sort(expected);

		actual = obj.intersect1(array1, array2);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);

		actual = obj.intersect2(array1, array2);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);

		actual = obj.intersect3(array1, array2);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);

		actual = obj.intersect4(array1, array2);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);

	}
}
