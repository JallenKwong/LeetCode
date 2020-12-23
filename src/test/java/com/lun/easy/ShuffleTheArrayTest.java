package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShuffleTheArrayTest {

	@Test
	public void test() {
		ShuffleTheArray obj = new ShuffleTheArray();

		assertArrayEquals(new int[] { 2, 3, 5, 4, 1, 7 }, //
				obj.shuffle1(new int[] { 2, 5, 1, 3, 4, 7 }, 3));
		assertArrayEquals(new int[] { 1, 4, 2, 3, 3, 2, 4, 1 }, //
				obj.shuffle1(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4));
		assertArrayEquals(new int[] { 1, 2, 1, 2 }, //
				obj.shuffle1(new int[] { 1, 1, 2, 2 }, 2));

		assertArrayEquals(new int[] { 2, 3, 5, 4, 1, 7 }, //
				obj.shuffle2(new int[] { 2, 5, 1, 3, 4, 7 }, 3));
		assertArrayEquals(new int[] { 1, 4, 2, 3, 3, 2, 4, 1 }, //
				obj.shuffle2(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4));
		assertArrayEquals(new int[] { 1, 2, 1, 2 }, //
				obj.shuffle2(new int[] { 1, 1, 2, 2 }, 2));

		assertArrayEquals(new int[] { 2, 3, 5, 4, 1, 7 }, //
				obj.shuffle3(new int[] { 2, 5, 1, 3, 4, 7 }, 3));
		assertArrayEquals(new int[] { 1, 4, 2, 3, 3, 2, 4, 1 }, //
				obj.shuffle3(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4));
		assertArrayEquals(new int[] { 1, 2, 1, 2 }, //
				obj.shuffle3(new int[] { 1, 1, 2, 2 }, 2));
	}
}
