package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permute {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3 };
		Permute p = new Permute();
		p.permute(arr);

	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();

		permuteArray(nums, list, 0);
		System.out.println(list);
		return list;
	}

	private void permuteArray(int[] nums, List<List<Integer>> list, int index) {

		List<Integer>cur = toIntegerList(nums);
		
		if(!list.contains(cur))
			list.add(cur);

		for (int i = index; i < nums.length; i++) {
			swap(nums, i, index);
			permuteArray(nums, list, index + 1);
		}
	}

	private List<Integer> toIntegerList(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i : nums) {
			list.add(i);
		}
		return list;
	}

	private void swap(int[] nums, int i, int index) {

		int temp = nums[i];
		nums[i] = nums[index];
		nums[index] = temp;

	}

}
