package com.muthukumarasamym.hackerank;

import java.util.*;
import java.util.regex.Pattern;
public class BInaryToDecimal {
	
	public static void decimalConversion(String s)
	{
		int n=s.length()-1;
		int i=0,sum=0;
		while(n!=-1)
		{
			int k=Integer.parseInt(String.valueOf(s.charAt(i)));
			
			sum= sum+( (int)(Math.pow(2, n))*k);
			i++;
			n--;
			
		}
		System.out.println("ordinary method->"+sum);
		
	}
	
	public static void main(String[] args) {
		
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the number");
		String s=  mc.nextLine();
		
		if(Pattern.matches("[0-1]{0,31}",s))
		{
			decimalConversion(s);
			System.out.println("Inbuilt method ->"+ Integer.parseInt(s,2));
		}
		else
		{
			System.out.println("this is not binary number");
		}
		
}
}
