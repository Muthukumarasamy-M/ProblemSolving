package com.muthukumarasamym.evaluation.thirdevaluation;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleDungeon01{
	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Dimension of Dungeon (row X col) : ");
		int row = mc.nextInt(), col = mc.nextInt();
		System.out.println("Position of adventurer : ");
		int arow = mc.nextInt(), acol = mc.nextInt();
		System.out.println("Position of Gold : ");
		int grow = mc.nextInt(), gcol = mc.nextInt();
		if (arow < 1 || arow > row || acol < 1 || acol > col || grow < 1 || grow > row || gcol < 1 || gcol > col) {
			System.out.println("Invalid input. Positions should be within the dungeon boundaries.");
			return;
		}
		int minCal = Math.abs(grow - arow) + Math.abs(acol - gcol);
		System.out.println("minimum number of steps is  : " + minCal);
	}

}
