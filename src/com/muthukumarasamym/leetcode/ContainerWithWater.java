package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class ContainerWithWater {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the Length");
		int n = mc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values");
		for (int i = 0; i < n; i++) {
			arr[i] = mc.nextInt();
		}
		System.out.println("The max area is : " + maxArea(arr));

	}

	public static int maxArea(int[] height) {

		int k = 0, l = height.length - 1, max = 0, area = 0;
		while (k < l) {
			if (height[k] < height[l]) {
				area = height[k] * (l - k);
				k++;
			} else {
				area = height[l] * (l - k);
				l--;
			}
			max = area > max ? area : max;
		}
		return max;
	}

}
