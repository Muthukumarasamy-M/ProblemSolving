package com.muthukumarasamym.evaluation.L3Questionsjan20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HundredGame {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.print("Max :");
		int max = mc.nextInt();
		System.out.print("desired :");
		int des = mc.nextInt();

		HundredGame h = new HundredGame();
		System.out.println(h.canIWin(max, des));

	}

	private boolean canIWin(int max, int des) {

		if (des < max)
			return true;
		Set<Integer> set = new HashSet<>();
		for (int i = 1; i <= des; i ++) {

			if ((des <= max) && (i % 2 == 0))
				return false;
			else if((des <= max))
				return true;
			
			if (set.add(i))
				des -= i;

		}
		return false;

	}

}
