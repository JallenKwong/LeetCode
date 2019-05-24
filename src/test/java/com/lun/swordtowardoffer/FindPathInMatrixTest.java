package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindPathInMatrixTest {

	@Test
	public void testFind() {
		FindPathInMatrix fm = new FindPathInMatrix();
		
		char[][] matrix = {{'a', 'b', 't', 'g'}
						, {'c', 'f', 'c', 's'}
						, {'j', 'd', 'e', 'h'}};
		
		assertTrue(fm.find(matrix, "bfce"));
		assertFalse(fm.find(matrix, "abfb"));
		
	}

}
