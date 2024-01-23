package com.muthukumarasamym.leetcode;

public class IsSubsequence {

	public static void main(String[] args) {
		String str = "abc";
		String t = "ajhbbokcc";
		IsSubsequence s = new IsSubsequence();
		System.out.println(s.isSubsequence(str, t));
	}

	public boolean isSubsequence(String s, String t) {

		int index = 0;
		for (int i = 0; index < s.length() & i < t.length(); i++) {

			System.out.println(t.charAt(i) + " " + s.charAt(index));
			if (t.charAt(i) == s.charAt(index)) {
				index++;
			}
		}
		return index == s.length();

	}
}
