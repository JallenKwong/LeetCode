package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class MajorityElementTest {

	@Test
	public void test() {
		MajorityElement obj = new MajorityElement();

		int[][] array = {{1, 1, 1, 1, 1, 3, 4, 5}, 
							{3, 2, 3}, {2, 2, 1, 1, 1, 2, 2}};
		
		assertEquals(1, obj.majorityElement1(array[0]));
		assertEquals(3, obj.majorityElement1(array[1]));
		assertEquals(2, obj.majorityElement1(array[2]));
		
		assertEquals(1, obj.majorityElement2(array[0]));
		assertEquals(3, obj.majorityElement2(array[1]));
		assertEquals(2, obj.majorityElement2(array[2]));
		
		assertEquals(1, obj.majorityElement3(array[0]));
		assertEquals(3, obj.majorityElement3(array[1]));
		assertEquals(2, obj.majorityElement3(array[2]));
		
		assertEquals(1, obj.majorityElement4_1(array[0]));
		assertEquals(3, obj.majorityElement4_1(array[1]));
		assertEquals(2, obj.majorityElement4_1(array[2]));
		
		assertEquals(1, obj.majorityElement4_2(array[0]));
		assertEquals(3, obj.majorityElement4_2(array[1]));
		assertEquals(2, obj.majorityElement4_2(array[2]));
		
		assertEquals(1, obj.majorityElement5(array[0]));
		assertEquals(3, obj.majorityElement5(array[1]));
		assertEquals(2, obj.majorityElement5(array[2]));
		
		assertEquals(1, obj.majorityElement6(array[0]));
		assertEquals(3, obj.majorityElement6(array[1]));
		assertEquals(2, obj.majorityElement6(array[2]));
		
	}
}
