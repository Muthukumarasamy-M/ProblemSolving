package com.muthukumarasamym.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1, 2, 3 };
		int k = 2;
		ContainsDuplicate2 c = new ContainsDuplicate2();
		c.find(arr, k);

	}

	private boolean find(int[] nums, int k) {
		if (k == 0)
			return false;

		Map<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int integer = nums[i];
			if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k)
				return true;
			hashMap.put(integer, i);
		}
		return false;
	}
}
