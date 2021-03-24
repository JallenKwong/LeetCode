package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidPerfectSquareTest {

	@Test
	public void test() {
		ValidPerfectSquare obj = new ValidPerfectSquare();

		assertTrue(obj.isPerfectSquare(1));
		assertTrue(obj.isPerfectSquare(4));
		assertTrue(obj.isPerfectSquare(9));
		assertTrue(obj.isPerfectSquare(16));
		assertTrue(obj.isPerfectSquare(25));
		assertTrue(obj.isPerfectSquare(36));
		assertTrue(obj.isPerfectSquare(49));
		assertFalse(obj.isPerfectSquare(50));
	}

	@Test
	public void test2() {
		ValidPerfectSquare obj = new ValidPerfectSquare();

		assertTrue(obj.isPerfectSquare2(1));
		assertTrue(obj.isPerfectSquare2(4));
		assertTrue(obj.isPerfectSquare2(9));
		assertTrue(obj.isPerfectSquare2(16));
		assertTrue(obj.isPerfectSquare2(25));
		assertTrue(obj.isPerfectSquare2(36));
		assertTrue(obj.isPerfectSquare2(49));
		assertFalse(obj.isPerfectSquare2(50));
	}

	@Test
	public void test3() {
		ValidPerfectSquare obj = new ValidPerfectSquare();

		assertTrue(obj.isPerfectSquare3(1));
		assertTrue(obj.isPerfectSquare3(4));
		assertTrue(obj.isPerfectSquare3(9));
		assertTrue(obj.isPerfectSquare3(16));
		assertTrue(obj.isPerfectSquare3(25));
		assertTrue(obj.isPerfectSquare3(36));
		assertTrue(obj.isPerfectSquare3(49));
		assertFalse(obj.isPerfectSquare3(50));
		assertFalse(obj.isPerfectSquare3(Integer.MAX_VALUE));
	}

	@Test
	public void test4() {
		ValidPerfectSquare obj = new ValidPerfectSquare();

		assertTrue(obj.isPerfectSquare4(1));
		assertTrue(obj.isPerfectSquare4(4));
		assertTrue(obj.isPerfectSquare4(9));
		assertTrue(obj.isPerfectSquare4(16));
		assertTrue(obj.isPerfectSquare4(25));
		assertTrue(obj.isPerfectSquare4(36));
		assertTrue(obj.isPerfectSquare4(49));
		assertFalse(obj.isPerfectSquare4(50));
	}

}
