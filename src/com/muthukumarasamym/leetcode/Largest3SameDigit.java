package com.muthukumarasamym.leetcode;

public class Largest3SameDigit {

	public static void main(String[] args) {

		String num = "111222333444555666777";
		Largest3SameDigit l = new Largest3SameDigit();
		System.out.println(l.largestGoodInteger(num));
		System.out.println(l.largestGoodInteger1(num));

	}

	public String largestGoodInteger(String num) {
		int max = 0;
		String arr[] = { "000", "111", "222", "333", "444", "555", "666", "777", "888", "999" };
		for (int i = arr.length - 1; i >= 0; i--) {
			if (num.indexOf(arr[i]) >= 0)
				return arr[i];
		}
		return "";
	}

	public String largestGoodInteger1(String num) {

		int max = -1;
		int index = -1;
		for (int i = 0; i < num.length() - 2; i++) {
			char c = num.charAt(i);
			if (c == num.charAt(i + 1) && c == num.charAt(i + 2)) {
				int temp = c - '0';
				if (max < temp) {
					max = temp;
					index = i;
				}
				i += 2;
			}
		}
		return (index == -1) ? "" : num.substring(index, index + 3);
	}

}
