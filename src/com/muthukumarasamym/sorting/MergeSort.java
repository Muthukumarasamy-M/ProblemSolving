package com.muthukumarasamym.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int arr[] = { 7, 4, 1, 6, 0, 3, 8, 5, 9, 2 };
		MergeSort m = new MergeSort();
		m.mergeSort(0, arr.length, arr);

	}

	private void mergeSort(int start, int end, int[] arr) {

		if (start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(start, mid, arr);
			mergeSort(mid + 1, end, arr);

			merge(start, mid, end, arr);
		}

	}

	private void merge(int start, int mid, int end, int[] arr) {

	}

}
