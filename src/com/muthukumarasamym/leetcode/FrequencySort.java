package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencySort {

	public static void main(String[] args) {

		String s = "tree";
		FrequencySort f = new FrequencySort();
		System.out.println(f.frequencySort(s));
	}

	public String frequencySort(String s) {

		Map<Character, Integer> map = new HashMap<>();

		for (char c : s.toCharArray()) {

			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		List<Map.Entry<Character, Integer>> uni = new ArrayList<>(map.entrySet());
		uni.sort((a, b) -> b.getValue() - a.getValue());

		StringBuilder str = new StringBuilder();
		for (Map.Entry<Character, Integer> mp : uni) {

			str.append(String.valueOf(mp.getKey()).repeat(mp.getValue()));
		}
		return str.toString();

	}
}
