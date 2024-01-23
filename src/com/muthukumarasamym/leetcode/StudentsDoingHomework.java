package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class StudentsDoingHomework {

	static Scanner mc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter the no.of  students ");
		int n=mc.nextInt();
		System.out.println("enter the elements of start time");
		int a[]=getValues(n);
		System.out.println("enter the elements of end time");
		int b[]=getValues(n);
		System.out.println("enter the query time");
		int q= mc.nextInt();
		System.out.println("the no of busy student is: "+busyStudent(a,b,q));
		
	}
	private static int busyStudent(int[] a, int[] b, int q) {
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=q && b[i]>=q)
				count++;
		}
		return count;
	}
	public static int[] getValues(int n)
	{
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=mc.nextInt();
		return arr;
	}

}
