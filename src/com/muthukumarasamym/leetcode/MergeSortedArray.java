package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

//		Scanner mc = new Scanner(System.in);
//		System.out.println("Enter the length of Array1");
//		int a = mc.nextInt();
//		System.out.println("Enter the length of Array2");
//		int b = mc.nextInt();
//		int[] array1 = new int[a];
//		int[] array2 = new int[b];
//		System.out.println("enter the values");
//		for (int i = 0; i < a; i++) {
//			if (i < a - b) {
//				array1[i] = mc.nextInt();
//			} else {
//				array2[i - b] = mc.nextInt();
//			}
//		}
//		System.out.println(Arrays.toString(array1));
//
//		System.out.println(Arrays.toString(array2))
		int array1[]= {1,2,4,0,0,0};
		int array2[]= {0,2,3};
		int a=3;
		int b=3;
		merge(array1, a, array2, b);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		        int i=m-1;
		        int j=n-1;
		        int k=m+n-1;
		        while(j>=0)
		        {
		            if(i>=0 && nums1[i]>nums2[j])
		            nums1[k--]=nums1[i--];
		            else
		            nums1[k--]=nums2[j--];
		        }
		        System.out.println(Arrays.toString(nums1));
		    }
}


	



