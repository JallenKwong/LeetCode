package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class HappyNumberTest {

	@Test
	public void test() {
		HappyNumber obj = new HappyNumber();
		
		assertTrue(obj.isHappy1(19));
		assertFalse(obj.isHappy1(2));
		
		assertTrue(obj.isHappy2(19));
		assertFalse(obj.isHappy2(2));
	}
}
