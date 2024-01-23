package com.muthukumarasamym.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 21, 2, 4, 11, 9, 7, 66 };
		SelectionSort s = new SelectionSort();
		s.selectionsort(arr);
		s.selectionsort1(arr);
	}

	private void selectionsort1(int[] arr ) {

		for (int i = 0; i < arr.length; i++) {
			int max = i;
			for (int j = i + 1; j < arr.length && arr[j] > arr[max]; j++) {
				max = j;
			}
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Decending\n" + Arrays.toString(arr));
	}

	private void selectionsort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int min = i, j = i + 1;
			while (j < arr.length && arr[j] < arr[min]) {
				min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
		System.out.println("Ascending\n" + Arrays.toString(arr));
	}

}
