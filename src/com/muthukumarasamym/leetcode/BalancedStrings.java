package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class BalancedStrings {

	public static void main(String[] args) {
		
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the string with \"R\" and \"L\" " );
		String s=mc.next();
		System.out.println(method1(s));
	

	}

	private static int method1(String s) {
		
		int count=0,k=0;
		for(char c:s.toCharArray())
		{
			if(c=='R')
				k++;
			else
				k--;
			if(k==0)
				count++;
		}
		return count;
		
	}

}
