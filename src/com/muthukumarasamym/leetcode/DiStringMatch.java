package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class DiStringMatch {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = mc.next();

		System.out.println(Arrays.toString(diStringMatch(str)));

	}

	public static int[] diStringMatch(String s) {

		int n = s.length();
		int k = 0, l = n;
		int arr[] = new int[n + 1];

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'I')
				arr[i] = k++;
			else
				arr[i] = l--;

		}
		arr[n] = l;
		return arr;
	}

}
