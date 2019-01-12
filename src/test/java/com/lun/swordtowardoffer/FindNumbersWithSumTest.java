package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindNumbersWithSumTest {

	@Test
	public void testFind() {
		FindNumbersWithSum fs = new FindNumbersWithSum();
		
		int[] array = {1, 2, 4, 7, 11, 15};
		
		assertNull(fs.find(array, 30));
		
		assertArrayEquals(new int[] {4, 11}, fs.find(array, 15));
	}

}
