package com.muthukumarasamym.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {

	public static void main(String[] args) {

		int arr[] = { 21, 2, 4, 11, 9, 7, 66 };
		BucketSort b = new BucketSort();
		b.bucketSort(arr);
	}

	private void bucketSort(int[] arr) {

		int max = -999, min = 999;
		for (int num : arr) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		int bucketcount = (max - min) / 10 + 1;
		System.out.println(bucketcount);
		List<Integer>[] list = new List[bucketcount];
		int index = 0;
		for (int i = 0; i < bucketcount; i++)
			list[i] = new ArrayList();

		for (int num : arr) {
			index = (num - min) / 10;
			System.out.println(index);
			list[index].add(num);
		}
		for (List li : list)
			Collections.sort(li);
		
		int[] sortedArray = new int[arr.length];
		index = 0;
		for (List li : list) {
			for (Object num : li)
				sortedArray[index++] = (int) num;

		}
		System.out.println(Arrays.toString(sortedArray));

	}

}
