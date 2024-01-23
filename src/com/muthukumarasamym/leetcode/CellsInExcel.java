package com.muthukumarasamym.leetcode;

import java.util.*;

public class CellsInExcel {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("enter the string{format   A1:C2}");
		String s = mc.next();
		System.out.println(method1(s).toString());

	}

	private static List<String> method1(String s) {

		ArrayList<String> arr = new ArrayList<>();

		char a = s.charAt(0);
		char b = s.charAt(3);
		char n1 = s.charAt(1);
		char n2 = s.charAt(4);

		
		for (int i = 0; i <= b - a; i++) {
			char k = (char) (a + i);
			String str = "" + k + n1;
			arr.add(str);
			int o=n1;
			for (int j = 0; j < n2 - n1; j++) {
				String st = "" + (k) + (char) (++o);
				arr.add(st);
			}

		}
		return arr;
	}

}
