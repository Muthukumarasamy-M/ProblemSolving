package com.muthukumarasamym.hackerank;

import java.util.ArrayList;
import java.util.List;

public class Arraymovemont {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];
		arr[0][0] = 1;
		int arow = 0, acol = 0;
		int grow = 2, gcol = 2;
		int mrow = 4, mcol = 4;
		arr[3][4] = 999;
		path(arow, acol, grow, gcol, arr);
		path(mrow, mcol, grow, gcol, arr);
		
	}

	private static void path(int arow, int acol, int grow, int gcol, int[][] arr) {

		int i = arow, j = acol;
		List<String> list = new ArrayList<>();
		while (i != grow && j != gcol) {
		

		}
		System.out.println(list);

	}

}
