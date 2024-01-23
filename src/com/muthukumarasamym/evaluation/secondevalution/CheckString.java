package com.muthukumarasamym.evaluation.secondevalution;

import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the String1 ");
		String str1 = mc.next();
		System.out.println("Enter the String2 ");
		String str2 = mc.next();
		CheckString c = new CheckString();
		if (c.checkString(str1, str2))
			System.out.println("true " + str2 + " can be formed");
		else
			System.err.println("false " + str2 + " cannot be formed");
	}

	private boolean checkString(String str1, String str2) {

		int[] arr1 = checkFrequency(str1);
		int[] arr2 = checkFrequency(str2);
		for (int i = 0; i < 26; i++) {
			if (arr2[i] > arr1[i])
				return false;
		}
		return true;
	}

	private int[] checkFrequency(String str) {
		int[] arr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'A' && c <= 'Z')
				arr[c - 'A']++;
			else
				arr[c - 'a']++;
		}
		return arr;
	}

}
