package com.muthukumarasamym.evaluation03.simpledungeon;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleDungeon {
	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.print("Dimension of Dungeon (row X col) : ");
		int row = mc.nextInt(), col = mc.nextInt();
		System.out.print("Position of adventurer : ");
		int arow = mc.nextInt(), acol = mc.nextInt();
		System.out.print("Position of Gold : ");
		int grow = mc.nextInt(), gcol = mc.nextInt();

		int minCal = Math.abs(grow - arow) + Math.abs(acol - gcol);
		System.out.println("minimum number of steps is  : " + minCal);
	}

}
