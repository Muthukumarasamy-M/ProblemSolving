package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZElements {
	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the i and j value");
		int i = mc.nextInt();
		int j = mc.nextInt();
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		ZElements z = new ZElements();
		z.zPattern(arr, i, j);

	}

	public void zPattern(int arr[][], int i, int j) {
		int row = arr.length - 1;
		int col = arr[0].length - 1;
		int l = i, k = j;
		System.out.print("\nArray 1-> ");

		while (k <= col) {
			System.out.print(arr[l][k++] + " ");
		}
		System.out.print("\nArray 2-> ");
		k--;
		while (l <= row && k >= 0) {
			System.out.print(arr[l++][k--] + " ");
		}
		System.out.print("\nArray 3-> ");
		l--;
		k++;
		while (k <= col) {
			System.out.print(arr[l][k++] + " ");
		}

	}
}
