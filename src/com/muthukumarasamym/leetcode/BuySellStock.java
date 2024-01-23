package com.muthukumarasamym.leetcode;

public class BuySellStock {

	public static void main(String[] args) {
		BuySellStock b = new BuySellStock();
		int arr[] = { 2, 4, 1 };
		System.out.println(b.maxProfit(arr));

	}

	public int maxProfit(int[] prices) {

		if (prices == null || prices.length <= 1) {
			return 0;
		}
		int minPrice = prices[0];
		int maxProfit = 0;

		for (int i = 1; i < prices.length; i++) {
			int currentPrice = prices[i];

			if (currentPrice < minPrice) {
				minPrice = currentPrice;
			} else {
				int currentProfit = currentPrice - minPrice;
				maxProfit = Math.max(maxProfit, currentProfit);
			}
		}

		return maxProfit;
	}

}
