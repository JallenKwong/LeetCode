package com.lun.swordtowardoffer;

import static org.junit.Assert.*;
import org.junit.Test;

public class ScanMatrixClockwiselyTest {
	
	@Test
	public void test() {
		ScanMatrixClockwisely sy = new ScanMatrixClockwisely();
		
		int[][] array = {{1, 2, 3, 4}, 
						{5, 6, 7, 8}, 
						{9, 10, 11, 12}, 
						{13, 14, 15, 16}};
		
		assertEquals("1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10", sy.scanMatrixClockwisely(array));
	}
	
	@Test
	public void test2() {
		ScanMatrixClockwisely sy = new ScanMatrixClockwisely();
		
		int[][] array = {{1,2}};
		
		assertEquals("1,2", sy.scanMatrixClockwisely(array));
	}
	
	@Test
	public void test3() {
		ScanMatrixClockwisely sy = new ScanMatrixClockwisely();
		
		int[][] array = {{1},{2},{3}};
		
		assertEquals("1,2,3", sy.scanMatrixClockwisely(array));
	}
}
