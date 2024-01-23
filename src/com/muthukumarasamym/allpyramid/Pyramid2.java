package com.muthukumarasamym.allpyramid;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = mc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int k = n - i; k >= 1; k--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(i + " ");
			System.out.println();
		}
	}
}
/*

9 9 9 9 9 9 9 9 9 
 8 8 8 8 8 8 8 8 
  7 7 7 7 7 7 7 
   6 6 6 6 6 6 
    5 5 5 5 5 
     4 4 4 4 
      3 3 3 
       2 2 
        1 
*/