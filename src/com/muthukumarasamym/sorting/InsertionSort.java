package com.muthukumarasamym.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		InsertionSort i = new InsertionSort();
		int arr[] = { 21, 2, 4, 11, 9, 7, 66 };
		int arr1[] = { 21, 2, 4, 11, 9, 7, 66 };
		i.insertionSort(arr);
		i.insertionSort1(arr1);
	}

	private void insertionSort1(int[] arr) {

		for (int i = 1, j = 0; i < arr.length; i++) {
			int key = arr[i];
			for (j = i - 1; j >= 0 && arr[j] < key; j--)
				arr[j + 1] = arr[j];
			arr[j + 1] = key;
		}
		System.out.println(Arrays.toString(arr));

	}

	private void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1, key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;

		}
		System.out.println(Arrays.toString(arr));

	}

}
