package com.lun.easy;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElementTest {

	@Test
	public void test() {
		RemoveElement obj = new RemoveElement();

		
		int[] array1 = {3, 2, 2, 3};
		int expectedNum1 = 2;
		assertEquals(expectedNum1, obj.removeElement(array1, 3));
		assertArrayEquals(new int[] {2, 2}, Arrays.copyOf(array1, expectedNum1));
		
		
		int[] array2 = {0, 1, 2, 2, 3, 0, 4, 2};
		int expectedNum2 = 5;
		assertEquals(expectedNum2, obj.removeElement(array2, 2));
		assertArrayEquals(new int[] {0, 1, 4, 0, 3}, Arrays.copyOf(array2, expectedNum2));
		
		//---
		int[] array3 = {1};
		int expectedNum3 = 1;
		assertEquals(expectedNum3, obj.removeElement(array3, 2));
		assertArrayEquals(new int[] {1}, Arrays.copyOf(array3, expectedNum3));
		
		int[] array4 = {1};
		int expectedNum4 = 0;
		assertEquals(expectedNum4, obj.removeElement(array4, 1));
		assertArrayEquals(new int[] {}, Arrays.copyOf(array4, expectedNum4));
		
		
		int[] array5 = {4, 5};
		int expectedNum5 = 1;
		assertEquals(expectedNum5, obj.removeElement(array5, 5));
		assertArrayEquals(new int[] {4}, Arrays.copyOf(array5, expectedNum5));

	}
	
	
	@Test
	public void test2() {
		RemoveElement obj = new RemoveElement();
		
		int[] array1 = {3, 2, 2, 3};
		int expectedNum1 = 2;
		assertEquals(expectedNum1, obj.removeElement2(array1, 3));
		assertArrayEquals(new int[] {2, 2}, Arrays.copyOf(array1, expectedNum1));
		
		//---
		int[] array3 = {1};
		int expectedNum3 = 1;
		assertEquals(expectedNum3, obj.removeElement2(array3, 2));
		assertArrayEquals(new int[] {1}, Arrays.copyOf(array3, expectedNum3));
		
		int[] array4 = {1};
		int expectedNum4 = 0;
		assertEquals(expectedNum4, obj.removeElement2(array4, 1));
		assertArrayEquals(new int[] {}, Arrays.copyOf(array4, expectedNum4));
		
		
		int[] array5 = {4, 5};
		int expectedNum5 = 1;
		assertEquals(expectedNum5, obj.removeElement2(array5, 5));
		assertArrayEquals(new int[] {4}, Arrays.copyOf(array5, expectedNum5));
		
	}
	
	
}
