package com.muthukumarasamym.practice.dec14;

import java.util.Stack;

/*Evaluate Postfix Expression:
ssCreate a Java function to evaluate a given postfix expression. 
The expression is provided as a string, and the operators include '+', '-', '*', and '/'.
Use a stack to perform the evaluation.*/
public class Postfix {

	public static void main(String[] args) {

		String s = "12+3*";
		Postfix p = new Postfix();
		p.postFix(s.toCharArray());

	}

	private void postFix(char[] charArray) {

		Stack<Integer> stack = new Stack<>();
		for (char c : charArray) {
			if (Character.isDigit(c)) {
				stack.push(c - '0');
			} else {
				int operand1 = stack.pop();

				int operand2 = stack.pop();
				int result = findresult(operand1, operand2, c);
				stack.push(result);
			}
		}
		System.out.println("OUTPUT : " + stack.pop());
	}

	private int findresult(int operand1, int operand2, char c) {

		switch (c) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			return operand1 / operand2;
		default:
			throw new IllegalArgumentException("Invalid operator: " + c);
		}
	}

}
