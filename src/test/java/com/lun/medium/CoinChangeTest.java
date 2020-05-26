package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class CoinChangeTest {

	@Test
	public void test() {
		CoinChange obj = new CoinChange();

		assertEquals(3, obj.coinChange(new int[] {1, 2, 5}, 11));
		assertEquals(-1, obj.coinChange(new int[] {2}, 3));
		assertEquals(5, obj.coinChange(new int[] {2, 5, 7}, 27));
	}
}
