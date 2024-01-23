package com.muthukumarasamym.practice.dec13;

import java.util.Scanner;

/*
Prime Number Generator:
Write a Java program to generate prime numbers within a specified range. 
Allow the user to input the range and output all prime numbers within that range.*/
public class PrimeNumberGenerator {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the Range");
		int num = mc.nextInt();
		PrimeNumberGenerator p = new PrimeNumberGenerator();
		p.numberGenerator(num);

	}

	private void numberGenerator(int num) {

		for (int i = 1; i <= num; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}

	}

	private boolean isPrime(int num) {
		boolean b = false;
		if (num == 1)
			return false;
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0)
				return false;

		}
		return true;
	}

}
