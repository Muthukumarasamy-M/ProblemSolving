package com.muthukumarasamym.hackerank;

import java.util.*;
import java.util.Scanner;

public class PlusMinus {
	public static void plusMinus(List<Integer> arr) {
		double a = 0, b = 0, c = 0;
		int n = arr.size();
		for (int i = 0; i < arr.size(); i++) {
			int x = arr.get(i);
			if (x > 0)
				a++;
			else if (x < 0)
				b++;
			else
				c++;

		}
		System.out.printf("%.6f\n", a / n);
		System.out.printf("%.6f\n", b / n);
		System.out.printf("%.6f\n", c / n);

	}

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the length of list");
		int n = mc.nextInt();
		List<Integer> arr = new ArrayList<>();
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			int x = mc.nextInt();
			arr.add(x);
		}
		plusMinus(arr);

	}

}
