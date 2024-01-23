package com.muthukumarasamym.hackerank;

import java.util.*;

public class CountNumber {
	 public static int countKDifference(int[] nums, int k) {

	        int count=0;
	        for(int i=0;i<nums.length-1;i++)
	        {
	            for(int j=i;j<nums.length;j++)
	                if(Math.abs(nums[i]-nums[j])==k)
	                    count++;
	        }

	        return count;
	        }


	    
	public static void main(String[] args) {
		
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the length of list");
		int n = mc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i]=mc.nextInt();
		}

		System.out.println("num to check");
		int k=mc.nextInt();
		System.out.println(countKDifference(arr,k));
	}

}
