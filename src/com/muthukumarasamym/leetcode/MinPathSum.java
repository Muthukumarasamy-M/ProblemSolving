package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class MinPathSum {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		MinPathSum m = new MinPathSum();
		m.findMinPath(arr);
	}

	private int findMinPath(int[][] arr) {
		int rows = arr.length;

		for (int i = rows - 2; i >= 0; i--) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 && (j + 1) < arr[i].length)
					arr[i][j] += Math.min(arr[i + 1][j], arr[i + 1][j + 1]);
				else if (j == arr[i].length - 1)
					arr[i][j] += Math.min(arr[i + 1][j], arr[i + 1][j - 1]);
				else
					arr[i][j] += Math.min(arr[i + 1][j - 1], Math.min(arr[i + 1][j], arr[i + 1][j + 1]));
			}
		}

		int min = Arrays.stream(arr[0]).min().orElse(99999999);
		return min;
	}
}