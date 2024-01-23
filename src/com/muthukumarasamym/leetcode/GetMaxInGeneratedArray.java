package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class GetMaxInGeneratedArray {

	public static void main(String[] args) {

		GetMaxInGeneratedArray g = new GetMaxInGeneratedArray();
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = mc.nextInt();
		System.out.println(g.getMaximumGenerated(n));
	}

	public int getMaximumGenerated(int n) {

		if(n<=1)
				return n;
		int arr[] = new int[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		int max=0;
		for (int i = 2; i <= n; i++) {
			if (i % 2 != 0) {
				arr[i] = arr[i / 2] + arr[(i / 2) + 1];
			} else
				arr[i] = arr[(i / 2)];
			max=max<arr[i]?arr[i]:max;
			System.out.println(arr[i]);

		}
		System.out.println(Arrays.toString(arr));
		return max;

	}
}
