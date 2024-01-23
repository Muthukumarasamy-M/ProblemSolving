package com.muthukumarasamym.practice.jan13;

import java.util.Scanner;

public class NthFibbonacciNumber {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.print("Enter the input : ");

		int num = mc.nextInt();
		NthFibbonacciNumber n = new NthFibbonacciNumber();

		System.out.println(num + "th fibbonacci number's last element is : "+ n.fibo(num));

	}

	private int fibo(int num) {

		int x = 0, y = 1, z = 1;
		if (num < 2)
			return num;
		else {
			for (int i = 2; i <= num; i++) {
				x=y;
				y=z;
				z = y+x;
			}
		}
		return y%10;

	}
}
