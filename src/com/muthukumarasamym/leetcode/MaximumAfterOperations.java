package com.muthukumarasamym.leetcode;
//leetcode problem-1846
import java.util.Arrays;   

public class MaximumAfterOperations {

	public static void main(String[] args) {
		int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.out.println(maximumElementAfterArranging(arr));
	}

	private static int maximumElementAfterArranging(int[] arr) {

		Arrays.sort(arr);
		arr[0] = 1;

		for (int i = 0; i < arr.length - 1; i++) {

			if (Math.abs(arr[i] - arr[i + 1]) > 1) {
				arr[i + 1] = arr[i] + 1;
			}

		}
		return arr[arr.length-1];
	}

}
