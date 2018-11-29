package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ReverseWordsInAStringIIITest {

	@Test
	public void test() {
		String str = "Let's take LeetCode contest";
		assertEquals("s'teL ekat edoCteeL tsetnoc", new ReverseWordsInAStringIII().reverseWords(str));
	}
	
	@Test
	public void test2() {
		String str = "Let's take LeetCode contest";
		assertEquals("s'teL ekat edoCteeL tsetnoc", new ReverseWordsInAStringIII().reverseWords2(str));
	}
}
