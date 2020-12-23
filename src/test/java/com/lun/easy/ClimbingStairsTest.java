package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ClimbingStairsTest {

	@Test
	public void test() {
		ClimbingStairs obj = new ClimbingStairs();

		assertEquals(1, obj.climbStairs1(1));
		assertEquals(2, obj.climbStairs1(2));
		assertEquals(3, obj.climbStairs1(3));
		assertEquals(5, obj.climbStairs1(4));
		assertEquals(8, obj.climbStairs1(5));
		
		assertEquals(1, obj.climbStairs2(1));
		assertEquals(2, obj.climbStairs2(2));
		assertEquals(3, obj.climbStairs2(3));
		assertEquals(5, obj.climbStairs2(4));
		assertEquals(8, obj.climbStairs2(5));
		
		for(int i = 1; i <= 100; i++) {
			assertEquals(obj.climbStairs1(i), obj.climbStairs2(i));
			assertEquals(obj.climbStairs1(i), obj.climbStairs3(i));
		}
		
	}
}
