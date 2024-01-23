package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class TruncateSentence {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);

		System.out.println("enter the String");

		String s = mc.nextLine();

		System.out.println("enter the number");

		int k = mc.nextInt();

		System.out.println(method1(s, k));
		System.out.println(method2(s,k));

	}

	private static String method2(String s, int k) {
		
		int i=0,count=0;
		for( i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				count++;
			if(count==k)
				break;
		}
		return s.substring(0,i);
		
	}

	private static String method1(String s, int k) {

		String str = Arrays.toString(Arrays.copyOfRange(s.split("\\s+"), 0, k));

		return str.replace("[", "").replace(",", "").replace("]", "");
	}

}
