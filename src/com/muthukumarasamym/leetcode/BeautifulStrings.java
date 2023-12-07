package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class BeautifulStrings {

	public static void main(String[] args) {
		String s="aba";
		HashSet<String> set = new HashSet<>();
		char arr[] = s.toCharArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		String str=new String(arr);
		System.out.println(str);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				set.add(str.substring(i, j + 1));
			}
		}
		System.out.println(set);
	}

}
