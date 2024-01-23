package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Merge2DArray {

	public static void main(String[] args) {
		int items1[][] = { { 1, 2 }, { 2, 3 }, { 4, 5 } };
		int items2[][] = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
		System.out.println(Arrays.deepToString(mergeSimilarItems(items1, items2)));
	}

	private static int[][] mergeSimilarItems(int[][] items1, int[][] items2) {

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int[] i : items1)
			map.put(i[0], i[1]);

		for (int[] i : items2)
			map.put(i[0], i[1] + map.getOrDefault(i[0], 0));
		int arr[][] = new int[map.size()][2];
		int i = 0;
		for (Map.Entry<Integer, Integer> k : map.entrySet()) {
			arr[i][0] = k.getKey();
			arr[i][1] = k.getValue();
			i++;
		}

		return arr;

	}

}
