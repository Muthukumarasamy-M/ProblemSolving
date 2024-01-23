package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class Pow {

	public static void main(String[] args) {
		Scanner mc= new Scanner(System.in);
		System.out.println("Enter the double value");
		double d = mc.nextDouble();
		System.out.println("Enter the power value");
		int exp = mc.nextInt();
		try {
			System.out.println(pow(d, exp));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static double pow(double x, int n) throws Exception{
		
		if (n < 0) {
	        x = 1 / x;
	        n = -n;
	    }

	    double result = 1.0;

	    while (n != 0) {
	        if ((n & 1) != 0) {
	            result *= x;
	        }
	        x *= x;
	        n >>>= 1;
	    }

	    return result;
	}

}
