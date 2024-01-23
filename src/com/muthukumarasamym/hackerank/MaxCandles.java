package com.muthukumarasamym.hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxCandles {

	static void maxcandles(List<Integer> arr) {
		Collections.sort(arr);
		int max = arr.get(arr.size() - 1);
		int count = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == max)
				count++;
		}
		System.out.println("The number of max candles is "+count);
	}

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the length of list");
		int n = mc.nextInt();
		List<Integer> arr = new ArrayList<>();
		System.out.println("Enter the elements ");
		for (int i = 0; i < n; i++) {
			int x = mc.nextInt();
			arr.add(x);
		}
		maxcandles(arr);

	}
}
