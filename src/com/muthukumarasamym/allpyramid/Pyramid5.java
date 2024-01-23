package com.muthukumarasamym.allpyramid;

import java.util.Scanner;

public class Pyramid5 {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = mc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++)
				System.out.print("  ");
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			for (int l = i - 1; l >= 1; l--)
				System.out.print(l + " ");
			System.out.println();
		}
	}
}
/*
 		 		1 
              1 2 1 
            1 2 3 2 1 
          1 2 3 4 3 2 1 
        1 2 3 4 5 4 3 2 1 
      1 2 3 4 5 6 5 4 3 2 1 
    1 2 3 4 5 6 7 6 5 4 3 2 1 
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 

*/