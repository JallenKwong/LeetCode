package com.lun.medium;

import org.junit.Assert;
import org.junit.Test;

import static com.lun.medium.ValidateIPAddress.*;

public class ValidateIPAddressTest {
	
	@Test
	public void testFrom0To255Regex() {
		Assert.assertTrue("255".matches(from0To255Regex));
		Assert.assertTrue("249".matches(from0To255Regex));
		Assert.assertTrue("199".matches(from0To255Regex));
		Assert.assertFalse("256".matches(from0To255Regex));
		Assert.assertFalse("01".matches(from0To255Regex));
		Assert.assertTrue("0".matches(from0To255Regex));
		Assert.assertTrue("249.2".matches(from0To255Regex + "\\." + from0To255Regex));
	}

	@Test
	public void testFrom0ToFfffRegex() {
		Assert.assertTrue("0".matches(from0ToFfffRegex));
		Assert.assertTrue("0000".matches(from0ToFfffRegex));
		Assert.assertTrue("FFFF".matches(from0ToFfffRegex));
		Assert.assertTrue("ffff".matches(from0ToFfffRegex));
		Assert.assertTrue("0fff".matches(from0ToFfffRegex));
	}

	@Test
	public void test() {
		ValidateIPAddress va = new ValidateIPAddress();
		Assert.assertEquals("IPv4", va.validIPAddress("172.16.254.1"));
		Assert.assertEquals("Neither", va.validIPAddress("172.16.254.01"));
		Assert.assertEquals("Neither", va.validIPAddress("256.256.256.256"));
		Assert.assertEquals("IPv6", va.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
		Assert.assertEquals("IPv6", va.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
		Assert.assertEquals("Neither", va.validIPAddress("2001:0db8:85a3::8A2E:0370:7334"));
		Assert.assertEquals("Neither", va.validIPAddress("02001:0db8:85a3::8A2E:0370:7334"));
	}
	
	@Test
	public void test2() {
		ValidateIPAddress va = new ValidateIPAddress();
		Assert.assertEquals("IPv4", va.validIPAddress2("172.16.254.1"));
		Assert.assertEquals("Neither", va.validIPAddress2("172.16.254.01"));
		Assert.assertEquals("Neither", va.validIPAddress2("256.256.256.256"));
		Assert.assertEquals("IPv6", va.validIPAddress2("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
		Assert.assertEquals("IPv6", va.validIPAddress2("2001:0db8:85a3:0:0:8A2E:0370:7334"));
		Assert.assertEquals("Neither", va.validIPAddress2("2001:0db8:85a3::8A2E:0370:7334"));
		Assert.assertEquals("Neither", va.validIPAddress2("02001:0db8:85a3::8A2E:0370:7334"));
	}
}
