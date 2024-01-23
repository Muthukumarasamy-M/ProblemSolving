package com.muthukumarasamym.hackerank;

import java.util.Scanner;

public class OctaltoDecimal {
	public static void decimalConversion(String s) {

		int n = s.length() - 1;
		int i = 0, sum = 0;
		while (n != -1) {
			int k = Integer.parseInt(String.valueOf(s.charAt(i)));

			sum = sum + ((int) (Math.pow(8, n)) * k);
			i++;
			n--;

		}

		System.out.println("ordinary method->" + sum);

	}

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the octal number");
		String s = mc.nextLine();

		if (s.matches("[0-7]{0,11}")) {

			System.out.println("Inbuilt  method->" + Integer.parseInt(s, 8));

			decimalConversion(s);
		} else
			System.out.println("this is not a octal number");
	}

}
