package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class SortColors {

	public static void main(String[] args) {

		int arr[] = { 2, 0, 2, 1, 1, 0 };
		SortColors s = new SortColors();
		s.sortColors(arr);
		System.out.println(Arrays.toString(arr));
		s.sortColors1(arr);
	}

	public void sortColors(int[] nums) {

		for (int i = 1; i < nums.length; i++) {
			int key = nums[i];
			int j = i - 1;
			while (j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j];
				j = j - 1;

			}
			nums[j + 1] = key;
		}
	}

	public void sortColors1(int[] nums) {
		// bubble sort
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[j] < nums[i]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	public void sortColors2(int []nums)
	{
		
	}
}
