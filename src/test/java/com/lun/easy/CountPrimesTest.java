package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class CountPrimesTest {

	@Test
	public void test() {
		CountPrimes obj = new CountPrimes();

		assertEquals(4, obj.countPrimes(10));
		assertEquals(0, obj.countPrimes(0));
		assertEquals(0, obj.countPrimes(1));
	}
}
