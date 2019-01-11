package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindNumsAppearOnceTest {

	@Test
	public void testFind() {
		FindNumsAppearOnce fo = new FindNumsAppearOnce();
		
		int[] data = {2, 4, 3, 6, 3, 2, 5, 5};
		
		assertArrayEquals(new int[] {6, 4}, fo.find(data));
		
	}

}
