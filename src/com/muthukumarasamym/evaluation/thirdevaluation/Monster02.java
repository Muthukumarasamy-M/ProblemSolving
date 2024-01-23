package com.muthukumarasamym.evaluation.thirdevaluation;

import java.util.Scanner;

public class Monster02 {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Dimension of Dungeon (row X col) : ");
		int row = mc.nextInt(), col = mc.nextInt();
		System.out.println("Position of adventurer : ");
		int arow = mc.nextInt(), acol = mc.nextInt();
		System.out.println("Postion of Monster : ");
		int mrow = mc.nextInt(), mcol = mc.nextInt();
		System.out.println("Position of Gold : ");
		int grow = mc.nextInt(), gcol = mc.nextInt();
		if (arow < 1 || arow > row || acol < 1 || acol > col || mrow < 1 || mrow > row || mcol < 1 || mcol > col
				|| grow < 1 || grow > row || gcol < 1 || gcol > col) {
			System.out.println("Invalid input. Positions should be within the dungeon boundaries.");
			return;
		}
		int adventuremin = Math.abs(arow - grow) + Math.abs(acol - gcol);
		int monstermin = Math.abs(mrow - grow) + Math.abs(mcol - gcol);
		if (adventuremin > monstermin)
			System.out.println("No possible solution");
		else
			System.out.println("minimum number of steps is  : " + adventuremin);

	}

}
