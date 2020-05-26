package com.lun.swordtowardoffer;

import org.junit.Assert;
import org.junit.Test;

public class StringToIntegerTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalChar() {
		StringToInteger si = new StringToInteger();
		si.makeStringToInteger("- ");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testBlankIntergerString() {
		StringToInteger si = new StringToInteger();
		si.makeStringToInteger("");
	}
	
	@Test
	public void testIntegerMaxMinValue() {
		//0111,1111, 1111,1111, 1111,1111, 1111,1111
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.toBinaryString((long)(Math.pow(2, 31) - 1)));
		
		//1000,0000, 0000,0000, 0000,0000, 0000,0000
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPositiveOverflow() {
		StringToInteger si = new StringToInteger();
		si.makeStringToInteger("2147483648");//positive overflow
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testNegativeOverflow() {
		StringToInteger si = new StringToInteger();
		si.makeStringToInteger("-2147483649");//negative overflow
	}
	
	@Test
	public void test() {
		StringToInteger si = new StringToInteger();
		
		String str = "123";
		Assert.assertEquals(Integer.valueOf(str).intValue(), si.makeStringToInteger(str));
		
		String str2 = "+123";
		Assert.assertEquals(Integer.valueOf(str2).intValue(), si.makeStringToInteger(str2));
		
		String str3 = "-123";
		Assert.assertEquals(Integer.valueOf(str3).intValue(), si.makeStringToInteger(str3));
	}

}
