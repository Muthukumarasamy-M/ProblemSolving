package com.muthukumarasamym.evaluation.L3Questionsjan20;

import java.util.Arrays;

public class RainWaterTrapping {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		RainWaterTrapping r = new RainWaterTrapping();
		r.find(arr);

	}

	private int find(int[] arr) {

		int len = arr.length;

		int[] leftMax = new int[len];
		int[] rightMax = new int[len];

		int leftmax = -999, rightmax = -999, result = 0;

		for (int i = 0; i < len; i++) {

			if (leftmax < arr[i]) {
				leftmax = arr[i];
			}
			leftMax[i] = leftmax;

			if (rightmax < arr[len - 1 - i])
				rightmax = arr[len - 1 - i];

			rightMax[len - 1 - i] = rightmax;
		}
		for (int i = 0; i < arr.length; i++) {
			result += (Math.min(leftMax[i], rightMax[i]) - arr[i]);
		}

		return result;
	}

}
