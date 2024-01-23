package com.muthukumarasamym.hackerank;

import java.util.*;

public class StaircasePattern {
	public static void staircase(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++)

				if (j >= i)
					System.out.print("#");
				else
					System.out.print(" ");

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = mc.nextInt();
		staircase(n);

	}

}
