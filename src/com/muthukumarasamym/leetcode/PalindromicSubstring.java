package com.muthukumarasamym.leetcode;

public class PalindromicSubstring {

	public static void main(String[] args) {

		String s = "abc";

		PalindromicSubstring p = new PalindromicSubstring();
		System.out.println(p.countSubstrings(s));

	}

	public int countSubstrings(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str = s.substring(i, j);
				if (str.equals(reverse(str)))
					count++;
			}
		}
		return count;
	}

	private String reverse(String str) {

		if (str.length() == 1)
			return str;
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s;
	}

}
