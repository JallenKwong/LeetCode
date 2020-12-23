package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

	@Test
	public void test() {
		BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();

		int[] array1 = {7, 1, 5, 3, 6, 4};
		int[] array2 = {7, 6, 4, 3, 1};
		
		
		assertEquals(5, obj.maxProfit1(array1));
		assertEquals(0, obj.maxProfit1(array2));
		
		assertEquals(5, obj.maxProfit2(array1));
		assertEquals(0, obj.maxProfit2(array2));
		
		assertEquals(5, obj.maxProfit3(array1));
		assertEquals(0, obj.maxProfit3(array2));
	}
}
