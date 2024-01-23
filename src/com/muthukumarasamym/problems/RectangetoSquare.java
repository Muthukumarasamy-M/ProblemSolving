package com.muthukumarasamym.problems;

import java.util.Scanner;

public class RectangetoSquare {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int l = mc.nextInt();
		System.out.println("Enter the breadth : ");
		int b = mc.nextInt();

		RectangetoSquare r = new RectangetoSquare();
		r.find(l, b);
	}

	private void find(int l, int b) {

		int num = Math.min(l, b), tot = l * b, cur = 0;

		while (num >= 1) {
			if ((tot % (num * num)) == 0) {
				cur = num * num;
				break;
			}
			System.out.println(num+" "+cur);
			num--;
		}
		System.out.println("Output : " + (tot / cur));

	}

}
