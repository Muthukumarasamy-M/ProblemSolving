package com.muthukumarasamym.leetcode;

public class MinimumCoins {

	public static void main(String[] args) {

		int array[] = { 26, 18,6,12,49,7,45,45 };
		new MinimumCoins().minimumcoins(array);

	}

	private int minimumcoins(int[] prices) {
		int sum = 0;
		int n = prices.length;

		for (int i = 0; i < n - 1; i++) {
			if (i == 0 || (prices[i] <= prices[i + 1])) {
				sum += prices[i];
			}
		}
		return sum;
	}

}
