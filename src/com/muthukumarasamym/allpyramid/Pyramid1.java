package com.muthukumarasamym.allpyramid;

import java.util.Scanner;

public class Pyramid1 {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = mc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = n - i; k >= 0; k--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)

				System.out.print(i + " ");
			System.out.println();
		}
	}
}
/*
9
		
				1 
			   2 2 
		      3 3 3 
		     4 4 4 4 
		    5 5 5 5 5 
		   6 6 6 6 6 6 
		  7 7 7 7 7 7 7 
		 8 8 8 8 8 8 8 8 
		9 9 9 9 9 9 9 9 9
		
*/