package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SortByParity {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the no of array");
		int n = mc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values");
		for (int i = 0; i < n; i++) {
			arr[i] = mc.nextInt();
		}
		System.out.println(Arrays.toString(sortArrayByParity(arr)));

	}

	public static int[] sortArrayByParity(int[] nums) {

		int k = 0, l = nums.length - 1;
		while (k <= l) {

			if (nums[k] % 2 != 0 && nums[l] % 2 == 0) {
				int temp = nums[k];
				nums[k] = nums[l];
				nums[l] = temp;
			} else if (nums[k] % 2 != 0)
				l--;
			else
				k++;
		}

		return nums;

	}

}
