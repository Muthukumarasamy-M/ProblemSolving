package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		Subsets s = new Subsets();
		System.out.println(s.subsets(arr));

	}

	private List<List<Integer>> subsets(int[] arr) {

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			List<Integer> a = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				a.add(arr[j]);
			}
			list.add(a);
		}

		return list;
	}

}
