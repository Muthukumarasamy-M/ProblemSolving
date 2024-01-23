package com.muthukumarasamym.hackerank;

import java.util.Scanner;

public class HexatoDecimal {
	private static void decimalConversion(String s) {
		
		
		
	}
	

	public static void main(String[] args) {
		Scanner mc =new Scanner(System.in);
		System.out.println("enter the hexa value");
		String s=mc.next();
		if(s.matches("[0-7]{0,8}[8a-zA-z]{0,7}")) {
			decimalConversion(s);
		System.out.println("Inbuilt method : " +Integer.parseInt(s,16));
		}
		else
		System.out.println("hexavalue only ranges from[1-9][a-f]");

	}

	

}
