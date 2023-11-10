package com.muthukumarasamym.evaluation;

import java.util.Scanner;

public class SpiralPatten {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the number");
		
		int n = mc.nextInt(), add = 0, i = 0, j = 0, k = 1;
		for(i=1;i<n;i++)
			add+=i;

		int arr[][] = new int[n][n];
		i=0;
		while (k <= add) {
			if (i == j ) {
				while (i<n || (j - i == 1 && i + j <= n)) {
					arr[i][j] = k++;
					i++;
					j++;
					System.out.println(i+" "+j);
				}
			}
			if((i==n && j==n )| j-1==1)
			{
				i-=2;
				j--;
				while(i>0)
				{	System.out.println(" good"+i+" "+j);
					
					arr[i][j]=k;
					i--;
					k++;
				}
			}
			if(i==0 && j>0)
			{
				while(j>0 )
				{
					System.out.println("fol"+i+" "+j);
					arr[i][j]=k++;
					j--;
				}
			}
			j+=2;
			i++;
			 if(j - i == 1) {
					while (j<(n-1)) {
						arr[i][j] = k++;
						
						i++;
						j++;
						System.out.println(" sdgsdfg"+i+" "+j);
					}
				}
			 
		}
		System.out.println();
		printArray(arr,n,n);

	}
private static void printArray(int[][] arr,int rows,int column) {
		
		for(int i=0;i<rows;i++) {
			for( int j=0;j<column;j++)
			{
				if(arr[i][j]!=0)
					System.out.print(arr[i][j]+" ");
				else
					System.out.print("   ");
				
				
			}
		System.out.println();	
	}
	}

}
