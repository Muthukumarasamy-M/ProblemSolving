package com.muthukumarasamym.practice.dec13;

import java.util.Scanner;

/*Matrix Rotation:
Rotate a given square matrix by 90 degrees in the clockwise direction.
Implement the rotation in-place without using any additional data structures.*/
public class Rotation {

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
		Rotation t = new Rotation();
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
			arr[i] = reverse(arr[i]);

		}
		System.out.println("rotated Array");
		print(arr);

	}

	private int[] reverse(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

}
