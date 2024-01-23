package com.muthukumarasamym.allpattern;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroPattern {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=mc.nextInt();
		ZeroPattern z= new ZeroPattern();
		z.zeropattern(n);
	}
	
	private void zeropattern(int n) {
		
		
		char arr[][]= new char[n][n];
		for (char[] row : arr) {
            Arrays.fill(row, '0');
        }
		int top=0,bottom=n-1;
		
		while(top<=bottom)
		{
			for(int i=top;i<=bottom;i++)
			{
				arr[i][top]='X';
				arr[top][i]='X';
			}
			for(int i=top;i<=bottom;i++)
			{
				arr[bottom][i]='X';
				arr[i][bottom]='X';
			}
			top+=2;
			bottom-=2;
			
		}
		for(char i[]:arr)
			System.out.println(Arrays.toString(i));
		
	}

}
