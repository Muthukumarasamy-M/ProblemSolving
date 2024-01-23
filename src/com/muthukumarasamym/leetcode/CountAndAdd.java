package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class CountAndAdd {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = mc.nextInt();

		CountAndAdd c = new CountAndAdd();
		System.out.println(c.countAndSay(n));
	}

	public String countAndSay(int n) {

		String s = "1";
		for (int i = 2; i <= n; i++) {

			s = countAndAdd(s);
			System.out.println(s);
		}
		return s;
	}

	private String countAndAdd(String s) {

		StringBuilder str = new StringBuilder();
		char c = s.charAt(0);
		int count = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != c) {
				str.append(count).append(c);
				c = s.charAt(i);
				count = 1;
			}
			else {
				count++;
			}
		}
		str.append(count);
		str.append(c);

		return str.toString();
	}

}
