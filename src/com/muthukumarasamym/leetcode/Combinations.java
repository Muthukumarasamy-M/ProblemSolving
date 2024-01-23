package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {

		int k = 4;
		int n = 4;
		Combinations c = new Combinations();
		System.out.println(c.combine(n, k).toString());
	}

	public List<Integer> combine(int n, int k) {

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		return list;
	}

}
