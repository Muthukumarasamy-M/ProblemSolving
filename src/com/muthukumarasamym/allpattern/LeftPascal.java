package com.muthukumarasamym.allpattern;

import java.util.*;

public class LeftPascal {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = mc.nextInt();

		for (int i = 1; i < 2 * n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n || i + j == n + 1 || i - j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

/*
enter the number
5
    *
   **
  * *
 *  *
*   *
 *  *
  * *
   **
    *
*/