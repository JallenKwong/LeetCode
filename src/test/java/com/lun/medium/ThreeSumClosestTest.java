package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class ThreeSumClosestTest {

	@Test
	public void test() {
		ThreeSumClosest obj = new ThreeSumClosest();

		assertEquals(2, obj.threeSumClosest1(new int[] {-1, 2, 1, -4}, 1));
		assertEquals(2, obj.threeSumClosest2(new int[] {-1, 2, 1, -4}, 1));
	}
}
