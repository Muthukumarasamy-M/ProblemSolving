package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarray {
	
	public static void main(String[] args) {
		
		
		int []nums = {4,6,5,9,3,7};
		int l[] = {0,0,2};
		int r[] = {2,3,5};
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
		int diff=Math.abs(array[0]-array[1]);
		for(int i=1;i<array.length-1;i++)
		{
			if(diff!=Math.abs(array[i]-array[i+1]))
				return false;
		}
		return true;
	}
}
