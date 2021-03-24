package com.lun.easy;

import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.Test;

public class WordPatternTest {

	@Test
	public void test() {
		WordPattern obj = new WordPattern();

		assertTrue(obj.wordPattern1("abba", "dog cat cat dog"));
		assertFalse(obj.wordPattern1("abba", "dog cat cat fish"));
		assertFalse(obj.wordPattern1("aaaa", "dog cat cat dog"));
		assertFalse(obj.wordPattern1("abba", "dog dog dog dog"));
		
		assertTrue(obj.wordPattern2("abba", "dog cat cat dog"));
		assertFalse(obj.wordPattern2("abba", "dog cat cat fish"));
		assertFalse(obj.wordPattern2("aaaa", "dog cat cat dog"));
		assertFalse(obj.wordPattern2("abba", "dog dog dog dog"));
	}
	
	@Test
	public void testEquals() {
		//== 与 !=运用在Integer包装类的比较的局限性
		//包装类最好用Objects.equals()
		int i = 127;
		Integer a = i;
		Integer b = i;
		assertTrue(a == b);
		assertTrue(Objects.equals(a, b));
		
		i = 128;
		a = i;
		b = i;
		assertFalse(a == b);
		assertTrue(Objects.equals(a, b));
	}
	
}
