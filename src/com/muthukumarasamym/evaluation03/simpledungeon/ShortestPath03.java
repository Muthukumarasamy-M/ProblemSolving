package com.muthukumarasamym.evaluation03.simpledungeon;

import java.util.Scanner;

public class ShortestPath03 {

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

		int adventuremin = Math.abs(arow - grow) + Math.abs(acol - gcol);
		int monstermin = Math.abs(mrow - grow) + Math.abs(mcol - gcol);
		if (adventuremin > monstermin)
			System.out.println("No possible solution");
		else {
			System.out.println("minimum number of steps is  : " + adventuremin);
			System.out.println("path : ");
			for (int i = arow; i >= grow; i--) {
				for (int j = acol; j <= gcol; j++) {
					System.out.print("(" + i + "," + j + ")");
					if (i != grow || j != gcol)
						System.out.print("->");
				}
				acol = gcol;
			}

		}
	}
}