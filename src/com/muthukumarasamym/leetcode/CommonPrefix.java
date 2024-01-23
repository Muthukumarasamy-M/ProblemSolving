package com.muthukumarasamym.leetcode;

import java.util.*;

public class CommonPrefix {

	static Scanner mc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter the no of strings");
		int n = mc.nextInt();
		System.out.println("enter the values");
		String s[] = getValues(n);

		System.out.println(longestCommonPrefix(s));
		System.out.println(longestCommonPrefix2(s));

	}

	private static String longestCommonPrefix2(String[] s) {
		String str="";
		return str;
		
	}

	private static String[] getValues(int n) {

		String a[] = new String[n];
		for (int i = 0; i < n; i++)
			a[i] = mc.next();

		return a;
	}

	public static String longestCommonPrefix(String[] s) {

		String str = "";
		
		for (int i = 0; i <s[0].length(); i++) {
			int k = 0;
			char c= s[0].charAt(i);
			for (int j = 0; j < s.length; j++) {
				if (s[j].charAt(i)==c)
					k++;
			}
			if (k == s.length) {
				str +=""+c;
				break;
			}
		}
		return str;

	}

}
