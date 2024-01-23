package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class CountSortedVowels {

	public static void main(String[] args) {
		int n = 1;
		CountSortedVowels c = new CountSortedVowels();
		System.out.println(c.countVowelStrings(n));
	}

	public int countVowelStrings(int n) {

		if (n == 0)
			return 0;
		int arr[] = new int[5];
		Arrays.fill(arr, 1);
		for (int i = 2; i <= n; i++) {
			for (int j = 3; j >= 0; j--)
				arr[j] += arr[j + 1];

		}
		int sum = 0;
		for (int i : arr)
			sum += i;

		return sum;

	}

}
