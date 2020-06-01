package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddDigitsTest {

	@Test
	public void test() {
		AddDigits ad = new AddDigits();

		assertEquals(2, ad.addUp(ad.apart(38)));
		assertEquals(2, ad.addDigits(38));
		assertEquals(2, ad.addDigits2(38));
	}
}
