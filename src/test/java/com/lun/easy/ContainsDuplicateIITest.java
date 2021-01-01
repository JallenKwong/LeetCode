package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContainsDuplicateIITest {

	@Test
	public void test() {
		ContainsDuplicateII obj = new ContainsDuplicateII();

		int[][] array1 = {{1,2,3,1},{3}},
				array2 = {{1,0,1,1},{1}},
				array3 = {{1,2,3,1,2,3},{2}};
		
		assertTrue(obj.containsNearbyDuplicate1(array1[0], array1[1][0]));
		assertTrue(obj.containsNearbyDuplicate1(array2[0], array2[1][0]));
		assertFalse(obj.containsNearbyDuplicate1(array3[0], array3[1][0]));
		
		assertTrue(obj.containsNearbyDuplicate2(array1[0], array1[1][0]));
		assertTrue(obj.containsNearbyDuplicate2(array2[0], array2[1][0]));
		assertFalse(obj.containsNearbyDuplicate2(array3[0], array3[1][0]));
		
		assertTrue(obj.containsNearbyDuplicate3(array1[0], array1[1][0]));
		assertTrue(obj.containsNearbyDuplicate3(array2[0], array2[1][0]));
		assertFalse(obj.containsNearbyDuplicate3(array3[0], array3[1][0]));
	}
}
