package com.muthukumarasamym.leetcode;

public class MinTimeToVisitPoints {

	public static void main(String[] args) {

		MinTimeToVisitPoints m = new MinTimeToVisitPoints();

		int arr[][] = { { 3, 2 }, { -2, 2 } };
		System.out.println(m.minTimeToVisitAllPoints(arr));

	}

	public int minTimeToVisitAllPoints(int[][] points) {

		int sum = 0;
		for (int i = 0; i < points.length - 1; i++) {
			int one=Math.abs(points[i][0] - points[i + 1][0]);
			int two=  Math.abs(points[i][1] - points[i + 1][1]);
			sum += Math.max(one,two);
		}
		return sum;
	}

}
