package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class SetMisMatch {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 4 };

		SetMisMatch s = new SetMisMatch();

		s.findErrorNums(arr);
	}

	public int[] findErrorNums(int[] nums) {

		int result[] = new int[nums.length + 1];
		int dup = -1, miss = -1;

		for (int num : nums) {
			result[num]++;
		}
		for (int i = 1; i < nums.length; i++) {
			if (result[i] == 2)
				dup = nums[i];
			if (result[i] == 0)
				miss = nums[i];
		}
		return new int[] { dup, miss };
	}

	

}
