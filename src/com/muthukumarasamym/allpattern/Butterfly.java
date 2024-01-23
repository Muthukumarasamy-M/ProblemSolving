package com.muthukumarasamym.allpattern;

import java.util.Scanner;

public class Butterfly {

	public static void main(String[] args) {

	Scanner mc = new Scanner(System.in) ;
		System.out.println("enter the number");
		int n = mc.nextInt();
		int k = 0, l = 0;
		for (int i = 1; i < 2 * n; i++) {
			if (i >= n) {
				k = 2 * n - i;
				l = i;
			} else { 
				k = i;
				l = 2 * n - i;
			}
			for (int j = 1; j < 2 * n; j++) {
				if (j > k && j < l)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}
}
/*
*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * * 
* * * *   * * * * 
* * *       * * * 
* *           * * 
*               * 

*/