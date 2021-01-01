package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ReverseIntegerTest {

	@Test
	public void test() {
		ReverseInteger obj = new ReverseInteger();

		assertEquals(321, obj.reverse(123));
		assertEquals(-321, obj.reverse(-123));
		assertEquals(21, obj.reverse(120));
		assertEquals(0, obj.reverse(0));
		assertEquals(0, obj.reverse(1534236469));
	}
}
