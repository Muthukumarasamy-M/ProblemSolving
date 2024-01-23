package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class DiagonalTraversal {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		DiagonalTraversal d = new DiagonalTraversal();
		d.findDiagonalOrder(arr);
	}

	public int[] findDiagonalOrder(int[][] mat) {

		int n = mat.length, m = mat[0].length;
		int i = 0, j = 0, index = 0, max = n * m;
		int array[] = new int[max];
		boolean dir = true;
		while (index < max) {

			if (dir) {
				while (i >= 0 && j < n) {
					array[index++] = mat[i][j];
					i--;
					j++;
				}
				i++;
				if (j >= n) {
					j = n - 1;
					i++;
				}
			} else {
				while (i < m && j >= 0) {
					array[index++] = mat[i][j];
					i++;
					j--;
				}
				j++;

				if (i >= m) {
					i = m - 1;
					j++;
				}
			}
			dir = !dir;
		}
		return array;

	}

}
