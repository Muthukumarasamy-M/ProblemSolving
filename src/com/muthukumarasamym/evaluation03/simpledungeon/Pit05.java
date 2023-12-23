package com.muthukumarasamym.evaluation03.simpledungeon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pit05 {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Dimension of Dungeon (row X col) : ");
		int row = mc.nextInt(), col = mc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Position of adventurer : ");
		int arow = mc.nextInt(), acol = mc.nextInt();
		System.out.println("Position of Gold : ");
		int grow = mc.nextInt(), gcol = mc.nextInt();
		System.out.println("Enter the number of pits : ");
		int n = mc.nextInt();
		Set<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Position of pit " + (i + 1) + " :");
			int x = mc.nextInt();
			int y = mc.nextInt();
			set.add(x + "," + y);
		}

		for (int i = arow - 1; i >= grow - 1; i--) {
			for (int j = acol; j < col; j++) {
				if (set.contains(i + "," + j)) {
					arr[i][j] = 999;
					continue;
				}
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
		if (arr[grow][gcol] > 20)
			System.out.println("No possible solutions");
		else
			System.out.println("Minimum number of steps : " + arr[grow][gcol]);
	}

}
