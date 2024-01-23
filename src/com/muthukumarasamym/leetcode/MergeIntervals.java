package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {

		int arr[][] = { { 1, 4 }, { 0, 2 }, { 3, 5 }, { 15, 20 } };
		MergeIntervals m = new MergeIntervals();
		System.out.println(Arrays.deepToString((m.merge(arr))));
	}

	public int[][] merge(int[][] arr) {

		List<Integer> a = new ArrayList<>();
		Arrays.sort(arr, (c, b) -> Integer.compare(c[0], b[0]));
		a.add(arr[0][0]);
		a.add(arr[0][1]);
		System.out.println(a.get(a.size() - 1) );
		for (int i = 1; i < arr.length; i++) {
			if (a.get(a.size() - 1) < arr[i][0]) {
				a.add(arr[i][0]);
				a.add(arr[i][1]);
			} else if (a.get(a.size() - 1) < arr[i][1]) {
				a.set(a.size() - 1, arr[i][1]);
			}
		}
		int ans[][] = new int[a.size() / 2][2];
		int k = 0;
		for (int i = 0; i < ans.length; i++) {
			ans[i][0] = a.get(k++);
			ans[i][1] = a.get(k++);
		}
		return ans;
	}
}
