package com.muthukumarasamym.problems.dec29;

import java.util.Scanner;

public class TimetoSellStack {

	public static void main(String[] args) {
		System.out.println("enter the length of Array : ");
		Scanner mc = new Scanner(System.in);
		int num = mc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Element " + (i + 1) + " : ");
			arr[i] = mc.nextInt();
		}
		TimetoSellStack t = new TimetoSellStack();
		t.find(arr);
	}

	private void find(int[] arr) {

		if (arr.length == 0) {
			System.out.println("No output");
			return;
		}
		int cur = arr[0], curprofit = 0, max = 0;
		for (int i = 1; i < arr.length; i++) {

			curprofit = arr[i] - cur;
			if (curprofit > max)
				max = curprofit;
			if (cur > arr[i])
				cur = arr[i];

		}
		System.out.println(" Max profit : " + max);

	}

}
