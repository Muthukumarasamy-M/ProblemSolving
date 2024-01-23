package com.muthukumarasamym.leetcode;

public class MinPath {

	public static void main(String[] args) {
		int grid[][] = { { 1, 2,3 }, { 4, 5, 6 }};

		System.out.println(minPathSum(grid));

	}

	public static int minPathSum(int[][] grid) {

		int row = grid.length - 1;
		int col = grid[0].length - 1;
		for (int i = row; i >= 0; i--) {
			for (int j = col; j >= 0; j--) {

				if (i == row && j == col) {
					continue;
				} else if (j == col) {
					grid[i][j] += grid[i + 1][j];
				} else if (i == row) {
					grid[i][j] += grid[i][j + 1];
				} else {
					grid[i][j] += Math.min(grid[i + 1][j], grid[i][j + 1]);
				}

			}
		}
		return grid[0][0];

	}

}
