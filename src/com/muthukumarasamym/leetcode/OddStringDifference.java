package com.muthukumarasamym.leetcode;

import java.util.*;

public class OddStringDifference {

	public static void main(String[] args) {

		String[] words = { "aaa", "bob", "ccc", "ddd" };
		System.out.println(oddString(words));
	}

	public static String oddString(String[] words) {

		Map<List<Integer>, Integer> map = new HashMap<>();

		for (int j = 0; j < words.length; j++) {
			List<Integer> k = new ArrayList<>();
			
			for (int i = 1; i < words[j].length(); i++) {
				String s = words[j];
				k.add(s.charAt(i) - s.charAt(i - 1));

			}
			map.put(k, map.getOrDefault(k, j) + 100);
		}
		for (Map.Entry<List<Integer>, Integer> k : map.entrySet()) {
			
			if(k.getValue()<words.length+100)
				return words[k.getValue()-100];
		}
		return null;
		}
}