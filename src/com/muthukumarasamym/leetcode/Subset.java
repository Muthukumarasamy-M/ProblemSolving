package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };

		Subset s = new Subset();
		System.out.println(s.subsets(arr));
	}

	public List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		findSubset(list, li, 0, nums);
		return list;
	}

	private void findSubset(List<List<Integer>> list, List<Integer> li, int start, int[] nums) {

		list.add(new ArrayList<>(li));
		for (int i = start; i < nums.length; i++) {
			li.add(nums[i]);
			findSubset(list, li, i + 1, nums);
			li.remove(li.size() - 1);
		}
	}
}
