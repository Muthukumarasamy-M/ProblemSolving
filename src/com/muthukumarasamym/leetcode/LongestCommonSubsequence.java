package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class LongestCommonSubsequence {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		String s1 = "oxcpqrsvwf";
		String s2 = "shmtulqrypy";

		LongestCommonSubsequence l = new LongestCommonSubsequence();
		System.out.println(l.longestCommonSubsequence(s1, s2));
	}

	public int longestCommonSubsequence(String text1, String text2) {
		int m = text1.length();
		int n = text2.length();

		int[][] dp = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}

			}
		}
		return dp[m][n];
	}

}
