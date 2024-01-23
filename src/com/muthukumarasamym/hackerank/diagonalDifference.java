package com.muthukumarasamym.hackerank;

import java.util.*;

public class diagonalDifference {

	public static int diagonalDifferencee(List<List<Integer>> arr) {
		// Write your code here
		int n = arr.get(0).size();
		int leftsum = 0, rightsum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					leftsum += arr.get(i).get(j);
				if (i + j == n - 1)
					rightsum += arr.get(i).get(j);

			}

		}
		System.out.println("left sum  " + leftsum + " rightsum  " + rightsum);
		return Math.abs(leftsum - rightsum);
	}

	public static void main(String[] args) {
		try (Scanner mc = new Scanner(System.in)) {
			System.out.println("enter the row or column of matrix");
			int n = mc.nextInt();
			System.out.println("enter the elements ");
			List<List<Integer>> arr = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				System.out.println("row "+ (i+1));
				List<Integer> a = new ArrayList<>();
				for (int j = 0; j < n; j++) {
					int x = mc.nextInt();
					a.add(x);

				}
				arr.add(a);
			}
			System.out.println("Ans id  " + diagonalDifferencee(arr));

		}

	}
}
