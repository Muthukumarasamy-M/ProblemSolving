package com.muthukumarasamym.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int arr[] = { 7, 4, 1, 6, 0, 3, 8, 5, 9 };
		MergeSort m = new MergeSort();
		System.out.println((Arrays.toString(arr)));
		m.mergeSort(arr.length, arr);

		System.out.println((Arrays.toString(arr)));

	}

	private void mergeSort(int n, int[] arr) {

		if (n < 2)
			return;

		int mid = n / 2;
		int[] l = Arrays.copyOfRange(arr, 0, mid);
		int[] r = Arrays.copyOfRange(arr, mid, n);
		mergeSort(mid, l);
		mergeSort(n - mid, r);
		
		merge(arr, l, r, mid, n - mid);

	}

	private void merge(int[] arr, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		
		while (i < left && j < right) {
			if (l[i] <= r[j])
				arr[k++] = l[i++];
			else
				arr[k++] = r[j++];
		}
		while (i < l.length)
			arr[k++] = l[i++];
		
		while (j < r.length)
			arr[k++] = r[j++];
	}

}
