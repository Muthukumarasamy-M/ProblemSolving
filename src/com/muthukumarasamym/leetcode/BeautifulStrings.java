package com.muthukumarasamym.leetcode;


import java.util.HashSet;

public class BeautifulStrings {

	public static void main(String[] args) {
		String s="bacd";
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				set.add(s.substring(i, j + 1));
			}
		}
		System.out.println(set);
	}

}
