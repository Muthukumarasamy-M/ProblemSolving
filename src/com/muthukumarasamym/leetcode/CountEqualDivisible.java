package com.muthukumarasamym.leetcode;

import java.util.*;

public class CountEqualDivisible {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		System.out.println("enter the length of array");
		int n=mc.nextInt();
		int []a=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
			a[i]=mc.nextInt();
		System.out.println("enter the divisible number");
		int d= mc.nextInt();
		System.out.println("the output is "+countEqualPairs(a,d));
	}

	private static int countEqualPairs(int[] nums, int k) {
		int count=0;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				
				if(nums[i]==nums[j] && (i*j) % k==0)
				{
                   count++; 
                }
			}
		}
		
		return count;
		
	}

}
