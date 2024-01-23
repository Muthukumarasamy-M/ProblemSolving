package com.muthukumarasamym.arrays;

import java.util.*;

public class MatrixMultiplication {

	public static final Scanner mc = new Scanner(System.in);

	static int[][] assign(int row, int col) {
		// getting user values for the array
		System.out.println("values of array ");
		int ans[][] = new int[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++) {
				ans[i][j] = mc.nextInt();
			}
		return ans;
	}

	static int[][] multiplication(int row1, int col1, int A[][], int row2, int col2, int B[][]) {

		int c[][] = new int[row1][col2];
		// matrix multiplication
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				for (int k = 0; k < row2; k++) {
					c[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		System.out.print("no of rows and col in first array :");
		int row1 = mc.nextInt();
		int col1 = mc.nextInt();
		System.out.print("no of rows and col in second array :");
		int row2 = mc.nextInt();
		int col2 = mc.nextInt();

		if (row2 != col1)
			System.out.println("Mutliplication no posible");

		int array1[][] = assign(row1, col1);
		int array2[][] = assign(row2, col2);

		System.out.println("Result of Multiplication:");
		int result[][] = multiplication(row1, col1, array1, row2, col2, array2);
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println(); // Move to the next row
		}
	}

}
