package com.muthukumarasamym.leetcode;

public class HouseRobber2 {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 2 };
		HouseRobber2 h = new HouseRobber2();
		System.out.println(h.rob1(arr));

	}

	private int rob1(int[] nums) {

		int n = nums.length;

		if (n == 1)
			return nums[0];
		if (n == 2)
			return Math.max(nums[0], nums[1]);

		return Math.max(rob(nums, 0, n - 1), rob(nums, 1, n));
	}

	private int rob(int[] nums, int start, int end) {

		int prev = 0;
		int curr = 0;
		for (int i = start; i < end; i++) {
			int neww = Math.max(prev + nums[i], curr);
			prev = curr;
			curr = neww;

		}

		return curr;
	}

}
