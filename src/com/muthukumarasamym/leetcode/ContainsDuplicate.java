package com.muthukumarasamym.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 4, 2, 3, 4 };

		ContainsDuplicate c = new ContainsDuplicate();
		c.find(arr);

	}

	private boolean find(int[] arr) {

		Set<Integer> set = new HashSet<>();
		for (int i : arr) {
			if (!set.add(i))
				return false;
		}
		return true;
	}

}
