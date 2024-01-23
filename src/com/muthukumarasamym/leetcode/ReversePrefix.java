package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class ReversePrefix {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string = mc.next();
		System.out.println("Enter the Character");
		char c = mc.next().charAt(0);

		System.out.println(reversePrefix(string, c));

	}

	public static String reversePrefix(String word, char ch) {
		int n = word.indexOf(ch);

		StringBuffer sb = new StringBuffer(word.substring(0, n + 1));

		return sb.reverse().toString() + word.substring(n + 1);

	}

}
