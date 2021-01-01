package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContainsDuplicateTest {

	@Test
	public void test() {
		ContainsDuplicate obj = new ContainsDuplicate();
		
		int[][] array = {{1, 2, 3, 1}, {1, 2, 3, 4}, 
				{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}};
		
		assertTrue(obj.containsDuplicate1(array[0]));
		assertFalse(obj.containsDuplicate1(array[1]));
		assertTrue(obj.containsDuplicate1(array[2]));
		
		assertTrue(obj.containsDuplicate2(array[0]));
		assertFalse(obj.containsDuplicate2(array[1]));
		assertTrue(obj.containsDuplicate2(array[2]));
		
		assertTrue(obj.containsDuplicate3(array[0]));
		assertFalse(obj.containsDuplicate3(array[1]));
		assertTrue(obj.containsDuplicate3(array[2]));
		
	}
}
