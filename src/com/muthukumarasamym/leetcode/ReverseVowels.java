package com.muthukumarasamym.leetcode;

public class ReverseVowels {

	public static void main(String[] args) {

		String s = "Hello";

		ReverseVowels r = new ReverseVowels();
		r.reverseVowels(s);
	}

	public String reverseVowels(String s) {
		char[] chars = s.toCharArray();
		int start = 0, end = s.length() - 1;

		while (start < end) {
			if (isVowel(chars[start]) && isVowel(chars[end])) {

				char temp = chars[start];
				chars[start] = chars[end];
				chars[end] = temp;
				start++;
				end--;
			} else {
				
				if (!isVowel(chars[start])) {
					start++;
				}
				if (!isVowel(chars[end])) {
					end--;
				}
			}
		}

		return new String(chars);
	}

	private static boolean isVowel(char c) {
		return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
	}
}
