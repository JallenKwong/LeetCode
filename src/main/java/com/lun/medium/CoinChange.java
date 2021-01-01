package com.lun.medium;

import java.util.Arrays;

public class CoinChange {
	public int coinChange(int[] coins, int amount) {
		int[] f = new int[amount + 1];
		Arrays.fill(f, Integer.MAX_VALUE);
		f[0] = 0;

		for (int i = 1; i <= amount; i++) {
			//如果通过放这个硬币能够达到数量i
			for(int coin : coins) {
				if (i >= coin && f[i - coin] != Integer.MAX_VALUE)
	                // 获得i的数量的硬币数就可能是获得i-A[j]重量硬币数的方案+1
	                // 拿这个方案数量与原本的方案数打擂台，取最小值就行
					f[i] = Math.min(f[i - coin] + 1, f[i]);
			}
		}

		if (f[amount] == Integer.MAX_VALUE) {
			return -1;
		}
		return f[amount];
	}
}
