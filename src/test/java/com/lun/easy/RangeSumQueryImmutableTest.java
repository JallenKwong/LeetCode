package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class RangeSumQueryImmutableTest {

	@Test
	public void test() {
		RangeSumQueryImmutable obj = new RangeSumQueryImmutable(new int[] {-2, 0, 3, -5, 2, -1});

		assertEquals(1, obj.sumRange(0, 2));
		assertEquals(-1, obj.sumRange(2, 5));
		assertEquals(-3, obj.sumRange(0, 5));
	}

	@Test
	public void test2() {
		RangeSumQueryImmutable2 obj = new RangeSumQueryImmutable2(new int[] { -2, 0, 3, -5, 2, -1 });

		assertEquals(1, obj.sumRange(0, 2));
		assertEquals(-1, obj.sumRange(2, 5));
		assertEquals(-3, obj.sumRange(0, 5));
	}
}
