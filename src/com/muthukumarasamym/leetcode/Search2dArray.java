package com.muthukumarasamym.leetcode;

public class Search2dArray {

	public static void main(String[] args) {

		int arr[][] = { { 1, 3 } };
		Search2dArray s = new Search2dArray();
		int n = 3;
		System.out.println(s.searchMatrix(arr, n));

	}

	public boolean searchMatrix(int[][] matrix, int target) {

		int i = 0, j = matrix[0].length - 1;

		while (i <  matrix.length && j>=0) {
			if (matrix[i][j] == target)
				return true;
			else if (matrix[i][j] < target)
				i++;
			else
				j--;
		}
		return false;
	}
}
