package com.muthukumarasamym.evaluation.L3Questionsjan20;

import java.util.Scanner;

public class LongestSubString {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.print("Enter the string :");
		String str = mc.nextLine();

		LongestSubString l = new LongestSubString();

		System.out.println(l.longestPalidrome(str));
	}

	private String longestPalidrome(String str) {

		if (str.length() <= 1)
			return str;

		int maxlen = 1;
		String maxstr = str.substring(0, 1);
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= str.length(); j++) {
				
				if (j - i > maxlen && ispalindrome(str.substring(i, j))) {
					maxlen = j - i;
					maxstr = str.substring(i, j);
				}
			}
		}

		return maxstr;
	}

	private boolean ispalindrome(String sub) {

		int left = 0;
		int right = sub.length() - 1;
		while (left < right) {
			if (sub.charAt(left) != sub.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

}
