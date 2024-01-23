package com.muthukumarasamym.leetcode;

public class ClimbingStairs {

	public static void main(String[] args) {
		ClimbingStairs c = new ClimbingStairs();
		int n = 5;
		System.out.println(c.climbingStairs(n));

	}

	private int climbingStairs(int n) {

		int second = 2;
		int first = 1, sum = 0;
		if (n <= 2)
			return n;
		else {
			for (int i = 3; i <= n; i++) {
				sum = first + second;
				first = second;
				second = sum;
			}
		}
		return sum;

	}

}
