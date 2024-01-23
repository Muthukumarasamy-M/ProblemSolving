package com.muthukumarasamym.evaluation.firstevalution;

import java.util.*;

public class Jumpled {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);

		System.out.println("enter the number");
		int num = mc.nextInt(), k = num;
		boolean bool = true;

		while (num > 10) {
			int num1 = num % 10;
			int num2 = (num / 10) % 10;

			if (((num2-num1) != 1) && ((num1-num2) != 1) ) {
				bool = false;
				break;
			}
			num /= 10;
		}
		if (bool == false)
			System.out.println(k + " not a jumpled number");
		else
			System.out.println(k + " is a jumpled number");

	}
}
