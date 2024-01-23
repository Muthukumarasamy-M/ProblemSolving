package com.muthukumarasamym.allpyramid;

import java.util.Scanner;

public class Pyramid4 {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = mc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++)
				System.out.print("  ");
			for (int j = n + 1 - i; j <= n; j++)
				System.out.print(j + " ");
			int o = 8;
			for (int l = 1; l < i; l++) {
				System.out.print(o + " ");
				o--;
			}
			System.out.println();
		}
	}
}
/*
   				9 
              8 9 8 
            7 8 9 8 7 
          6 7 8 9 8 7 6 
        5 6 7 8 9 8 7 6 5 
      4 5 6 7 8 9 8 7 6 5 4 
    3 4 5 6 7 8 9 8 7 6 5 4 3 
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 

*/