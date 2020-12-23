package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class FindTheDuplicateNumberTest {

	@Test
	public void test() {
		FindTheDuplicateNumber obj = new FindTheDuplicateNumber();

		assertEquals(2, obj.findDuplicate1(new int[] {1, 3, 4, 2, 2}));
		assertEquals(3, obj.findDuplicate1(new int[] {3, 1, 3, 4, 2}));
		assertEquals(1, obj.findDuplicate1(new int[] {1, 1}));
		assertEquals(1, obj.findDuplicate1(new int[] {1, 1, 2}));
		
		assertEquals(2, obj.findDuplicate2(new int[] {1, 3, 4, 2, 2}));
		assertEquals(3, obj.findDuplicate2(new int[] {3, 1, 3, 4, 2}));
		assertEquals(1, obj.findDuplicate2(new int[] {1, 1}));
		assertEquals(1, obj.findDuplicate2(new int[] {1, 1, 2}));
		
		assertEquals(2, obj.findDuplicate3(new int[] {1, 3, 4, 2, 2}));
		assertEquals(3, obj.findDuplicate3(new int[] {3, 1, 3, 4, 2}));
		assertEquals(1, obj.findDuplicate3(new int[] {1, 1}));
		assertEquals(1, obj.findDuplicate3(new int[] {1, 1, 2}));
	}
}
