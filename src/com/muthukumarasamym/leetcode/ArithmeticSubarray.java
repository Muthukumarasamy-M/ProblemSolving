package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarray {
	
	public static void main(String[] args) {
		
		
		int []nums = {4,1,3,5,2};
		int l[] = {0};
		int r[] = {1};
		System.out.println(checkArithmeticSubarrays(nums,l,r));
		
	}
	public  static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<l.length;i++)
        {
        	int subarray[]= Arrays.copyOfRange(nums, l[i], r[i]+1);
        	list.add(checkArray(subarray));
        }
		return list;
    }
	public static boolean checkArray(int []array)
	{
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int diff=Math.abs(array[0]-array[1]);
		for(int i=1;i<array.length-1;i++)
		{
			if(diff!=Math.abs(array[i]-array[i+1]))
				return false;
		}
		return true;
	}
}
