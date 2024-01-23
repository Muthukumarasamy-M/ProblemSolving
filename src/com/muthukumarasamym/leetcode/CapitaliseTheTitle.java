package com.muthukumarasamym.leetcode;

import java.util.*;

public class CapitaliseTheTitle {

	public static void main(String[] args) {
		
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the string");
		String s=mc.nextLine();
		System.out.println((capitiliseTitle(s)));
	}

	private static String capitiliseTitle(String s) {
		
		String a[]=s.toLowerCase().split("\\s+");
		String k="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()>2)
			{
				a[i]=a[i].substring(0,1).toUpperCase()+a[i].substring(1);
			}
			k+=a[i]+" ";
		}
		return k;
		
	}

}
