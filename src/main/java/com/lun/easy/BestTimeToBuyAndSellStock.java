package com.lun.easy;

public class BestTimeToBuyAndSellStock {
	public int maxProfit1(int[] prices) {
		if (prices == null || prices.length == 0)
			return 0;
		int max = 0;

		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int profit = prices[j] - prices[i];
				if (profit > max)
					max = profit;
			}
		}

		return max;
	}

	public int maxProfit2(int[] prices) {
		if (prices == null || prices.length == 0)
			return 0;
		int min = prices[0], max = 0;
		for (int i = 1; i < prices.length; i++) {
			min = Math.min(min, prices[i]);
			max = Math.max(prices[i] - min, max);
		}
		return max;
	}

	public int maxProfit3(int[] prices) {
		int maxCur = 0, maxSoFar = 0;
		for (int i = 1; i < prices.length; i++) {
			maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
			maxSoFar = Math.max(maxCur, maxSoFar);
		}
		return maxSoFar;
	}

}
