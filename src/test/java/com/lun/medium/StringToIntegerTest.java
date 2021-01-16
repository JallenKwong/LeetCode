package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringToIntegerTest {

	@Test
	public void test() {
		StringToInteger obj = new StringToInteger();

		assertEquals(42, obj.myAtoi("42"));
		assertEquals(-42, obj.myAtoi("   -42"));
		assertEquals(4193, obj.myAtoi("4193 with words"));
		assertEquals(0, obj.myAtoi("words and 987"));
		assertEquals(-2147483648, obj.myAtoi("-91283472332"));
	}
	
}
