package com.muthukumarasamym.arrays;

import java.util.*;

public class Xpattern {

	static void patternPrint(String s, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i || j == n - i - 1)
					System.out.print(s.charAt(j));
				else
					System.out.print(" ");
			}
			System.out.println();
		}                                                                                                                        
	}

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("enter the word");
		String word = mc.next();
		int n = word.length();

		if (n % 2 == 0)
			System.out.println("0");
		else
			patternPrint(word, n);

	}

}
