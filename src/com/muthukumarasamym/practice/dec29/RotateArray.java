package com.muthukumarasamym.practice.dec29;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {

		RotateArray r = new RotateArray();
		System.out.println("enter the length of Array : ");
		Scanner mc = new Scanner(System.in);
		int num = mc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Element " + (i + 1) + " : ");
			arr[i] = mc.nextInt();
		}
		System.out.println("Number of Rotations : ");
		int rot = mc.nextInt();
		r.find(arr, rot, num);
	}

	private void find(int[] arr, int rot, int num) {

		if (arr.length == 0) {
			System.out.println("No output");
			return;
		}
		if (rot >= num) {
			rot = rot % num;

		}
		for (int i = 0; i < rot; i++) {

			int last = arr[num - 1];
			for (int j = num - 1; j > 0; j--) {

				arr[j] = arr[j - 1];
			}

			arr[0] = last;

		}
		System.out.println(Arrays.toString(arr));

	}

}
