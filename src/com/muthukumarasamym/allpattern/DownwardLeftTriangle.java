package com.muthukumarasamym.allpattern;


import java.util.Scanner;

public class DownwardLeftTriangle {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = mc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == n || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
/*  
*****       
 *  *
  * *
   **
    *
*/