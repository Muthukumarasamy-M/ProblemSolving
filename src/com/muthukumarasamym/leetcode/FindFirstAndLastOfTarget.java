package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class FindFirstAndLastOfTarget {

	public static void main(String[] args) {

		int arr[] = { 5, 7, 7, 8, 8, 9 };
		FindFirstAndLastOfTarget f = new FindFirstAndLastOfTarget();
		int n = 8;
		System.out.println(Arrays.toString(f.searchRange(arr, n)));
	}

	public int[] searchRange(int[] nums, int target) {
		int res[] = new int[2];
		res[0] = firstSearch(nums, target);
		res[1] = lastSearch(nums, target);
		return res;

	}

	private int lastSearch(int[] nums, int target) {

		int low = 0, high = nums.length - 1, ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (target == nums[mid]) {
				ans = mid;
				low = mid + 1;
			} else if (target > nums[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return ans;
	}

	private int firstSearch(int[] nums, int target) {
		int low = 0, high = nums.length - 1, ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (target == nums[mid]) {
				ans = mid;
				high = mid - 1;
			} else if (target > nums[mid]) {
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return ans;

	}

}
