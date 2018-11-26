package com.lun.util;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class MyUtilsTest {
	
	
	@Test
	public void integerArray2intArray() {
		
		assertArrayEquals(new int[] {1, 2, 3}, MyUtils.integerArray2intArray(new Integer[]{1,2,3}));
		
	}
	
	
	@Test
	public void read2DIntArray() {
		
		System.out.println(Arrays.deepToString(MyUtils.read2DIntArray("src/test/resources/2DArray.txt")));
		
	}
	
	
}
