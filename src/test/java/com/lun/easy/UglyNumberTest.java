package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class UglyNumberTest {

	@Test
	public void test() {
		UglyNumber obj = new UglyNumber();

		assertTrue(obj.isUgly(6));
		assertTrue(obj.isUgly(8));
		assertFalse(obj.isUgly(14));
		assertFalse(obj.isUgly(-6));
	}
}
