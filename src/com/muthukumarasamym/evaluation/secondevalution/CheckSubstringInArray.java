package com.muthukumarasamym.evaluation.secondevalution;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class CheckSubstringInArray {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		String str = "WELCOMETOZOHOSCHOOLFORGRAOUATESTUDIES";
		CheckSubstringInArray c = new CheckSubstringInArray();

		System.out.println("enter the column length");
		int col = mc.nextInt();
		System.out.println("Enter the string to check");
		String string = mc.next();
		c.checkSubstring(str, col, string);

	}

	private void checkSubstring(String str, int col, String string) {

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
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == string.charAt(0)) {
					find(i, j, arr, string);
				}
			}
		}
	}

	private void print(char[][] arr) {
		for (char[] ch : arr) {
			for (char c : ch) {
				if (c != '\u0000')
					System.out.print(c + " ");
			}
			System.out.println();
		}

	}

	private void find(int i, int j, char[][] arr, String string) {
		int index = 0, k = i, l = j;
		boolean here = false;

		while (++index < string.length() && ++l < arr[k].length && arr[k][l] == string.charAt(index))
			;
		printout(index, string, i, j, k, l);
		index = 0;
		l = j;
		while (++index < string.length() && ++k < arr.length && arr[k][l] == string.charAt(index))
			;
		printout(index, string, i, j, k, l);
	}

	private void printout(int index, String string, int i, int j, int k, int l) {

		if (index == string.length()) {
			System.out.println("starts at <" + i + " ," + j + ">");
			System.out.println("ends   at <" + k + " ," + l + ">");
		}

	}

}
