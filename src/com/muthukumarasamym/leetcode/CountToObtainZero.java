package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class CountToObtainZero {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n1=mc.nextInt();
		int n2=mc.nextInt();
		System.out.println(countOperations(n1,n2));

	}

	private static int countOperations(int num1, int num2) {
		
		int count=0;
		while(num2>0 && num1>0 )
		{
			if(num1>num2)
				num1=num1-num2;
			else
				num2=num2-num1;
			count++;
		}
		return count;
	}

}
