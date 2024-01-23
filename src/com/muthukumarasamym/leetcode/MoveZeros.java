package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {
		
		Scanner mc=new Scanner(System.in);
		System.out.println("enter the number");
		int n= mc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=mc.nextInt();
		}
		moveZeroes(a);
		moveZeroes2(a);
	}
	private static void moveZeroes2(int[] a) {
		
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
				index++;
			}
		}
        
        System.out.println(Arrays.toString(a)+" 2");
	}
	
	
	
	public static void moveZeroes(int[] a) {
        int k=0,i;
		for( i=0;i<a.length;i++)
		{
			
			if(a[i]==0)
			{
				int j=i+1;
				while(j<a.length)
				{
					if(a[j]!=0)
					{
						int temp= a[i];
						a[i]=a[j];
						a[j]=temp;
						break;
					}
					j++;
				}
			}
		}
		System.out.println(Arrays.toString(a)+" "+k);
        
    }

}
