package com.muthukumarasamym.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class OnesMinusZeros {
	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);

		int arr[][] = { { 0, 1, 1 }, { 1, 0, 1 } };
		OnesMinusZeros o = new OnesMinusZeros();
		o.onesMinusZeros(arr);
	}

	private void onesMinusZeros(int[][] grid) {

		int[] rowOnes = new int[grid.length];
		int[] colOnes = new int[grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				rowOnes[i] += grid[i][j];
				colOnes[j] += grid[i][j];
			}
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = 2 * (rowOnes[i] + colOnes[j]) - grid.length - grid[0].length;
			}
		}

		print(grid);
	}

	private void print(int[][] diff) {
		for (int[] no : diff) {
			for (int num : no)
				System.out.print(num + " ");
			System.out.println();
		}

	}
}
