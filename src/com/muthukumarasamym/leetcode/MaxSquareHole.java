package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class MaxSquareHole {

	public static void main(String[] args) {

		int hbars[] = { 3, 2 };
		int vbars[] = { 4, 2 };

		new MaxSquareHole().maximizeSquareHoleArea(2, 4, hbars, vbars);

	}

	public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {

		int maxArea = 0;
		int i = 0, j = 0;
		int len = hBars.length, len2 = vBars.length;
		while (i < len && j < len2) {
			if (hBars[i] == vBars[j]) {

				maxArea = Math.max(maxArea, hBars[i] * vBars[j]);
				i++;
				j++;
			} else if (len > len2) {
				i++;
			} else if (len == len2) {
				i++;
				j++;
			} else
				j++;
		}
		return maxArea;

	}
}
