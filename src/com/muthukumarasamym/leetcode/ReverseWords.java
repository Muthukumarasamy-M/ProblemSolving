package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class ReverseWords{

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = mc.nextLine();
		System.out.println(method1(s));

	}

	private static String method1(String s) {
		String[] str = s.split("\\s+");
		String y = "";
		for (int i = 0; i < str.length; i++) {
			StringBuilder sb = new StringBuilder(str[i]);

			y = y + sb.reverse().toString() + " ";

		}

		return y;

	}

}
