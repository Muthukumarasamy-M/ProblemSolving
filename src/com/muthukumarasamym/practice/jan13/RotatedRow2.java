package com.muthukumarasamym.practice.jan13;

import java.util.Arrays;

public class RotatedRow2 {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 4, 1, 2, 3 }, { 3, 4, 1, 2 }, { 2, 3, 4, 1 } };
		RotatedRow2 s = new RotatedRow2();
		System.out.println(s.find(arr));
	}

	
	private boolean find(int[][] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			if (!check(arr[i], arr[i + 1], arr[i].length))
				return false;
		}
		return true;
	}

	private boolean check(int[] array1, int[] array2, int len) {

		return array1[len - 1] == array2[0]
				&& Arrays.equals(Arrays.copyOfRange(array2, 1, len), Arrays.copyOfRange(array1, 0, len - 1));
	}
}
