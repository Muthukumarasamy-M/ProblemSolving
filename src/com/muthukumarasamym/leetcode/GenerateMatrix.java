package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class GenerateMatrix {

	public static void main(String[] args) {

		int n = 3;
		GenerateMatrix g = new GenerateMatrix();
		System.out.println(Arrays.deepToString(g.generateMatrix(n)));

	}

	public int[][] generateMatrix(int n) {

		int arr[][] = new int[n][n];
		int top = 0, bottom = n - 1, left = 0, right = n - 1, count = 1;
		while (top <= bottom && left <= right) {

			for (int i = top; i <= right; i++)
				arr[top][i] = count++;
			top++;
			for (int i = top; i <= bottom; i++)
				arr[i][right] = count++;
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--)
					arr[bottom][i] = count++;
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--)
					arr[i][left] = count++;
				left++;
			}
		}
		return arr;

	}

}
