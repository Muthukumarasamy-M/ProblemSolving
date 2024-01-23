package com.muthukumarasamym.leetcode;

import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n = mc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values");
		for (int i = 0; i < n; i++) {
			arr[i] = mc.nextInt();

		}
		System.out.println(Arrays.deepToString((threeSum(arr)).toArray()));
	}

	public static List<List<Integer>> threeSum(int[] nums) {

		int n = nums.length,target=0;
		Arrays.sort(nums);
		Set<List<Integer>> set = new HashSet<>();
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int k = i + 1, l = n - 1;
			while (k < l) {
				int sum = nums[i] + nums[k] + nums[l];
				if (sum == target) {
					set.add(Arrays.asList(nums[i], nums[k], nums[l]));
					k++;
					l--;
				} else if (sum < target)
					k++;
				else
					l--;

			}
		}
		list.addAll(set);
		return list;
	}
}
