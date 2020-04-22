package com.lun.swordtowardoffer;

import static org.junit.Assert.*;
import org.junit.Test;

public class FindTheLostNumberInSortedArrayTest {
	
	@Test
	public void test() {
		int[] array = {0, 1, 2, 3, 4, 6, 7};
		FindTheLostNumberInSortedArray fa = new FindTheLostNumberInSortedArray();		
		assertEquals(5, fa.find(array));
	}
	
	@Test
	public void test2() {
		int[] array = {1, 2, 3, 4, 6, 7};
		FindTheLostNumberInSortedArray fa = new FindTheLostNumberInSortedArray();		
		assertEquals(0, fa.find(array));
	}
	
	@Test
	public void test3() {
		int[] array = {0, 1, 2, 3, 4, 5, 7};
		FindTheLostNumberInSortedArray fa = new FindTheLostNumberInSortedArray();		
		assertEquals(6, fa.find(array));
	}
	
	@Test
	public void test4() {
		int[] array = {0};
		FindTheLostNumberInSortedArray fa = new FindTheLostNumberInSortedArray();		
		assertEquals(-1, fa.find(array));
	}
	
}
