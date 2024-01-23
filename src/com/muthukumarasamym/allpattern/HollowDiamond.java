package com.muthukumarasamym.allpattern;

import java.util.Scanner;

public class HollowDiamond {
	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = mc.nextInt();
		for(int i=1;i<=2*n;i++)
		{
			for(int j=1;j<=2*n;j++)
			{
				if(i+j<=n+1||i-j>=n||j-i>=n||i+j>=3*n+1)
						System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

/*
 enter the number
5
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 

 * 
 */