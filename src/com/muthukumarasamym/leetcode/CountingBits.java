package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class CountingBits {

	public static void main(String[] args) {

		int n = 10;
		CountingBits c = new CountingBits();
		System.out.println(Arrays.toString(c.countBits(n)));
		System.out.println(Arrays.toString(c.countBits1(n)));

	}

	public int[] countBits(int n) {
		int[] arr = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			arr[i] = Integer.bitCount(i);

		}
		return arr;
	}
	public int[] countBits1(int n) {
		int[] arr = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			System.out.print((i>>1)+" ");
			arr[i] = arr[i>>1] +(i&1);

		}
		return arr;
	}

}
