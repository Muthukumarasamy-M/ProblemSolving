package com.muthukumarasamym.hackerank;

public class Spiral1 {

	public static void main(String[] args) {
		int n = 5;
		Spiral1 s = new Spiral1();
		s.spiral(n);

	}

	private void spiral(int n) {

		int arr[][] = new int[n][n];
		int top = 0, bottom = n - 1, left = 0, right = n - 1, num = 1;

		while (top <= bottom && left <= right) {

			for (int i = top; i <= right; i++) {
				arr[top][i] = num++;
			}
			top++;
			right--;

			if (top > bottom && left > right)
				break;
			for (int i = right; i >= left; i--) {
				arr[bottom - i][i] = num++;
			}
			bottom--;
			if (top > bottom && left > right)
				break;
			for (int i = bottom; i >= top; i--) {
				arr[i][left] = num++;
			}
			left++;
			right--;

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