package com.lun.medium;

import org.junit.Assert;
import org.junit.Test;

import com.lun.util.MyUtils;

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
		
		int[][] grid = MyUtils.read2DIntArray("src/test/resources/2DArray.txt");
		
		Assert.assertEquals(823, new MinimumPathSum().minPathSum(grid));
		
	}
	
	@Test
	public void test6() {
		
		int[][] grid = MyUtils.read2DIntArray("src/test/resources/2DArray.txt");
		
		Assert.assertEquals(823, new MinimumPathSum().minPathSum2(grid));
		
	}
	@Test
	public void test7() {
		
		int[][] grid = MyUtils.read2DIntArray("src/test/resources/2DArray.txt");
		
		Assert.assertEquals(823, new MinimumPathSum().minPathSum3(grid));
		
	}
	
	
	

}
