package com.muthukumarasamym.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int num = mc.nextInt();
		PascalTriangle p = new PascalTriangle();
		p.triangle(num);
	}

	private void triangle(int num) {

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> prev = new ArrayList<>();
		for (int i = 0; i < num; i++) {

			List<Integer> cur = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					cur.add(1);
				else
					cur.add(prev.get(j - 1) + prev.get(j));

			}
			prev = cur;
			list.add(cur);
		}
		print(list);

	}

	private void print(List<List<Integer>> list) {

		int index = 0;
		for (List li : list) {
			for (int k = 0; k < list.size() - index; k++)
				System.out.printf("%2s","");
			for (Object num : li)
				System.out.printf("%4d",num);

			System.out.println();
			index++;
		}

	}

}
