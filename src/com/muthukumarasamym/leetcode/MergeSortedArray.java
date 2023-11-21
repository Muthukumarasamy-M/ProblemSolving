package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the length of Array1");
		int a = mc.nextInt();
		System.out.println("Enter the length of Array2");
		int b = mc.nextInt();
		int[] array1 = new int[a];
		int[] array2 = new int[b];
		System.out.println("enter the values");
		for (int i = 0; i < a; i++) {
			if (i < a - b) {
				array1[i] = mc.nextInt();
			} else {
				array2[i - b] = mc.nextInt();
			}
		}
		System.out.println(Arrays.toString(array1));

		System.out.println(Arrays.toString(array2));
		merge(array1, a, array2, b);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i=0,j=0;
		while(i<m-1)
		{
			if(nums[i]>nums[j])
			{
				
			}
		}
		
	}

}
