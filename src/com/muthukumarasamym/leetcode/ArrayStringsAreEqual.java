package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayStringsAreEqual {

	public static void main(String[] args) {

		String str[] = { "ab", "c" };
		String str1[] = { "a", "bc" };
//		System.out.println(arrayStringsAreEqual(str, str1));
//		System.out.println(arrayStringsAreEqual1(str, str1));

;

	}
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

		return String.join("", word2).equals(String.join("", word1));
	}
	
	public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
	 StringBuilder s= new StringBuilder();
     StringBuilder s1 = new StringBuilder();
     for(int i=0;i<word1.length;i++)
     {
         s.append(word1[i]);
     }
     for(int i=0;i<word2.length;i++)
     {
         s1.append(word2[i]);
     }
     return ((s.toString()).equals(s1.toString()));

	}
}
