package com.muthukumarasamym.leetcode;

public class MinimumOneBitOperations {

	public static void main(String[] args) {

		MinimumOneBitOperations m = new MinimumOneBitOperations();

		System.out.println(m.minimumOneBitOperations(9));
	}

	public int minimumOneBitOperations(int n) {

		int div = n / 2, value = n;
		while (div != 0) {
			value = value ^ div;
			div /= 2;
		}
		return value;

	}

}
