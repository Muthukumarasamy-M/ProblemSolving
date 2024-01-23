package com.muthukumarasamym.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicStrings {

	public static void main(String[] args) {

		Scanner mc= new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String s1 =mc.nextLine();
		System.out.print("Enter the second String : ");
		String s2= mc.nextLine();
		
		IsomorphicStrings i= new IsomorphicStrings();
		i.find(s1,s2);
		
	}

	private boolean find(String s1, String s2) {
		
		if(s1.length()!=s2.length())
			return false;
		
		int map1[]= new int[200];
		int map2[]= new int[200];
		
		for(int i=0;i<s1.length();i++)
		{
			if(map1[s1.charAt(i)]!=map2[s2.charAt(i)])
					return false;
			map1[s1.charAt(i)]++;
			map2[s2.charAt(i)]++;
		}
		return true;

}}
