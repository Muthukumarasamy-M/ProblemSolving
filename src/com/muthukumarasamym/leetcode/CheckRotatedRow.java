package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CheckRotatedRow {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 4, 3, 1, 2 }, { 3, 4, 1, 2 }, { 2, 3, 4, 1 } };

		CheckRotatedRow c = new CheckRotatedRow();
		System.out.println(c.find(arr));
	}

	private boolean find(int[][] arr) {

		List<Integer> prelist = new ArrayList<>();

		for (int array[] : arr) {
			List<Integer> curlist = new ArrayList<>();
				
			
			for (int j = 0; j < array.length; j++) {

				if (!prelist.isEmpty() && j + 1 < array.length) {

					if (!prelist.contains(array[j]))
						return false;
					else {
						int curIndex = prelist.indexOf(array[j]);
						int nextIndex = prelist.indexOf(array[j + 1]);

						if (curIndex == array.length - 1) {
							if (nextIndex != 0)
								return false;
						} else if (nextIndex != (curIndex + 1)) {
							return false;
						}
					}
				}
				curlist.add(array[j]);
			}

			prelist = curlist;

		}
		return true;

	}
}
