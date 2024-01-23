package com.muthukumarasamym.leetcode;

//import java.util.Scanner;

public class GarbageCollection {

	public static void main(String[] args) {

//		Scanner mc = new Scanner(System.in);
//		System.out.println("Enter the number of strings");
//		int n=mc.nextInt();
//		String str[]= new String[n];
//		System.out.println("Enter the values");
//		for(int i=0;i<n;i++)
//			str[i]= mc.next();
		String str[] = { "G", "P", "GP", "GG" };

		int travel[] = { 2, 4, 3 };
		System.out.println(garbageCollection(str, travel));
	}

	public static int garbageCollection(String[] garbage, int[] travel) {

		int n = garbage.length;
		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			ans += 3 * travel[i];
		}
		for (String s : garbage) {
			ans += s.length();
		}
		for (int i = n - 1; i > 0; i--) {
			if (!garbage[i].contains("G")) {
				ans -= travel[i - 1];
			} else {
				break;
			}
		}
		for (int i = n - 1; i > 0; i--) {
			if (!garbage[i].contains("P")) {
				ans -= travel[i - 1];
			} else {
				break;
			}
		}
		for (int i = n - 1; i > 0; i--) {
			if (!garbage[i].contains("M")) {
				ans -= travel[i - 1];
			} else {
				break;
			}
		}
		return ans;

	}

}
