package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class SqrtXTest {

	@Test
	public void test() {
		SqrtX obj = new SqrtX();

		assertEquals(2, obj.mySqrt(4));
		assertEquals(2, obj.mySqrt(8));
	}
	
	@Test
	public void test2() {
		SqrtX obj = new SqrtX();
		
		assertEquals(2, obj.mySqrt2(4));
		assertEquals(2, obj.mySqrt2(8));
	}
}
