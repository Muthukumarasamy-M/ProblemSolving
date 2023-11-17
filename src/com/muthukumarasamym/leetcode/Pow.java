package com.muthukumarasamym.leetcode;

public class Pow {

	public static void main(String[] args) {
		double d = 2.0000;
		int i = -1;
		System.out.println(pow(d, i));
	}

	private static double pow(double d, int i) {

		if (i == 0)
			return 1;
		if (i < 0)
			return 1 / pow(d, i+1);
		else
			return d * pow(d, i-1);
	}

}
