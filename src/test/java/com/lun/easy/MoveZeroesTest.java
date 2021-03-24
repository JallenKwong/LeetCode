package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoveZeroesTest {

	@Test
	public void test1() {
		MoveZeroes obj = new MoveZeroes();

		int[] original = {0, 1, 0, 3, 12};
		int[] expected = {1, 3, 12, 0, 0};
		obj.moveZeroes1(original);
		assertArrayEquals(expected, original);
		
		original = new int[]{1};
		expected = new int[]{1};
		obj.moveZeroes1(original);
		assertArrayEquals(expected, original);
		
		original = new int[]{1, 0};
		expected = new int[]{1, 0};
		obj.moveZeroes1(original);
		assertArrayEquals(expected, original);
		
		original = new int[]{2, 1};
		expected = new int[]{2, 1};
		obj.moveZeroes1(original);
		assertArrayEquals(expected, original);
		
		original = new int[]{0, 0, 1};
		expected = new int[]{1, 0, 0};
		obj.moveZeroes1(original);
		assertArrayEquals(expected, original);

	}
	
	@Test
	public void test2() {
		MoveZeroes obj = new MoveZeroes();
		
		int[] original = {0, 1, 0, 3, 12};
		int[] expected = {1, 3, 12, 0, 0};
		obj.moveZeroes2(original);
		assertArrayEquals(expected, original);
		
		original = new int[]{1};
		expected = new int[]{1};
		obj.moveZeroes2(original);
		assertArrayEquals(expected, original);
		
		original = new int[]{1, 0};
		expected = new int[]{1, 0};
		obj.moveZeroes2(original);
		assertArrayEquals(expected, original);
		
		original = new int[]{2, 1};
		expected = new int[]{2, 1};
		obj.moveZeroes2(original);
		assertArrayEquals(expected, original);
		
		original = new int[]{0, 0, 1};
		expected = new int[]{1, 0, 0};
		obj.moveZeroes2(original);
		assertArrayEquals(expected, original);
		
	}
}
