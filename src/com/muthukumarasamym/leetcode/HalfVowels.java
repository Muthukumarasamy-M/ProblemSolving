package com.muthukumarasamym.leetcode;
import java.util.Scanner;

public class HalfVowels {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = mc.nextLine();
		HalfVowels h = new HalfVowels();
		System.out.println((h.findVowels(str)));

	}

	private boolean findVowels(String str) {

		int mid = str.length() / 2;
		return find(str , 0 ,mid) == find(str, mid, str.length());
	}

	private int find(String str, int start, int end) {

		String s= "AEIOUaeiou";
		int num = 0;
		for (int i = start; i < end; i++) {
			if (s.indexOf((str.charAt(i)))!=-1)
				num++;
		}
		return num;
	}

}
