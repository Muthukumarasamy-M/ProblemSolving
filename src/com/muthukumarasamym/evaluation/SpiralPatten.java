package com.muthukumarasamym.evaluation;

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

		while (top < bottom || left < right) {

			for (int i = top; i <= bottom; i++) {

				arr[i][left + i] = num++;
			}
			left++;
			bottom--;

			for (int i = bottom; i >= top; i--) {
				arr[i][right] = num++;
			}
			right--;
			
			for (int i = right; i >= left; i--) {
				if (i == left && top != 0)
					break;
				arr[top][i] = num++;
			}
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
