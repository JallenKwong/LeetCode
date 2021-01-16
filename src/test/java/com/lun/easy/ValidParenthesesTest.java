package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidParenthesesTest {

	@Test
	public void test() {
		ValidParentheses obj = new ValidParentheses();

		assertTrue(obj.isValid1("()"));
		assertTrue(obj.isValid1("()[]{}"));
		assertTrue(obj.isValid1("{[]}"));
		assertFalse(obj.isValid1("(]"));
		assertFalse(obj.isValid1("([)]"));
		
		assertTrue(obj.isValid2("()"));
		assertTrue(obj.isValid2("()[]{}"));
		assertTrue(obj.isValid2("{[]}"));
		assertFalse(obj.isValid2("(]"));
		assertFalse(obj.isValid2("([)]"));
		
		assertTrue(obj.isValid3("()"));
		assertTrue(obj.isValid3("()[]{}"));
		assertTrue(obj.isValid3("{[]}"));
		assertFalse(obj.isValid3("(]"));
		assertFalse(obj.isValid3("([)]"));
		
		assertTrue(obj.isValid4("()"));
		assertTrue(obj.isValid4("()[]{}"));
		assertTrue(obj.isValid4("{[]}"));
		assertFalse(obj.isValid4("(]"));
		assertFalse(obj.isValid4("([)]"));
		
	}
}
