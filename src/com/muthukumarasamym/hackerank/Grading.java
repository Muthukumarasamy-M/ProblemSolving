package com.muthukumarasamym.hackerank;

import java.util.*;

public class Grading {
	public static List<Integer> gradingStudents(List<Integer> array) {
		int n = array.size();
		for (int i = 0; i < n; i++) {
			int x = array.get(i);
			if (x > 37 && x % 5 > 2) {
				int y = (x / 5) + 1;
				array.set(i, 5 * y);
			}

		}
		return array;
	}

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the length of list");
		int n = mc.nextInt();
		List<Integer> arr = new ArrayList<>();
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			int x = mc.nextInt();
			arr.add(x);
		}
		System.out.println(gradingStudents(arr));

	}

}
