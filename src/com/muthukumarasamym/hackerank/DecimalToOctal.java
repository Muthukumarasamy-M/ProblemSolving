package com.muthukumarasamym.hackerank;

import java.util.Scanner;

public class DecimalToOctal {

	private static void octalConversion(int s) {
		String str="";
		
		char  []octalchar= {'0','1','2','3','4','5','6','7'};
		
		
		while(s>0) {
			int rem = s%8;
			str= octalchar[rem]+str;
			s=s/8;
		}
		System.out.println(str);
		
		
				
	}
	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the Decimal number");
		int s = mc.nextInt();
		octalConversion(s);
		System.out.println("Inbuilt  Method->"+Integer.toOctalString(s));

	}

	

}
