package com.muthukumarasamym.evaluation03.simpledungeon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FullDungeon07 {

	public static void main(String[] args) {
		FullDungeon07 f = new FullDungeon07();
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
		System.out.println("Enter the number of pits : ");
		int n = mc.nextInt();
		Set<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Position of pit " + (i + 1) + " :");
			int x = mc.nextInt(), y = mc.nextInt();
			set.add((x - 1) + "," + (y - 1));
		}
		int arr[][] = f.memberToGold(row, col, arow, acol, grow, gcol, set);
		int monstermin = Math.abs(mrow - grow) + Math.abs(mcol - gcol);
		if (monstermin < arr[grow - 1][gcol - 1]) {
			System.out.println("asdfasdf");
			int trig[][] = new int[row][col];

			System.out.println(Arrays.deepToString(trig));
			System.out.println((arow - 1) + " " + (trow - 1));
			for (int i = arow - 1; i >= trow - 1; i--) {
				for (int j = acol - 1; j <= tcol - 1; j++) {
					if (set.contains(i + "," + j)) {
						trig[i][j] = 999;
						j--;
						i++;
					}
					if (i == row - 1 && j == 0)
						trig[i][j] = trig[i - 1][j] + 1;
					else if (i == row - 1)
						trig[i][j] = trig[i][j - 1] + 1;
					else if (j == acol - 1)
						trig[i][j] = trig[i + 1][j] + 1;
					else
						trig[i][j] = Math.min(trig[i + 1][j], trig[i][j - 1]) + 1;

				}
			}
			System.out.println(Arrays.deepToString(trig));
			int[][] trigtogold = new int[row][col];
			for (int i = trow; i >= grow; i--) {
				for (int j = tcol; j >= gcol; j--) {
					if (set.contains(i + "," + j)) {
						trigtogold[i][j] = 999;
						continue;
					}
					if (j == tcol)
						trigtogold[i][j] = trigtogold[i + 1][j];
					else
						trigtogold[i][j] = Math.min(trigtogold[i + 1][j], trigtogold[i][j - 1]) + 1;

				}
			}
			System.out.println(trig[trow - 1][tcol - 1] + trigtogold[grow - 1][gcol - 1]);

		} else
			System.out.println("Minimum number offff steps : " + arr[grow - 1][gcol - 1]);

	}

	public int[][] memberToGold(int row, int col, int arow, int acol, int grow, int gcol, Set<String> set) {
		int arr[][] = new int[row][col];
		for (int i = arow - 1; i >= grow - 1; i--) {
			for (int j = acol - 1; j < col; j++) {
				if (i == arow - 1 && j == 0)
					continue;
				else if (j == 0)
					arr[i][j] = arr[i + 1][j] + 1;
				else if (i == arow - 1)
					arr[i][j] = arr[i][j - 1] + 1;
				else
					arr[i][j] = Math.min(arr[i + 1][j], arr[i][j - 1]) + 1;
			}
		}
		return arr;

	}

}
