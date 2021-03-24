package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ReverseVowelsOfAStringTest {

	@Test
	public void test() {
		ReverseVowelsOfAString obj = new ReverseVowelsOfAString();

		assertEquals("holle", obj.reverseVowels("hello"));
		assertEquals("leotcede", obj.reverseVowels("leetcode"));
	}
}
