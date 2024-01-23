package com.muthukumarasamym.leetcode;

import java.util.*;

public class DiffernenceInTwoArrays {

	public static void main(String[] args) {
		
		int nums1[]= {1,2,4};
		int nums2[]= {2,3,5};
		System.out.println(findDiffernceInArray(nums1,nums2).toString());
	}

	private static List<List<Integer>> findDiffernceInArray(int[] nums1, int[] nums2) {
		
		
		List<Integer>list1= Arrays.stream(nums1).boxed().toList();
		List<Integer>list2= Arrays.stream(nums2).boxed().toList();
		
		List<Integer> list3 = new ArrayList<>();
		List<Integer> list4 = new ArrayList<>();
		for(int i=0;i<nums1.length;i++)
		{
			if(!list2.contains(nums1[i]))
				list3.add(nums1[i]);
		}
		for(int i=0;i<nums2.length;i++)
		{
			if(!list1.contains(nums2[i]))
				list4.add(nums2[i]);
		}
		
		return  Arrays.asList(list3,list4);
	}

}
