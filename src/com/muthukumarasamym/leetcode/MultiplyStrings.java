package com.muthukumarasamym.leetcode;

public class MultiplyStrings {

	public static void main(String[] args) {
		String num1 = "21";
		String num2 = "123456789";
		MultiplyStrings m = new MultiplyStrings();
		System.out.println(m.multiply(num1, num2));
	}

	public String multiply(String num1, String num2) {

		int newsum = 0, pi = 0, cursum = 0;

		for (int i = num1.length() - 1; i >= 0; i--) {

			int a = num1.charAt(i) - '0', p = 0;
			cursum = 0;
			for (int j = num2.length() - 1; j >= 0; j--) {

				int b = num2.charAt(j) - '0';
				cursum = (a * b) * (int) Math.pow(10, p++) + cursum;

			}
			newsum = (cursum * (int) Math.pow(10, pi)) + newsum;
			pi++;

		}
		return Integer.toString(newsum);

	}

}
