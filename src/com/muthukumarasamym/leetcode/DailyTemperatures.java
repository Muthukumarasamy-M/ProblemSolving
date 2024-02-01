package com.muthukumarasamym.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class DailyTemperatures {

	public static void main(String[] args) {

		int[] arr = { 73, 74, 75, 71, 69, 72, 76, 73 };

		String s = "asdfasd";
		s="asdfas";
		System.out.println(s);
		DailyTemperatures d = new DailyTemperatures();
		d.find(arr);
	}

	private void find(int[] arr) {

		int array[] = new int[arr.length];
		LinkedList<Integer> stack = new LinkedList<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (stack.isEmpty()) {
				stack.push(i);
				array[i] = 0;
			} else {
				while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
					stack.pop();
				}
				if (stack.isEmpty()) {
					array[i] = 0;
				} else
					array[i] = stack.peek() - i;

			}
			stack.push(i);
		}
		System.out.println(Arrays.toString(array));
	}

}