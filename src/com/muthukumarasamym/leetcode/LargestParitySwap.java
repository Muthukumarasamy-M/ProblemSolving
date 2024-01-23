package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class LargestParitySwap {

	public static void main(String[] args) {

		System.out.println("enter the value");
		Scanner mc = new Scanner(System.in);
		int n = mc.nextInt();
		System.out.println(largestInteger(n));

	}

	private static int summarize(int[] digits, int length) {
		int result = 0;

		int multiplier = 1;
		for (int i = length - 1; i >= 0; i--) {
			result += digits[i] * multiplier;
			multiplier *= 10;
		}

		return result;
	}

	public static int largestInteger(int num) {
		int result = num;

		// calc length
		int temp = num;
		int length = 0;
		while (temp > 0) {
			++length;
			temp /= 10;
		}

		// fill the digits array
		final int[] digits = new int[length];
		int index = length;
		while (num > 0) {
			digits[--index] = num % 10;
			num /= 10;
		}

		for (index = 0; index < length - 1; index++) {
			// find the max digit with the same parity
			final int parity = digits[index] % 2;
			int max = digits[index];
			int swapIndex = 0;
			for (int i = index + 1; i <= length - 1; i++) {
				final int digit = digits[i];
				if ((digit % 2 == parity) && (digit > max)) {
					max = digit;
					swapIndex = i;
				}
			}

			// swap them
			if (max > digits[index]) {
				digits[index] += digits[swapIndex];
				digits[swapIndex] = digits[index] - digits[swapIndex];
				digits[index] -= digits[swapIndex];
			}

			final int candidate = summarize(digits, length);
			if (candidate > result) {
				result = candidate;
			}
		}
		return result;
	}

}
