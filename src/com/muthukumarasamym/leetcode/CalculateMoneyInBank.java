package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class CalculateMoneyInBank {

	public static void main(String[] args) {
		System.out.println("enter the number  of days");
		Scanner mc = new Scanner(System.in);
		int n = mc.nextInt();
		CalculateMoneyInBank c = new CalculateMoneyInBank();
		System.out.println("the Total money is " + (c.totalMoney(n)));
	}

	public int totalMoney(int n) {
		int sum = 0, start = 1, daily = 1;
		for (int i = 1; i <= n; i++) {
			sum += daily;
			if (i % 7 == 0)
				daily = start++;

			daily++;

		}
		return sum;

	}

}
