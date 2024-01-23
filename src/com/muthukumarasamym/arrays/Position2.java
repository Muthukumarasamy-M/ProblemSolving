package com.muthukumarasamym.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Position2 {
	static int[] assign(int arr[], int n) {
		Arrays.sort(arr);
		int k = n - 1; // if odd number rearrange from last number;
						// even number :rearrange from last before one;
		if (n % 2 == 0)
			k = n - 2;
		for (int i = k; i >= 0; i -= 2) {
			for (int j = i - 1; j >= 0; j--) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				System.out.println(Arrays.toString(arr));
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the element");
		int num = mc.nextInt();
		int array[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			array[i] = mc.nextInt();
		}
		
		System.out.println(Arrays.toString(assign(array, num)));

		mc.close();

	}

}
