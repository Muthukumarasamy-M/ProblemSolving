package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class MatrixContains {

	public static void main(String[] args) {
		int arr[][] = { { 2, 1, 3, }, { 3, 2, 1 }, { 1, 2, 3 } };

		System.out.println((checkValid(arr)));
	}

	public static boolean checkValid(int[][] matrix) {

		int n = matrix.length;

		for (int i = 0; i < n; i++) {

			int arr[] = new int[n];
			for (int j = 0; j < n; j++)
				arr[matrix[i][j] - 1]++;

			if (Arrays.stream(arr).anyMatch(x -> x == 0))
				return false;
		}
		for (int i = 0; i < n; i++) {

			int arr[] = new int[n];
			for (int j = 0; j < n; j++)
				arr[matrix[j][i] - 1]++;

			if (Arrays.stream(arr).anyMatch(x -> x == 0))
				return false;
		}
		return true;

	}

}
