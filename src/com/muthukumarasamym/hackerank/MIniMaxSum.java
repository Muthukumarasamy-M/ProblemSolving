package com.muthukumarasamym.hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MIniMaxSum {
	public static void minimaxsum(List<Integer> arr) {
		Collections.sort(arr);
		int n = arr.size();
		int max = 0, min = 0;

		for (int i = 0; i < 4; i++) {
			min += arr.get(i);
		}

		for (int i = n - 1; i >= n - 4; i--)
			max += arr.get(i);

		System.out.println(min + " " + max);
	}

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the length of list (>5)");
		int n = mc.nextInt();
		List<Integer> arr = new ArrayList<>();
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			int x = mc.nextInt();
			arr.add(x);
		}
		minimaxsum(arr);

	}

}
