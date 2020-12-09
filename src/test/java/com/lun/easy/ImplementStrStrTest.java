package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ImplementStrStrTest {

	@Test
	public void test() {
		ImplementStrStr obj = new ImplementStrStr();

		assertEquals(2, obj.strStr("hello", "ll"));
		assertEquals(-1, obj.strStr("aaaaaa", "bba"));
		assertEquals(0, obj.strStr("", ""));
		assertEquals(-1, obj.strStr("aaa", "aaaa"));
		
		//"".indexOf("");
	}
}
