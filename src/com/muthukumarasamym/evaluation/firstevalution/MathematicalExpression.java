package com.muthukumarasamym.evaluation.firstevalution;

import java.util.*;

public class MathematicalExpression {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Input :");
		String s = mc.next();
		expressionChecking(s);

	}

	private static void expressionChecking(String s) {
		String operators = "+/*-%=";
		int parentheses = 0, count = 0;
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);

			if (Character.isLetter(current)) {
				count++;
				continue;
			} else
				count = 0;

			if (current == ')')
				parentheses++;
			else if (current == '(')
				parentheses--;

			if (operators.indexOf(current) >= 0 && i < s.length() - 1) {
				if (Character.isLetterOrDigit(s.charAt(i - 1)) && Character.isLetterOrDigit(s.charAt(i + 1))) {
					continue;
				} else
					count = 999;
			} else if (operators.indexOf(current) >= 0 && i == s.length() - 1) {
				count = 999;
			}
		}

		if (count == 0 && parentheses == 0)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
