package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println("Enter the no of rows");
		Scanner mc = new Scanner(System.in);
		int n = mc.nextInt();

		PascalTriangle p = new PascalTriangle();
		System.out.println(p.pascalTriangle(n));
		System.out.println(p.pascalTriangle2(n));
	}

	private List<List<Integer>> pascalTriangle(int n) {

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> lit = new ArrayList<>();
		for (int i = 0; i < n; i++) {

			List<Integer> li = new ArrayList<>();
			for (int j = 0; j <= i; j++) {

				if (j == 0 || j == i)
					li.add(1);
				else
					li.add(lit.get(j - 1) + lit.get(j));

			}
			lit = li;
			list.add(li);

		}
		return list;
	}

	private List<Integer> pascalTriangle2(int n) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {

			List<Integer> li = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (i == 0 || i == 1)
					li.add(1);
				else if (j == 0 || j == i)
					li.add(1);
				else
					li.add(list.get(j - 1) + list.get(j));

			}
			list = li;

		}
		return list;
	}

}
