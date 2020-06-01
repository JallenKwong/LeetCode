package com.lun.easy;


import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnTitleTest {

	@Test
	public void test() {
		ExcelSheetColumnTitle et = new ExcelSheetColumnTitle();

		Assert.assertEquals("A", et.convertToTitle(1));
		Assert.assertEquals("B", et.convertToTitle(2));
		Assert.assertEquals("C", et.convertToTitle(3));

		Assert.assertEquals("Z", et.convertToTitle(26));
		Assert.assertEquals("AA", et.convertToTitle(27));
		Assert.assertEquals("AB", et.convertToTitle(28));

		Assert.assertEquals("AAA", et.convertToTitle(703));
	}
	
	@Test
	public void test2() {
		ExcelSheetColumnTitle et = new ExcelSheetColumnTitle();
		
		Assert.assertEquals("A", et.convertToTitle2(1));
		Assert.assertEquals("B", et.convertToTitle2(2));
		Assert.assertEquals("C", et.convertToTitle2(3));
		
		Assert.assertEquals("Z", et.convertToTitle2(26));
		Assert.assertEquals("AA", et.convertToTitle2(27));
		Assert.assertEquals("AB", et.convertToTitle2(28));
		
		Assert.assertEquals("AAA", et.convertToTitle2(703));
	}
}
