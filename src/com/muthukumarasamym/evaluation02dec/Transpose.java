package com.muthukumarasamym.evaluation02dec;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		Transpose t = new Transpose();
		System.out.println("Enter the length of array");
		int len = mc.nextInt();
		int array[][] = new int[len][len];
		for (int i = 0; i < len; i++) {
			System.out.println("Enter the row " + (i + 1));
			for (int j = 0; j < len; j++)
				array[i][j] = mc.nextInt();
		}
		t.transpose(array);
	}

	private void transpose(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
		print(array);
	}

	private void print(int[][] array) {

		for (int arr[] : array) {
			for (int j : arr)
				System.out.print(j + " ");
			System.out.println();
		}

	}

}
