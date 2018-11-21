package com.lun.hard;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockIIITest {
	
	@Test
	public void test() {
		BestTimeToBuyAndSellStockIII b = new BestTimeToBuyAndSellStockIII();
		
		Assert.assertEquals(6, b.maxProfit(new int[] {3,3,5,0,0,3,1,4}));
		Assert.assertEquals(4, b.maxProfit(new int[] {1,2,3,4,5}));
		Assert.assertEquals(0, b.maxProfit(new int[] {7,6,4,3,1}));
		
	}
	
	@Test
	public void test2() {
		BestTimeToBuyAndSellStockIII b = new BestTimeToBuyAndSellStockIII();
		
		Assert.assertEquals(6, b.maxProfit2(new int[] {3,3,5,0,0,3,1,4}));
		Assert.assertEquals(4, b.maxProfit2(new int[] {1,2,3,4,5}));
		Assert.assertEquals(0, b.maxProfit2(new int[] {7,6,4,3,1}));
		
	}
	
}
