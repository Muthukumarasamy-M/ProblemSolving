package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int array[] = {1,2,3,4,5,6,7};
		int k = 3;
		rotateArray(array, k);
		System.out.println(Arrays.toString(array));

	}

	public static void swap(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			end--;
			start++;
		}
	}

	public static void rotateArray(int[] nums, int k) {
		
		int n = nums.length;
		if(n<k)
			k=k%n;
		swap(nums,0,n-k-1);
		swap(nums,n-k,n-1);
		swap(nums,0,n-1);
	}
}
