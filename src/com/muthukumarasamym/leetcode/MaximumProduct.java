package com.muthukumarasamym.leetcode;

public class MaximumProduct {

	public static void main(String[] args) {

		int[] nums = { 3, 4, 5, 2 };
		MaximumProduct m = new MaximumProduct();
		System.out.println(m.maxProduct(nums));
	}

	public int maxProduct(int[] nums) {

		int lmax = -999, smax = -999;
		for (int num : nums) {
			if (num > lmax) {
				smax = lmax;
				lmax = num;
			} else if (num >= smax)
				smax = num;
		}
		return (lmax - 1) * (smax - 1);

	}
}
