package com.muthukumarasamym.evaluation.secondevalution;

import java.util.Scanner;

public class Transpose {

	Scanner mc = new Scanner(System.in);

	public static void main(String[] args) {

		Transpose t = new Transpose();
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the row of array");
		int row = mc.nextInt();
		System.out.println("Enter the col of array");
		int col = mc.nextInt();
		t.getValues(row, col);

	}

	private void getValues(int row, int col) {

		int array[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			System.out.println("Enter the row " + (i + 1));
			for (int j = 0; j < col; j++)
				array[i][j] = mc.nextInt();
		}
		System.out.println("original Array");
		print(array);
		System.out.println("transposed Array");
		transpose(array, row, col);

	}

	private void transpose(int[][] array, int row, int col) {

		int tarray[][] = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				tarray[j][i] = array[i][j];
			}
		}
		print(tarray);
	}

	private void print(int[][] tarray) {

		for (int arr[] : tarray) {
			for (int j : arr)
				System.out.print(j + " ");
			System.out.println();
		}

	}

}
