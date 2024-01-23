package com.muthukumarasamym.evaluation.L3Questionsjan20;

import java.util.Scanner;

public class RegularExpressionMatching02 {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.print("Enter the str : ");
		String str = mc.nextLine(); 
		System.out.print("Enter the pattern :");
		String pat = mc.nextLine();

		RegularExpressionMatching02 r = new RegularExpressionMatching02();
		System.out.println(r.find(str, pat) + "  ");

	}

	private boolean find(String str, String pat) {

		String s = "";
		for (int i = 0; i < pat.length(); i++) {

			if (pat.charAt(i) == '.' || (pat.charAt(i) == '*' && pat.charAt(i - 1) == '.'))
				s += str.charAt(i);
			else if (pat.charAt(i) == '*' && i != 0) {
				s += s.charAt(i - 1);
			} else
				s += pat.charAt(i);

		}
		System.out.println(s);
		if (s.contains(str))
			return true;
		return false;

	}

}
