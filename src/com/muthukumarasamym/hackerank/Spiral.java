package com.muthukumarasamym.hackerank;

import java.util.Arrays;

public class Spiral {

	public static void main(String[] args) {
		int n = 8;
		Spiral s = new Spiral();
		s.spiral(n);

	}

	private void spiral(int n) {

		int arr[][] = new int[n][n];
		int top = 0, left = 0, right = n - 1, bottom = n - 1, num = 1;

		while (top <= bottom && left <= right) {

			for (int i = top; i <= right; i++) {
				arr[top][i] = num++;
			}
			top++;
			if (top > bottom && left > right)
				break;
			for (int i = top; i <= bottom; i++) {
				arr[i][right] = num++;
			}
			right--;
			bottom--;
			if (top > bottom && left > right)
				break;

			for (int i = bottom; i >= top; i--) {
				arr[i][i + left] = num++;
			}
			left++;
			bottom--;

		}

		printArray(arr);
	}

	private static void printArray(int[][] arr) {

		for (int[] i : arr) {
			for (int j : i) {
				if (j != 0)
					System.out.printf("%3d ", j);
				else
					System.out.printf("    ");
			}
			System.out.println();
		}
	}

}