package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class GoalParser {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = mc.nextLine();
		System.out.println(method1(s));
		System.out.println(method2(s));
	}

	private static String method2(String s) {
		
		return s.replace("()", "o").replace("(", "").replace(")", "").replace(" ", "");///only test case
	}

	private static String method1(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' && s.charAt(i + 1) == ')') {

				str += "o";
				i++;
			} else if (s.substring(i,i+1).matches("\\w+"))
					str += "" + s.charAt(i);

		}
		return str;

	}

}
