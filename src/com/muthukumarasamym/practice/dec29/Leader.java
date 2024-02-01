package com.muthukumarasamym.practice.dec29;

import java.util.Scanner;
import java.util.Stack;

public class Leader {
	public static void main(String[] args) {

		Leader l = new Leader();
		System.out.println("enter the length of Array : ");
		Scanner mc = new Scanner(System.in);
		int num = mc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Element " + (i + 1) + " : ");
			arr[i] = mc.nextInt();                             // 16 17 4 3 5 2
		}
		l.find(arr);

	}

	private void find(int[] arr) {

		if (arr.length == 0) {
			System.out.println("No ouput");
			return;
		}
		
		int max = Integer.MIN_VALUE;
		Stack<Integer> stack = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > max) {
				stack.push(arr[i]);
				max = arr[i];
			}
		}
		print(stack);

	}                 
	private void print(Stack<Integer> stack) {
		System.out.print("Output : ");
		
		for (int i = stack.size() - 1; i >= 0; i--) {
			if (i == 0)
				System.out.print("and " + stack.pop());
			else if (i == 1)
				System.out.print(stack.pop() + " ");
			else
				System.out.print(stack.pop() + ", ");
		}

	}

}
