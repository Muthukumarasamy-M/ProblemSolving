package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7};
		int k=3;
		System.out.println(Arrays.toString(rotateArray(array, k)));

	}
	public static int[] swap(int []nums,int start,int end)
	{
		while(start<end)
		{
			int temp= nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			end--;
			start++;
		}
		return nums;	
	}
	
	public static int[] rotateArray(int[] nums,int k)
	{
		int n=nums.length;
		swap(nums,0,k-1);
		swap(nums,k,n-1);
		return swap(nums,0,n-1);
	}
}
