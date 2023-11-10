package com.muthukumarasamym.evaluation;

import java.util.*;

public class Jumpled {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);

		System.out.print("enter the number");
		String string = mc.next();
		Boolean bool = true;

		for (int i = 0; i < string.length() - 1; i++) {

			int n1 = Integer.parseInt(string.substring(i, i + 1));
			int n2 = Integer.parseInt(string.substring(i + 1, i + 2));
			if (Math.abs(n1 - n2) != 1) {
				bool = false;
				break;
			}
		}

		if (bool == false)
			System.out.println(string + " is not a jumpled number");
		else
			System.out.println(string + " is a jumpled number");

	}

}
