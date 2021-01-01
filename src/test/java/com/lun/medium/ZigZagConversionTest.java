package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class ZigZagConversionTest {

	@Test
	public void test() {
		ZigZagConversion obj = new ZigZagConversion();

		assertEquals("PAHNAPLSIIGYIR", obj.convert("PAYPALISHIRING", 3));
		assertEquals("PINALSIGYAHRPI", obj.convert("PAYPALISHIRING", 4));
		assertEquals("A", obj.convert("A", 1));
		assertEquals("AB", obj.convert("AB", 1));
		
	}
}
