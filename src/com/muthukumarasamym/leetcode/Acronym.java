package com.muthukumarasamym.leetcode;

import java.util.*;

public class Acronym {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		System.out.println("enter the array length");
		int n=mc.nextInt();
		List<String> s= new ArrayList <String>();
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
			s.add(mc.next());
		System.out.println("enter the string to check");
		String str=mc.next();
		System.out.println("1) "+isAcronym(s,str));
		System.out.println("2) "+isAcronym2(s,str));
	}

	private static boolean  isAcronym2(List<String> s, String str) {

		if(str.length()!=s.size())
	        return false;
			for(int i=0;i<s.size();i++)
			{  
				if(s.get(i).charAt(0)!=str.charAt(i))
	                return false;
			}
			
			return true;
	}

	private static boolean isAcronym(List<String> s, String str) {
	
		String o="";
		for(int i=0;i<s.size();i++)
		{
			o+= ""+s.get(i).charAt(0);
		}
		
		return o.equals(str);
	}

}
