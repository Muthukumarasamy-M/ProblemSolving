package com.muthukumarasamym.leetcode;

import java.util.*;

public class ThreeSumCloset {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n = mc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values");
		for (int i = 0; i < n; i++) {
			arr[i] = mc.nextInt();

		}
		System.out.println("Enter the target");
		int target = mc.nextInt();
		System.out.println(threeSumCloset(arr, target));
	}

	private static int threeSumCloset(int[] nums, int target) {

		Arrays.sort(nums);
		int closestSum = nums[0] + nums[1] + nums[2];
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];

				if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
					closestSum = sum;
				}

				if (sum < target) {
					j++;
				} else {
					k--;
				}
			}
		}

		return closestSum;
	}

}
