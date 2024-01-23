package com.muthukumarasamym.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SameOccurences {

	public static void main(String[] args) {

		int[] arr = { 1, 2 };
		SameOccurences s = new SameOccurences();
		System.out.println(s.find(arr));

	}

	private boolean find(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int count : map.values()) {
			if (!set.add(count)) {
				return false;
			}
		}
		return true;
	}

}
