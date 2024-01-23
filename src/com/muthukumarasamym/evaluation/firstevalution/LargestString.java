package com.muthukumarasamym.evaluation.firstevalution;

import java.util.*;

public class LargestString {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);

		System.out.print("Enter the number of strings to be entered =");
		int n = mc.nextInt();
		String strings[] = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the string" + (i + 1) + " :");
			strings[i] = mc.next();
		}
		
		Arrays.sort(strings,(a, b) -> Integer.compare(b.length(),a.length()));
		
		for (int i = 0; i < n; i++) {
			char[] array = strings[i].toCharArray();
			Arrays.sort(array);
			String str = "";
			for (int j = array.length - 1; j >= 0; j--)
				str += "" + array[j];
			strings[i] = str;
		}
		for (int i = 0; i < n; i++) {
			System.out.println("String " + (i + 1) + " :" + strings[i]);
		}
	}

}
