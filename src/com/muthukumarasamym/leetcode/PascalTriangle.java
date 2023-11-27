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

	}

	private List<List<Integer>> pascalTriangle(int n) {

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> lit = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			
			List<Integer> li = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (list.isEmpty()) {
					li.add(1);
				} else if (i == 1)
					li.add(1);
				else if (j == 0 || j == i)
					li.add(1);
				else
					li.add(lit.get(j - 1) + lit.get(j));

			}
			lit = li;
			list.add(li);

		}
		return list;
	}

}
