package com.muthukumarasamym.evaluation.L3Questionsjan20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NPalindromeSequence {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.print("Enter the string :");
		String str = mc.nextLine();

		NPalindromeSequence n = new NPalindromeSequence();
		Set<String> set = new HashSet<>();
		System.out.println(n.numOfPalindrome(str, new StringBuilder(), 0, 0, set));

	}

	private int numOfPalindrome(String str, StringBuilder string, int index, int n, Set<String> set) {

		String s = string.toString();
		if (s.equals(new StringBuilder(s).reverse().toString())) {
			set.add(s);
		}
		for (int i = index; i < str.length(); i++) {
			string.append(str.charAt(i));
			numOfPalindrome(str, string, i + 1, n, set);
			string.deleteCharAt(string.length() - 1);
		}
		if (set.size() > Integer.MAX_VALUE)
			return set.size() - 1 % 1000000007;
		else
			return set.size() - 1;
	}

}
