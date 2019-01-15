package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeftRotateStringTest {

	@Test
	public void testLeftRotate() {
		
		LeftRotateString ls = new LeftRotateString();
		
		assertEquals("cdefgab", ls.leftRotate("abcdefg", 2));
		assertEquals("abcdefg", ls.leftRotate("abcdefg", "abcdefg".length()));
		assertEquals("abcdefg", ls.leftRotate("abcdefg", "abcdefg".length() + 1));
	}

}
