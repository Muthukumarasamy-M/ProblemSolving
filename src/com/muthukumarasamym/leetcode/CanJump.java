package com.muthukumarasamym.leetcode;

public class CanJump {

	public static void main(String[] args) {
		int a[] = { 2,3,0,0,0,0,0};
		CanJump c = new CanJump();
		System.out.println(c.canJump(a));

	}

	public boolean canJump(int[] nums) {

		int reachable = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(i+" "+reachable);
			if (i > reachable)
				return false;
			reachable = Math.max(reachable, i + nums[i]);

		}
		return true;

	}
}
