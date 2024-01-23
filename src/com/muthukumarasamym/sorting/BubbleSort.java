package com.muthukumarasamym.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 21, 2, 4, 11, 9, 7, 66,8 };

		BubbleSort b = new BubbleSort();
		b.bubblesort(arr);
	}

	private void bubblesort(int[] arr) {

		boolean flag = false;
		do {
			flag = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag = true;
				}
			}
		} while (flag != false);
		System.out.println("end"+Arrays.toString(arr));
	}

}
