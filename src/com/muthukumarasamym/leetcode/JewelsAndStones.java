package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class JewelsAndStones {

	public static void main(String[] args) {
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=mc.next();
		System.out.print("enter the second string");
		String s2= mc.next();
		System.out.println(method(s1,s2));

	}

	private static int method(String s1, String s2) {
		
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
				if(s1.charAt(i)==s2.charAt(j))	
					count++;
		}
		return count;
	}

}
