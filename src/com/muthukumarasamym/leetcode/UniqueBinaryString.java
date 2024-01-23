package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class UniqueBinaryString {

	public static void main(String[] args) {
		String s[] = { "01", "00" };
		System.out.println(findDifferentBinaryString(s));
		String name="Rama";
		System.out.println("hello".indexOf(5));

	}

	public static String findDifferentBinaryString(String[] nums) {
		
		int n = nums[0].length();
		String k = Arrays.toString(nums);
		int total = (int) Math.pow(2, n);
		for (int i = 0; i < total; i++) {
			String s = Integer.toBinaryString(i);

			while (s.length() < n)
				s = "0" + s;

			if (k.contains(s) == false)
				return s;
		}
		return null;

	}

}
