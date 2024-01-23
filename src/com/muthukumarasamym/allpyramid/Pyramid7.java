package com.muthukumarasamym.allpyramid;

import java.util.Scanner;

public class Pyramid7 {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = mc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
/*
 9
        1 
       1 2 
      1 2 3 
     1 2 3 4 
    1 2 3 4 5 
   1 2 3 4 5 6 
  1 2 3 4 5 6 7 
 1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 
*/
