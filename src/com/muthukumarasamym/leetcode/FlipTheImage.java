package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class FlipTheImage {

	public static void main(String[] args) {

		int[][] arr = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

		System.out.println(Arrays.deepToString(flipImage(arr)));

	}

	public static int[][] flipImage(int[][] image) {

		int n = image[0].length;

		for (int i = 0; i < n; i++) {
			int k = 0;
			for (int j = n - 1; j >= k; j--) {
				int temp = image[i][j];
				image[i][j] = image[i][k];
				image[i][k] = temp;
				k++;
			}
			for (int l = 0; l < n; l++) {
				if (image[i][l] == 0)
					image[i][l] = 1;
				else
					image[i][l] = 0;
			}
		}
		return image;
	}

}
