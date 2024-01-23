package com.muthukumarasamym.leetcode;

public class ReverseStringInPlace {

	public static void main(String[] args) {

		char[] arr = { 'm', 'u', 't', 'h', 'u' };

		ReverseStringInPlace r = new ReverseStringInPlace();
		r.reverseString(arr);
	}

	public void reverseString(char[] s) {

		int start = 0, end = s.length - 1;
		while (start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
		System.out.println(s);

	}
}
