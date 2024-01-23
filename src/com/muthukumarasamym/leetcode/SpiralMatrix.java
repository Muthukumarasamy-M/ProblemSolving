package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 3, 4, 5, 6 } };
		SpiralMatrix s = new SpiralMatrix();
		System.out.println(s.spiralOrder(arr));

	}

	public List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> list = new ArrayList<>();

		int top = 0, bottom = matrix.length - 1, right = matrix[0].length - 1, left = 0;
		while (top <= bottom && left <= right) {

			for (int i = top; i <= right; i++)
				list.add(matrix[top][i]);
			top++;

			for (int i = top; i <= bottom; i++)
				list.add(matrix[i][right]);
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--)
					list.add(matrix[bottom][i]);
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--)
					list.add(matrix[i][left]);
				left++;
			}
		}
		return list;

	}

}
