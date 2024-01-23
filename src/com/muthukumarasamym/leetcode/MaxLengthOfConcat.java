package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MaxLengthOfConcat {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		List<String> arr = Arrays.asList("abcdefghijklm", "bcdefghijklmn", "cdefghijklmno", "defghijklmnop",
				"efghijklmnopq", "fghijklmnopqr", "ghijklmnopqrs", "hijklmnopqrst", "ijklmnopqrstu", "jklmnopqrstuv",
				"klmnopqrstuvw", "lmnopqrstuvwx", "mnopqrstuvwxy", "nopqrstuvwxyz", "opqrstuvwxyza", "pqrstuvwxyzab");

		MaxLengthOfConcat m = new MaxLengthOfConcat();

		System.out.println("answer " + m.maxLength(arr) + "  ");

	}

	public int maxLength(List<String> arr) {

		return findMaxLength(arr, new StringBuilder(), 0);
	}

	private int findMaxLength(List<String> arr, StringBuilder current, int index) {

		if (!isUnique(current.toString())) {
			return 0;
		}

		int maxLength = current.length();

		for (int i = index; i < arr.size(); i++) {
			
			current.append(arr.get(i));
			
			maxLength = Math.max(maxLength, findMaxLength(arr, current, i + 1));
			current.delete(current.length() - arr.get(i).length(), current.length());
		
		}

		return maxLength;
	}

	private boolean isUnique(String s) {

		boolean b[] = new boolean[26];
		for (char c : s.toCharArray()) {
			int index = c - 'a';
			if (b[index])
				return false;
			b[index] = true;
		}
		return true;

	}
}

