package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class OnesAndZeroesTest {

	@Test
	public void test() {
		OnesAndZeroes onz = new OnesAndZeroes();
		String[] array = {"10", "0001", "111001", "1", "0"};
		assertEquals(4, onz.findMaxForm(array, 5, 3));
		assertEquals(4, onz.findMaxForm2(array, 5, 3));
	}
	
	@Test
	public void test2() {
		OnesAndZeroes onz = new OnesAndZeroes();
		String[] array = {"10", "0", "1"};
		assertEquals(2, onz.findMaxForm(array, 1, 1));
		assertEquals(2, onz.findMaxForm2(array, 1, 1));
	}
}
