package com.muthukumarasamym.evaluation.firstevalution;

import java.util.Scanner;

public class SpiralPatten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		spiralPattern(n);
	}

	private static void spiralPattern(int n) {
		int[][] arr = new int[n][n];
		int top = 0, bottom = n - 1, left = 0, right = n - 1, num = 1;

		while (top <= bottom && left <= right) {

			for (int i = top; i <= bottom; i++) {

				arr[i][top + i] = num++;
			}
			left++;
			bottom--;

			if (top > bottom && left > right)
				break;

			for (int i = bottom; i >= top; i--) {
				arr[i][right] = num++;
			}
			right--;
			if (top > bottom && left > right)
				break;

			for (int i = right; i >= left; i--) {
				arr[top][i] = num++;
			}
			left++;
			top++;
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
