package com.muthukumarasamym.leetcode;

public class MyAtoi {

	public static void main(String[] args) {
		String s = "   -4019 with words";
		MyAtoi m = new MyAtoi();
		System.out.println(m.myAtoi(s));
		System.out.println("\u20B9");
	}

	private int myAtoi(String s) {
		boolean neg = false;
		String num = "";
		for (char c : s.toCharArray()) {
			if (c == '-')
				neg = true;
			if (Character.isDigit(c))
				num += c;

		}
		if (neg)
			return -1 * (Integer.parseInt(num));
		else
			return Integer.parseInt(num);

	}

}
