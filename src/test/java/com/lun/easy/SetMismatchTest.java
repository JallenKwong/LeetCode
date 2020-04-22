package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class SetMismatchTest {

	@Test
	public void test() {
		SetMismatch obj = new SetMismatch();

		assertArrayEquals(new int[] {2, 3},  obj.findErrorNums(new int[] {1,2,2,4}));
		
	}
}
