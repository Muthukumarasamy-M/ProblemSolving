package com.muthukumarasamym.practice.dec29;

import java.util.Scanner;

public class DivideBythree {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		String num = mc.nextLine();

		DivideBythree d = new DivideBythree();
		d.find(num);
	}

	private void find(String num) {

		int cur = 0, prev = 0;
		for (int i = 0; i < num.length(); i++) {
			int n = num.charAt(i) - '0';
			if (prev > 0) {
				prev = prev * 10 + n;
				cur = prev % 3;
			} else {
				cur = n % 3;
			}
			prev = cur;

		}
		if (prev != 0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}
