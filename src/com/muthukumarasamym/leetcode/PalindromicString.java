package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class PalindromicString {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the number of Strings");
		int n = mc.nextInt();
		System.out.println("Enter the values");
		String arr[] = new String[n];
		for (int i = 0; i < n; i++)
			arr[i] = mc.next();
		System.out.println(firstPalindrom(arr));

	}

	public static String firstPalindrom(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase(new StringBuffer(arr[i]).reverse().toString())) {
				return arr[i];
			}
		}
		return "";

	}

}