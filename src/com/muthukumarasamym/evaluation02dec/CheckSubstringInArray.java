package com.muthukumarasamym.evaluation02dec;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSubstringInArray {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		String str = "WELCOMETOZOHOSCHOOLFORGRADUATESTUDIES";
		CheckSubstringInArray c = new CheckSubstringInArray();

		System.out.println("enter the column length");
		int col = mc.nextInt();
		c.checkSubstring(str, col);
	}

	private void checkSubstring(String str, int col) {

		int row = str.length() / col + 1;
		int index = 0;
		char arr[][] = new char[row][col];
		for (int i = 0; i < row & index < str.length(); i++) {
			for (int j = 0; j < col & index < str.length(); j++) {
				arr[i][j] = str.charAt(index);
				index++;
			}
		}
		print(arr);
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == 'H') {
					find(i, j, arr);
				}
			}
		}
		
	}

	private void print(char[][] arr) {
		for (char[] ch : arr) {
			for (char c : ch)
				System.out.print(c + " ");
			System.out.println();
		}

	}

	private void find(int i, int j, char[][] arr) {

		if (j + 2 < arr[i].length) {
			if (arr[i][j + 1] == 'O' && arr[i][j + 2] == 'O') {
				System.out.println("start <" + i + "" + j + ">");
				System.out.println("end <" + i + "" + (j + 2) + ">");

			}
		}
		if (i + 2 < arr.length) {
			if (arr[i + 1][j] == 'O' && arr[i + 2][j] == 'O') {
				System.out.println("start <" + i + "  ," + j + ">");
				System.out.println("start <" + (i + 2) + " , " + j + ">");
			}

		}

	}

}
