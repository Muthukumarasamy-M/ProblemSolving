package com.muthukumarasamym.practice.dec14;

import java.util.ArrayList;
import java.util.List;

public class Parenthesis {

	public static void main(String[] args) {

		int n = 3;
		Parenthesis p = new Parenthesis();
		p.helper(n);
	}

	private void helper(int n) {

		List<String> list = new ArrayList<>();
		generateParenthesis(n, 0, 0, new StringBuilder(), list);
		System.out.println(list);
	}

	private void generateParenthesis(int n, int i, int j, StringBuilder string, List<String> list) {

		if (string.length() == 2 * n) {
			System.out.println(string);
			list.add(string.toString());
			return;
		}
		if (i < n) {
			string.append("(");
			generateParenthesis(n, i + 1, j, string, list);
			string.deleteCharAt(string.length() - 1);

		}
		if (j < i) {
			string.append(")");
			generateParenthesis(n, i, j + 1, string, list);
			string.deleteCharAt(string.length() - 1);
		}
	}

}
