package com.muthukumarasamym.leetcode;

import java.util.*;

public class SplitStringsSeparator {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("$easy$","$problem$");
		String s = "$";

		System.out.println(splitWordsBySeparator(list, s));

	}

	public static List<String> splitWordsBySeparator(List<String> words, String s) {
		List<String> k = new ArrayList<>();
		String p = "";
		char x=s.charAt(0);
		for (int i = 0; i < words.size(); i++) {
			p = "";
			String str=words.get(i);
			for (int j=0;j<str.length();j++) {
				
					if(str.charAt(j)!=x)
						p+=str.charAt(j);
					else {
						k.add(p);
						p="";
					}	     
			}
			k.add(p);
		}
		k.replaceAll(null);
		return k;
	}
}
