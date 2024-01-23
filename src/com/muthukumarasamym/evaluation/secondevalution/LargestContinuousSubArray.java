package com.muthukumarasamym.evaluation.secondevalution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestContinuousSubArray {

	public static void main(String[] args) {

		LargestContinuousSubArray l = new LargestContinuousSubArray();
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the length of array1");
		int len = mc.nextInt();      // { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int array[] = new int[len]; 
		System.out.println("Enter the values");
		for (int i = 0; i < len; i++)
			array[i] = mc.nextInt();
		l.continuousSubArray(array);
	}

	private void continuousSubArray(int[] array) {

		int cur = 0, max = Integer.MIN_VALUE;
		int start = 0, end = 0, s = 0;
		for (int i = 0; i < array.length; i++) {
			cur += array[i];

			if (cur > max) {
				max = cur;
				start = s;
				end = i;
			}
			if (cur < 0) {
				cur = 0;
				s = i + 1;
			}
		}
		System.out.println("Max :"+max);
		List<Integer> list = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			list.add(array[i]);
		}
		System.out.println(list);
	}
}
