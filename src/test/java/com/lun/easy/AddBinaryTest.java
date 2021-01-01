package com.lun.easy;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

	@Test
	public void testAddBinary() {
		AddBinary ab = new AddBinary();
		Assert.assertEquals("0", ab.addBinary("0", "0"));
		Assert.assertEquals("1", ab.addBinary("1", "0"));
		Assert.assertEquals("1", ab.addBinary("0", "1"));
		Assert.assertEquals("10", ab.addBinary("1", "1"));
		Assert.assertEquals("110", ab.addBinary("11", "11"));
		Assert.assertEquals("101", ab.addBinary("11", "10"));
		Assert.assertEquals("100", ab.addBinary("11", "1"));
		Assert.assertEquals("100", ab.addBinary("11", "1"));
		Assert.assertEquals("10000", ab.addBinary("1111", "1"));
		Assert.assertEquals("1001", ab.addBinary("1000", "1"));
		Assert.assertEquals(
				"110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",
				ab.addBinary(
						"10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
						"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
	}

	@Test
	public void testAddBinary2() {
		AddBinary ab = new AddBinary();
		Assert.assertEquals("0", ab.addBinary2("0", "0"));
		Assert.assertEquals("1", ab.addBinary2("1", "0"));
		Assert.assertEquals("1", ab.addBinary2("0", "1"));
		Assert.assertEquals("10", ab.addBinary2("1", "1"));
		Assert.assertEquals("110", ab.addBinary2("11", "11"));
		Assert.assertEquals("101", ab.addBinary2("11", "10"));
		Assert.assertEquals("100", ab.addBinary2("11", "1"));
		Assert.assertEquals("100", ab.addBinary2("11", "1"));
		Assert.assertEquals("10000", ab.addBinary2("1111", "1"));
		Assert.assertEquals("1001", ab.addBinary2("1000", "1"));
		Assert.assertEquals(
				"110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",
				ab.addBinary2(
						"10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
						"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
	}

}
