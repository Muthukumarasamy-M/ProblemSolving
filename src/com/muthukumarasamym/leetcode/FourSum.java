package com.muthukumarasamym.leetcode;

import java.util.*;

public class FourSum {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		// System.out.println("Enter the length of Array");
		// int n = mc.nextInt();
		int nums[] = { -1, 0, 1, 0, -2, 2 };
		/*
		 * System.out.println("Enter the values"); for (int i = 0; i < n; i++) { nums[i]
		 * = mc.nextInt();
		 * 
		 * }
		 */
		System.out.println("Enter the target");
		int target = mc.nextInt();
		System.out.println(Arrays.deepToString((fourSum(nums, target)).toArray()));
	}

	private static List<List<Integer>> fourSum(int[] nums, int target) {

		Set<List<Integer>> set = new LinkedHashSet<List<Integer>>();
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		List<List<Integer>> list = new ArrayList<>();
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			int j = i + 1, k = n - 1, l = j + 1;
			while (j < k) {
				l = j + 1;
				k = n - 1;
				while (l < k) {
					int sum = nums[i] + nums[j] + nums[l] + nums[k];
					if (sum == target) {
						System.out.println(nums[i] + " " + nums[j] + " " + nums[l] + " " + nums[k] + "icufutf");
						set.add(Arrays.asList(nums[i], nums[j], nums[l], nums[k]));
						l++;
						k--;
					} else if (sum < target)
						l++;
					else
						k--;
				}
				j++;
			}
		}
		list.addAll(set);
		return list;
	}
}
