package com.muthukumarasamym.practice.dec14;

import java.util.Arrays;

/*Maximum Gap in Array:
Given an unsorted array, find the maximum difference between the successive 
elements in its sorted form.*/

public class MaximumGap {

	public static void main(String[] args) {

		int arr[] = { 2, 6, 33, 21, 12, 6, 89, 45 };
		MaximumGap m = new MaximumGap();
		m.findGap(arr);
	}

	private void findGap(int[] arr) {

		// int[] sortedArray =sort(arr);
		Arrays.sort(arr);
		int max = -999;
		for (int i = arr.length - 1; i >= 1; i--) {
			int cur = arr[i] - arr[i - 1];
			max = max > cur ? max : cur;
		}
		System.out.println(max);

	}

	private int[] sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

}
