package com.muthukumarasamym.leetcode;

import java.util.Scanner;

public class NimGame {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = mc.nextInt();
		NimGame n = new NimGame();
		System.out.println(n.canWinNim(num));

	}

	public boolean canWinNim(int n) {

		int max = 3, min = 1, stone = n;
		if (n <= max)
			return true;
		for (int i = 1; i <= n; i++) {

			if (stone <= max) {
				if (i % 2 == 0)
					return false;
				else
					return true;
			}
			if (i % 2 == 0)
				stone -= max;
			else
				stone -= min;
		}
		return true;
	}

}
