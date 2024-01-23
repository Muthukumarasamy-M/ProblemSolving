package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class ReplaceIp {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the element");
		String s = mc.next();
		System.out.println("Inbuilt->  " + method1(s));
		System.out.print("Ordinary-> "+method2(s));
	}

	private static String method2(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '.')
				str += s.charAt(i);
			else
				str += "[.]";
		}
		return str;
	}
	

	private static String method1(String s) {

		return s.replace(".", "[.]");

	}

}
