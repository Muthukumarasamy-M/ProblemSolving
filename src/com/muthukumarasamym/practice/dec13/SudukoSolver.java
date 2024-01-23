package com.muthukumarasamym.practice.dec13;

/*
Sudoku Solver:
Implement a Java program to solve a given Sudoku puzzle. 
The input will be a partially filled 9x9 grid, and the output should be the solved Sudoku*/
public class SudukoSolver {

	public static void main(String[] args) {

		int arr[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },

				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },

				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
		SudukoSolver s = new SudukoSolver();
		s.solve(arr);
	}

	private boolean solve(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 0) {
					for (int k = 1; k <= arr.length; k++) {
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

		return ((!inRow(i, j, k, arr) && (!inCol(i, j, k, arr)) && (!findInBox(i - i % 3, j - j % 3, k, arr))));

	}

	private boolean findInBox(int row, int col, int num, int[][] arr) {

		for (int i = row; i < row + 3; i++)
			for (int j = col; j < col + 3; j++) {
				if (arr[row][col] == num)
					return true;
			}
		return false;
	}

	private boolean inRow(int row, int col, int k, int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[row][i] == k)
				return true;
		}
		return false;
	}

	private boolean inCol(int row, int col, int k, int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][col] == k)
				return true;
		}
		return false;

	}

}
