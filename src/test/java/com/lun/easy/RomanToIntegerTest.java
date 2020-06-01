package com.lun.easy;


import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

	@Test
	public void test(){
		RomanToInteger ri = new RomanToInteger();
		Assert.assertEquals(1, ri.translate("I"));
		Assert.assertEquals(5, ri.translate("V"));
		Assert.assertEquals(10, ri.translate("X"));
		Assert.assertEquals(50, ri.translate("L"));
		Assert.assertEquals(100, ri.translate("C"));
		Assert.assertEquals(500, ri.translate("D"));
		Assert.assertEquals(1000, ri.translate("M"));
		Assert.assertEquals(81, ri.translate("LXXXI"));
		Assert.assertEquals(183, ri.translate("CLXXXIII"));
		Assert.assertEquals(810, ri.translate("DCCCX"));
		Assert.assertEquals(811, ri.translate("DCCCXI"));
		Assert.assertEquals(1544, ri.translate("MDXLIV"));
		
		Assert.assertEquals(4, ri.translate("IV"));
		Assert.assertEquals(9, ri.translate("IX"));
		Assert.assertEquals(3, ri.translate("III"));
		Assert.assertEquals(58, ri.translate("LVIII"));
		Assert.assertEquals(1994, ri.translate("MCMXCIV"));
	}
}
