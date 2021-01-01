package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerToRomanTest {

	@Test
	public void test() {
		IntegerToRoman obj = new IntegerToRoman();

		assertEquals("III", obj.intToRoman1(3));
		assertEquals("IV", obj.intToRoman1(4));
		assertEquals("IX", obj.intToRoman1(9));
		assertEquals("LVIII", obj.intToRoman1(58));

		assertEquals("MCMXCIV", obj.intToRoman2(1994));
		assertEquals("III", obj.intToRoman2(3));
		assertEquals("IV", obj.intToRoman2(4));
		assertEquals("IX", obj.intToRoman2(9));
		assertEquals("LVIII", obj.intToRoman2(58));
		assertEquals("MCMXCIV", obj.intToRoman2(1994));

		assertEquals("III", obj.intToRoman3(3));
		assertEquals("IV", obj.intToRoman3(4));
		assertEquals("IX", obj.intToRoman3(9));
		assertEquals("LVIII", obj.intToRoman3(58));
		assertEquals("MCMXCIV", obj.intToRoman3(1994));
		
	}
}
