package com.lun.easy;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnNumberTest {

	@Test
	public void test() {
		ExcelSheetColumnNumber en = new ExcelSheetColumnNumber();
		Assert.assertEquals(1, en.titleToNumber("A"));
		Assert.assertEquals(2, en.titleToNumber("B"));
		Assert.assertEquals(3, en.titleToNumber("C"));
		Assert.assertEquals(26, en.titleToNumber("Z"));

		Assert.assertEquals(27, en.titleToNumber("AA"));
		Assert.assertEquals(28, en.titleToNumber("AB"));
		Assert.assertEquals(53, en.titleToNumber("BA"));

		Assert.assertEquals(701, en.titleToNumber("ZY"));
	}
}
