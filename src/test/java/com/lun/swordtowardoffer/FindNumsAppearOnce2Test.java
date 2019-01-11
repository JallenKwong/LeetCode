package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindNumsAppearOnce2Test {

	@Test
	public void testFind() {
		
		FindNumsAppearOnce2 fo = new FindNumsAppearOnce2();
		
		int[] array = {1,2,1,3,1,3,3,4,5,5,4,4,5};
		
		assertEquals(2, fo.find(array));
	}

}
