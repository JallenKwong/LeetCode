package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class UglyNumberIITest {

	@Test
	public void test() {
		UglyNumberII obj = new UglyNumberII();

		assertEquals(12, obj.nthUglyNumber1(10));
		assertEquals(12, obj.nthUglyNumber2(10));
		assertEquals(12, obj.nthUglyNumber3(10));
		assertEquals(12, obj.nthUglyNumber4(10));

	}
}
