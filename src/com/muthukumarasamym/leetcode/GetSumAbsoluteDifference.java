package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class GetSumAbsoluteDifference {

	public static void main(String[] args) {
		int array[] = { 1, 2,3,4, 5 };

		GetSumAbsoluteDifference g = new GetSumAbsoluteDifference();

		System.out.println(Arrays.toString(g.getSumAbsoluteDifferences(array)));

	}

	public int[] getSumAbsoluteDifferences(int[] nums) {

		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				result[i] += Math.abs(nums[i] - nums[j]);
			}
		}
		return result;

	}

}
