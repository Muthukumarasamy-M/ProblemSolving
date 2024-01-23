package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SortEvenOdd {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = mc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			a[i] = mc.nextInt();
		}
		System.out.println(Arrays.toString(sortEvenOdd(a)));
	}

	private static int[] sortEvenOdd(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int max = nums[i];
			int min = nums[i];
			int k = i;
			for (int j = i + 2; j < nums.length; j += 2) {
				if (i % 2 != 0) {
					if ( nums[j] > max) {
						max = nums[j];
						k = j;
					}
				} else {
					if (nums[j]< min) {
						min = nums[j];
						k = j;
					}

				}
			}
			int temp = nums[k];
			nums[k] = nums[i];
			nums[i] = temp;
		}

		return nums;
	}

}
