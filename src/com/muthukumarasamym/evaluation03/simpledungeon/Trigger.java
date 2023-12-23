package com.muthukumarasamym.evaluation03.simpledungeon;

import java.util.Scanner;

public class Trigger {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Dimension of Dungeon (row X col) : ");
		int row = mc.nextInt(), col = mc.nextInt();
		System.out.println("Position of adventurer : ");
		int arow = mc.nextInt(), acol = mc.nextInt();
		System.out.println("Postion of Monster : ");
		int mrow = mc.nextInt(), mcol = mc.nextInt();
		System.out.println("Position of Trigger : ");
		int trow = mc.nextInt(), tcol = mc.nextInt();
		System.out.println("Position of Gold : ");
		int grow = mc.nextInt(), gcol = mc.nextInt();
		int adventuremin = Math.abs(arow - grow) + Math.abs(acol - gcol);
		int monstermin = Math.abs(mrow - grow) + Math.abs(mcol - gcol);

		if (adventuremin > monstermin) {
			int Adventotrigger = Math.abs(arow - trow) + Math.abs(acol - tcol);
			int triggertogold = Math.abs(trow - grow) + Math.abs(tcol - gcol);
			System.out.println("Minimum number of steps is  : " + (Adventotrigger + triggertogold));

		} else {
			System.out.println("Minimum number of steps is  : " + adventuremin);

		}

	}

}
