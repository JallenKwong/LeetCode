package com.lun.easy;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

	@Test	
	public void test() {
		RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();

		int[] array = {0,0,1,1,1,2,2,3,3,4};
		int expectNum = 5;
		assertEquals(expectNum, obj.removeDuplicates(array));
		assertArrayEquals(new int[] {0,1,2,3,4}, Arrays.copyOfRange(array, 0, expectNum));		
	}
}
