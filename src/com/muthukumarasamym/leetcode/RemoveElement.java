package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {

		int nums[] = { 1,2,3,4,4,3,3 };
		int val = 3;

		System.out.println(removeElement(nums, val));
	}

	public static int removeElement(int[] nums, int val) {

		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index] = nums[i];
				index++;
			}

		}
		System.out.println(Arrays.toString(nums));
		return index;
	}

}
