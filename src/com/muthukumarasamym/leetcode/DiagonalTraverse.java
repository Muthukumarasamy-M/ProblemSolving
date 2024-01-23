package com.muthukumarasamym.leetcode;

import java.util.*;

public class DiagonalTraverse {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>(
				List.of(List.of(1, 2, 3, 4, 5), List.of(5, 6, 7), List.of(9, 10, 11, 12)));

		System.out.println(Arrays.toString(findDiagonalOrder(list)));

	}

	public static int[] findDiagonalOrder(List<List<Integer>> nums) {

		int size = 0;
		Map<Integer, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < nums.size(); i++) {
			for (int j = 0; j < nums.get(i).size(); j++) {
				int n = nums.get(i).get(j);
				map.putIfAbsent(i + j, new ArrayList<>());
				map.get(i + j).add(n);
				size++;
			}

		}
		int[] allValues = new int[size];
		int key = 0, index = 0;
		while (map.containsKey(key)) {
			List<Integer> li = map.get(key);
			for (int i = li.size() - 1; i >= 0; i--) {
				allValues[index++] = li.get(i);
			}
			key++;

		}
		return allValues;
	}

}
