package com.muthukumarasamym.leetcode;

import java.util.*;

public class CountNicePairs {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = mc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the velues");
		for (int i = 0; i < n; i++)
			arr[i] = mc.nextInt();

		System.out.println(countNicePairs(arr));

	}

	private static int reverseInteger(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		return reversed;
	}

	public static int countNicePairs(int[] nums) {

		int len = nums.length;
		for (int i = 0; i < len; i++) {
			nums[i] = nums[i] - reverseInteger(nums[i]);
		}
		Arrays.sort(nums);
		int count = 1;
		for (int i = 0; i < len - 1; i++) {

			while (i < len - 1 && nums[i] == nums[i + 1]) {
				count++;
				i++;
			}

		}
		return count;

	}

}
