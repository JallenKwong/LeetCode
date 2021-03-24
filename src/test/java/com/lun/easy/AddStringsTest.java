package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddStringsTest {

	@Test
	public void test() {
		AddStrings obj = new AddStrings();

		for (int a = 0; a < 1000; a++)
			for (int b = 0; b < 1000; b++) {
				assertEquals(String.valueOf(a + b), obj.addStrings1(String.valueOf(a), String.valueOf(b)));
				assertEquals(String.valueOf(a + b), obj.addStrings2(String.valueOf(a), String.valueOf(b)));
			}
	}
}
