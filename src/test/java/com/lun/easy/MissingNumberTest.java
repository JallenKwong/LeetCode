package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class MissingNumberTest {

	@Test
	public void test() {
		MissingNumber obj = new MissingNumber();

		assertEquals(2, obj.missingNumber1(new int[] {3, 0, 1}));
		assertEquals(2, obj.missingNumber1(new int[] {0, 1}));
		assertEquals(8, obj.missingNumber1(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
		assertEquals(1, obj.missingNumber1(new int[] {0}));
		
		assertEquals(2, obj.missingNumber2(new int[] {3, 0, 1}));
		assertEquals(2, obj.missingNumber2(new int[] {0, 1}));
		assertEquals(8, obj.missingNumber2(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
		assertEquals(1, obj.missingNumber2(new int[] {0}));
		
		assertEquals(2, obj.missingNumber3(new int[] {3, 0, 1}));
		assertEquals(2, obj.missingNumber3(new int[] {0, 1}));
		assertEquals(8, obj.missingNumber3(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
		assertEquals(1, obj.missingNumber3(new int[] {0}));
		
		assertEquals(2, obj.missingNumber4(new int[] {3, 0, 1}));
		assertEquals(2, obj.missingNumber4(new int[] {0, 1}));
		assertEquals(8, obj.missingNumber4(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
		assertEquals(1, obj.missingNumber4(new int[] {0}));
		
		assertEquals(2, obj.missingNumber5(new int[] {3, 0, 1}));
		assertEquals(2, obj.missingNumber5(new int[] {0, 1}));
		assertEquals(8, obj.missingNumber5(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
		assertEquals(1, obj.missingNumber5(new int[] {0}));
	}
	
	@Test
	public void testOther() {
		assertEquals(0 | 1 << 31, Integer.MIN_VALUE) ; 
		assertEquals((0 | 1 << 31) - 1, Integer.MAX_VALUE) ; 
	}
}
