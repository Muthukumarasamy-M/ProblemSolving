package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class DifferenceInArrays {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 3, 2, 7, 3 };
		DifferenceInArrays d = new DifferenceInArrays();
		int k = 3;
		System.out.println(Arrays.deepToString(d.divideArray(arr, k)));
	}

	public int[][] divideArray(int[] nums, int k) {

		int arr[][] = new int[nums.length / 3][3];
		Arrays.sort(nums);
		int index = 0;
		for (int i = 0; i < nums.length; i += 3) {

			if (nums[i+2] - nums[i] > k)
				return new int[0][0];
			else {
				arr[index][0] = nums[i];
				arr[index][1] = nums[i+1];
				arr[index][2] = nums[i+2];

			}
			index++;
		}
		return arr;

	}

}
