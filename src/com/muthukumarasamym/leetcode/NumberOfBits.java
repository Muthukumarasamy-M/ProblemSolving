package com.muthukumarasamym.leetcode;

public class NumberOfBits {

	public static void main(String[] args) {

		int n = 0b1101001;

		System.out.println(hammingWeight(n) + " inbuilt");
		System.out.println(hammingWeight1(n));
	}

	public static int hammingWeight(int n) {

		return Integer.bitCount(n);
	}

	public static int hammingWeight1(int n) {

		int count = 0;

		while (n != 0) {
				count+=(n & 1);
			n = n >> 1;

		}
		return count;
	}

}
