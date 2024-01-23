package com.muthukumarasamym.hackerank;

import java.util.Scanner;

public class threesum {
	public static int sumOddLengthSubarrays(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			int total = (i + 1) * (arr.length - i);
			int odd = (total + 1) / 2;
			res += odd * arr[i];

		}
		return res;
	}

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = mc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++)
			arr[i] = mc.nextInt();

		System.out.println(sumOddLengthSubarrays(arr));
	}

}
/*
int add = 0, x = 0, s1 = 0, s2 = 0, count = 0;
if (arr.length == 1)
	return as;
for (int i = 1; x < arr.length; i++) {
	s1 = 0;
	s2 = 0;
	count = 0;
	x = 1 + 2 * i;
	for (int j = 0; j < arr.length; j++) {
		if (count < x) {
			s1 += arr[j];
		} else {
			add += s1;
			s2 = s1 - arr[j - x] + arr[j];
			s1 = s2;
		}
		count++;
	}
	add += s2;
}
if (arr.length % 2 == 0)
	return (add + s1);
else
	return add + s1 + s1;
*/