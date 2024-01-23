package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSentence {

	public static void main(String[] args) {
		
		
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = mc.nextLine();
		System.out.println(sortSentence(s));
		
	}
	public static String sortSentence(String s) {
       String str[]= s.split("\\s+");
       String []l=new String[str.length];
       for(String k:str)
       {
    	   int n= Integer.parseInt(k.substring(k.length()-1));
    	   l[n-1]=k.substring(0,k.length()-1);
       }
		
		
		return Arrays.toString(l).replace("[", "").replace(",","").replace("]", "") ;
    }

}
