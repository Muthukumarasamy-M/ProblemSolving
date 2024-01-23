package com.muthukumarasamym.practice.dec14;

import java.util.Arrays;

//Given an unsorted array, write a Java function to find the kth smallest element in the array.
public class MinimumElement {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 33, 21, 12, 6, 89, 45 };
		MinimumElement m = new MinimumElement();
		System.out.println("kth smallest element");
		int k = 2;
		m.minimumElement(arr, k);

	}

	private void minimumElement(int[] arr, int k) {

		// int[] sortedArray =sort(arr);
		Arrays.sort(arr);
		System.out.println(arr[k - 1]);

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
