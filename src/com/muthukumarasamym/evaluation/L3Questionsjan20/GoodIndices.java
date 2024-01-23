package com.muthukumarasamym.evaluation.L3Questionsjan20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GoodIndices {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		int arr[] = { 2, 1, 1, 2 };
		int k = 2;

		GoodIndices g = new GoodIndices();
		System.out.println(g.goodIndices(arr, k));

	}

	public List<Integer> goodIndices(int[] nums, int k) {

		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();

		for (int x : nums) {
			set.add(x);
		}

		for (int i = k; i < nums.length - k; i++) {
			if (set.size() == 1 || (isCorrect(nums, i, k, -1) && isCorrect(nums, i, k, 1))) {
				list.add(i);
			}
		}

		return list;
	}

	private boolean isCorrect(int[] nums, int i, int k, int direction) {
		for (int start = i + direction; start != i + k * direction; start += direction) {
			if (nums[start] > nums[start + direction]) {
				return false;
			}
		}
		return true;
	}

}
