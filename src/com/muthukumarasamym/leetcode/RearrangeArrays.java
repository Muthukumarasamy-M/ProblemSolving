package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrays extends ArrayList {

	public static void main(String[] args) {

		int arr[] = { 3, 1, -2, -5, 2, -4 };

		RearrangeArrays r = new RearrangeArrays();
		ArrayList<Integer> arra = new ArrayList<>();
		r.add(1);
		r.add(1);
		r.add(1);
		r.add(1);
		r.add(1);
		r.add(1);
		r.add(1);
		r.add(1);
		r.add(1);
		r.add(1);
		r.add(1);
		r.add(1);
		
		
		r.removeRange( 3, 9);
		System.out.println(r);
		System.out.println(Arrays.toString(r.rearrangeArray2(arr)));
	}

	public int[] rearrangeArray(int[] nums) {

		List<Integer> pos = new ArrayList<>();
		List<Integer> neg = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0)
				neg.add(nums[i]);
			else
				pos.add(nums[i]);
		}
		int index = 0;
		for (int i = 0; i < nums.length; i += 2) {
			nums[i] = pos.get(index);
			nums[i + 1] = neg.get(index);
			index++;
		}
		return nums;
	}

	public int[] rearrangeArray2(int[] nums) {

d

	}

}