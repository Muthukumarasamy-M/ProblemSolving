package com.muthukumarasamym.leetcode;

public class ValidPalindrome {

	public static void main(String[] args) {

		String s = "P0";

		ValidPalindrome v = new ValidPalindrome();
		System.out.println(v.isPalindrome(s));
	}

	public boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) || Character.isAlphabetic(c))
				sb.append(c);
		}
		return sb.toString().equalsIgnoreCase((sb.reverse().toString()));

	}

}
