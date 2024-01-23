package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class MinCostClimbingStairs {

	public static void main(String[] args) {

		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		MinCostClimbingStairs m = new MinCostClimbingStairs();
		System.out.println(m.minCostClimbingStairs(arr));

	}

	public int minCostClimbingStairs(int[] cost) {
		for (int i = cost.length - 3; i >= 0; i--) {
			
			cost[i] += Math.min(cost[i + 1], cost[i + 2]);

		}
		System.out.println(Arrays.toString(cost));
		return Math.min(cost[0], cost[1]);
	}
}
