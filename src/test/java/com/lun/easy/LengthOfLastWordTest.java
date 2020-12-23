package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class LengthOfLastWordTest {

	@Test
	public void test() {
		LengthOfLastWord obj = new LengthOfLastWord();

		assertEquals(5,	obj.lengthOfLastWord1("Hello World"));
		assertEquals(0,	obj.lengthOfLastWord1(" "));
		
		assertEquals(5,	obj.lengthOfLastWord2("Hello World"));
		assertEquals(0,	obj.lengthOfLastWord2(" "));
	}
}
