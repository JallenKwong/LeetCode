package com.lun.medium;

import org.junit.Assert;
import org.junit.Test;

public class MaximumLengthOfPairChainTest {

	@Test
	public void test() {
		int[][] array = {{1, 2}, {2, 3}, {3, 4}};
		
		MaximumLengthOfPairChain mc = new MaximumLengthOfPairChain();
		
		Assert.assertEquals(2, mc.findLongestChain(array));
		Assert.assertEquals(2, mc.findLongestChain2(array));
	}
	
	@Test
	public void test2() {
		int[][] array = {{6, 7}, {5, 6}, {2, 4}, {1, 2}, {2, 3}, {3, 4}};
		
		MaximumLengthOfPairChain mc = new MaximumLengthOfPairChain();
		
		//Assert.assertEquals(3, mc.findLongestChain(array));
		Assert.assertEquals(3, mc.findLongestChain2(array));
	}
	
}
