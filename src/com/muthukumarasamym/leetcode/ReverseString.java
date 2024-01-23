package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = mc.nextLine();

		System.out.println((reverseWords(string)));
	}

	private static String reverseWords(String string) {
		String a[] = string.split("\\s+");
		String str = "";
		for (int i = a.length - 1; i >= 0; i--) {
			str += a[i] + " ";
		}
		return str.trim();

	}

}
