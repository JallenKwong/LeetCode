package com.lun.easy;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.lun.util.MyUtils;

public class RotateArrayTest {

	@Test
	public void test() {
		int[] nums = {1,2,3,4,5,6,7};
		new RotateArray().rotate(nums, 3);
		assertArrayEquals(new int[]{5,6,7,1,2,3,4}, nums);
	}
	
	@Test
	public void test2() {
		int[] nums = {-1,-100,3,99};
		new RotateArray().rotate(nums, 2);
		assertArrayEquals(new int[]{3,99,-1,-100}, nums);
	}
	
	@Test
	public void test3() {
		int[] nums = {1};
		new RotateArray().rotate(nums, 2);
		assertArrayEquals(new int[]{1}, nums);
	}
	
	@Test 
	public void test4() {
		int[] nums = MyUtils.readIntArray("src/test/resources/bigArray.txt");
		int[] nums2 = Arrays.copyOf(nums, nums.length); 
		
		new RotateArray().rotate(nums, nums.length / 2);
		new RotateArray().rotate2(nums2, nums2.length / 2);
		
		assertArrayEquals(nums, nums2);
	}
	
}
