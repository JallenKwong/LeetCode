package com.lun.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToIntegerTest {

	@Test
	public void test1() {
		RomanToInteger ri = new RomanToInteger();
		assertEquals(1, ri.romanToInt1("I"));
		assertEquals(5, ri.romanToInt1("V"));
		assertEquals(10, ri.romanToInt1("X"));
		assertEquals(50, ri.romanToInt1("L"));
		assertEquals(100, ri.romanToInt1("C"));
		assertEquals(500, ri.romanToInt1("D"));
		assertEquals(1000, ri.romanToInt1("M"));
		assertEquals(81, ri.romanToInt1("LXXXI"));
		assertEquals(183, ri.romanToInt1("CLXXXIII"));
		assertEquals(810, ri.romanToInt1("DCCCX"));
		assertEquals(811, ri.romanToInt1("DCCCXI"));
		assertEquals(1544, ri.romanToInt1("MDXLIV"));

		assertEquals(4, ri.romanToInt1("IV"));
		assertEquals(9, ri.romanToInt1("IX"));
		assertEquals(3, ri.romanToInt1("III"));
		assertEquals(58, ri.romanToInt1("LVIII"));
		assertEquals(1994, ri.romanToInt1("MCMXCIV"));
	}
	
	@Test
	public void test2() {
		RomanToInteger ri = new RomanToInteger();
		assertEquals(1, ri.romanToInt2("I"));
		assertEquals(5, ri.romanToInt2("V"));
		assertEquals(10, ri.romanToInt2("X"));
		assertEquals(50, ri.romanToInt2("L"));
		assertEquals(100, ri.romanToInt2("C"));
		assertEquals(500, ri.romanToInt2("D"));
		assertEquals(1000, ri.romanToInt2("M"));
		assertEquals(81, ri.romanToInt2("LXXXI"));
		assertEquals(183, ri.romanToInt2("CLXXXIII"));
		assertEquals(810, ri.romanToInt2("DCCCX"));
		assertEquals(811, ri.romanToInt2("DCCCXI"));
		assertEquals(1544, ri.romanToInt2("MDXLIV"));
		
		assertEquals(4, ri.romanToInt2("IV"));
		assertEquals(9, ri.romanToInt2("IX"));
		assertEquals(3, ri.romanToInt2("III"));
		assertEquals(58, ri.romanToInt2("LVIII"));
		assertEquals(1994, ri.romanToInt2("MCMXCIV"));
	}
	
	@Test
	public void test3() {
		RomanToInteger ri = new RomanToInteger();
		assertEquals(1, ri.romanToInt3("I"));
		assertEquals(5, ri.romanToInt3("V"));
		assertEquals(10, ri.romanToInt3("X"));
		assertEquals(50, ri.romanToInt3("L"));
		assertEquals(100, ri.romanToInt3("C"));
		assertEquals(500, ri.romanToInt3("D"));
		assertEquals(1000, ri.romanToInt3("M"));
		assertEquals(81, ri.romanToInt3("LXXXI"));
		assertEquals(183, ri.romanToInt3("CLXXXIII"));
		assertEquals(810, ri.romanToInt3("DCCCX"));
		assertEquals(811, ri.romanToInt3("DCCCXI"));
		assertEquals(1544, ri.romanToInt3("MDXLIV"));
		
		assertEquals(4, ri.romanToInt3("IV"));
		assertEquals(9, ri.romanToInt3("IX"));
		assertEquals(3, ri.romanToInt3("III"));
		assertEquals(58, ri.romanToInt3("LVIII"));
		assertEquals(1994, ri.romanToInt3("MCMXCIV"));
	}
}
