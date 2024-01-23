package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class KnightsDialer {

	public static void main(String[] args) {
		int n = 3131;
		KnightsDialer k = new KnightsDialer();
		System.out.println(k.knightDialer(n));

	}

	public int knightDialer(int n) {

		int mod = 1000000007;
		long curArray[] = new long[10];
		Arrays.fill(curArray, 1);
		for (int i = 2; i <= n; i++) {
			long newArray[] = new long[10];
			newArray[0] = (curArray[4] + curArray[6]) % mod;
			newArray[1] = (curArray[8] + curArray[6]) % mod;
			newArray[2] = (curArray[7] + curArray[9]) % mod;
			newArray[3] = (curArray[4] + curArray[8]) % mod;
			newArray[4] = (curArray[0] + curArray[3] + curArray[9]) % mod;
			newArray[5] = 0;
			newArray[6] = (curArray[0] + curArray[1] + curArray[7]) % mod;
			newArray[7] = (curArray[2] + curArray[6]) % mod;
			newArray[8] = (curArray[1] + curArray[3]) % mod;
			newArray[9] = (curArray[4] + curArray[2]) % mod;

			curArray = newArray;

		}
		long sum = 0;
		for (long i : curArray)
			sum = ((sum + i) % mod);
		return (int) sum;

	}

}
