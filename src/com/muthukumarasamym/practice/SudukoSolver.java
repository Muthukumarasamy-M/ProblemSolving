package com.muthukumarasamym.practice;

public class SudukoSolver {

	public static void main(String[] args) {

		int arr[][] = { { 2, 1, 0, 4 },
						{ 4, 0, 0, 3 },
						{ 0, 4, 2, 0 }, 
						{ 1, 0, 4, 2 } };
		SudukoSolver s = new SudukoSolver();
		s.solve(arr);
	}

	private boolean solve(int[][] arr) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (arr[i][j] == 0) {
					for (int k = 1; k <= 4; k++) {
						if (find(i, j, k, arr)) {
							arr[i][j] = k;

						}

					}
				}
			}
		}
		print(arr);
		return false;

	}

	private void print(int[][] arr) {
		for (int[] no : arr) {
			for (int num : no)
				System.out.print(num + " ");
			System.out.println();
		}

	}

	private boolean find(int i, int j, int k, int[][] arr) {

		return ((!inRow(i, j, k, arr) & (!inCol(i, j, k, arr))));

	}

	private boolean inRow(int row, int col, int k, int[][] arr) {

		for (int i = 0; i < 4; i++) {
			if (arr[row][i] == k)
				return true;
		}
		return false;
	}

	private boolean inCol(int row, int col, int k, int[][] arr) {
		for (int i = 0; i < 4; i++) {
			if (arr[i][col] == k)
				return true;
		}
		return false;

	}

}
