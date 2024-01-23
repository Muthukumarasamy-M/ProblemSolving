package com.muthukumarasamym.allpattern;

import java.util.Scanner;

public class RightPascal {
	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = mc.nextInt();

		for (int i = 1; i < 2 * n; i++) {

			for (int j = 1; j <= n; j++) {

				if (j == 1 || j == i || i + j == 2 * n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
 n=5

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