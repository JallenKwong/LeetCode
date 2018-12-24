package com.lun.swordtowardoffer;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountNumberInSortedArrayTest {
	
	@Test
	public void test() {
		int[] array = {1, 2, 3, 3, 3, 3, 4, 5};
		assertEquals(4, new CountNumberInSortedArray().count(array, 3));
	}
	
	@Test
	public void test2() {
		
		CountNumberInSortedArray ca = new CountNumberInSortedArray();
		int[] array = {1, 2, 3, 3, 3, 3, 4, 5};
		
		assertEquals(0, ca.findIndexOfTarget(array, 1, 0, array.length - 1, false));
		assertEquals(1, ca.findIndexOfTarget(array, 2, 0, array.length - 1, false));
		assertEquals(6, ca.findIndexOfTarget(array, 4, 0, array.length - 1, false));
		assertEquals(7, ca.findIndexOfTarget(array, 5, 0, array.length - 1, false));
		
		assertEquals(2, ca.findIndexOfTarget(array, 3, 0, array.length - 1, CountNumberInSortedArray.FIRST));
		assertEquals(5, ca.findIndexOfTarget(array, 3, 0, array.length - 1, CountNumberInSortedArray.LAST));
	}
	
	@Test
	public void test3() {
		int[] array = {1};
		assertEquals(0, new CountNumberInSortedArray().count(array, 3));
		assertEquals(1, new CountNumberInSortedArray().count(array, 1));
	}
}
