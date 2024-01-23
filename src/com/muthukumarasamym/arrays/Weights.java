package com.muthukumarasamym.arrays;

import java.util.*;

public class Weights {
	static int sumOfWeights(int m) {

		int n = 0;
		if (Math.sqrt(m) - Math.floor(Math.sqrt(m)) == 0) // perfect square
			n += 5;
		if (m % 4 == 0 && m % 6 == 0) // number multiple of 4 && divisible of 6
			n += 4;
		if (m % 2 == 0) // is even number ?
			n += 3;
		return n;
	}

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("enter the size of list");
		int num = mc.nextInt();
		int array[][] = new int[num][2];
		System.out.println("enter the elements");
		for (int i = 0; i < num; i++) {
			array[i][0] = mc.nextInt();

			array[i][1] = sumOfWeights(array[i][0]);

		}
		Arrays.sort(array, (x, y) -> y[1] - x[1]);
		
		for (int i = 0; i < num; i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
	}

}
