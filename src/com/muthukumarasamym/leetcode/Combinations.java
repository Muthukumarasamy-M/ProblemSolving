package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {

		int k = 2;
		int n = 4;
		Combinations c = new Combinations();
		System.out.println(c.combine(n, k).toString());
	}

	public List<List<Integer>> combine(int n, int k) {

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		backtrack(list, li, 1, n, k);

		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> li, int start, int n, int k) {

		if (k == 0) {

			list.add(new ArrayList<>(li));
			return;
		}
		for (int i = start; i <= n; i++) {
			li.add(i);
			backtrack(list, li, i + 1, n, k - 1);
			li.remove(li.size() - 1);
		}
	}

}
