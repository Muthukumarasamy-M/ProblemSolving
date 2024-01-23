package com.muthukumarasamym.leetcode;

public class ReverseBits {

	public static void main(String[] args) {
		int n = 0B00000010100101000001111010011100;

		System.out.println(reverseBits(n));
	}

	public static int reverseBits(int n) {

		String str = Integer.toBinaryString(n);
		String s = (new StringBuilder(str).reverse()).toString();
		return Integer.parseInt(s, 2);
	}

}
