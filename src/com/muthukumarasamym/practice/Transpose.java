package com.muthukumarasamym.practice;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the row and col");
		int row = mc.nextInt();
		int col = mc.nextInt();
		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				arr[i][j] = mc.nextInt();
		}
		Transpose t = new Transpose();
		System.out.println("original array ");
		print(arr);
		t.transpose(arr);
	}

	private static void print(int[][] arr) {
		for (int[] num : arr) {
			for (int no : num) {
				System.out.print(no + " ");
			}
			System.out.println();
		}

	}

	private void transpose(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		System.out.println("transposed Array");
		print(arr);

	}

}
