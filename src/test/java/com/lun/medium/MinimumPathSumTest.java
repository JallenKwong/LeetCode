package com.lun.medium;

import org.junit.Assert;
import org.junit.Test;

public class MinimumPathSumTest {

	@Test
	public void test() {
		int[][] grid = {{1,3,1},
				  		{1,5,1},
				  		{4,2,1}};
		
		Assert.assertEquals(7, new MinimumPathSum().minPathSum(grid));
		Assert.assertEquals(7, new MinimumPathSum().minPathSum2(grid));
	}
	
	@Test
	public void test2() {
		int[][] grid = {{9}};
		
		Assert.assertEquals(9, new MinimumPathSum().minPathSum(grid));
		Assert.assertEquals(9, new MinimumPathSum().minPathSum2(grid));
	}
	
	@Test
	public void test3() {
		int[][] grid = {{1,2}};
		
		Assert.assertEquals(3, new MinimumPathSum().minPathSum(grid));
		Assert.assertEquals(3, new MinimumPathSum().minPathSum2(grid));
	}
	
	@Test
	public void test4() {
		int[][] grid = {{1},{2}};
		
		Assert.assertEquals(3, new MinimumPathSum().minPathSum(grid));
		Assert.assertEquals(3, new MinimumPathSum().minPathSum2(grid));
	}
	
	@Test
	public void test5() {
		// 原本是来自于leetcode的src/test/resources/2DArray.txt，但是直接写在源文件上，会将Eclipse卡死
		int[][] grid = {{1}};
		
		Assert.assertEquals(1, new MinimumPathSum().minPathSum(grid));
		Assert.assertEquals(1, new MinimumPathSum().minPathSum2(grid));
	}
	

}
