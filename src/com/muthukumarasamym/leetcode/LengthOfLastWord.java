package com.muthukumarasamym.leetcode;

import java.util.*;

//import java.util.Scanner;

public class LengthOfLastWord {

	public static void main(String[] args) {
//		Scanner mc= new Scanner(System.in);
//		System.out.println("Enter the string");
//		String s=mc.nextLine();
//		System.out.println("num= "+ lengthOfLastWord(s));
		int[] array = {10, 20, 30, 40, 50};
		int target = 30;

		int index = java.util.Arrays.asList(array).indexOf(target);
		System.out.println(index != -1 ? "Index of " + target + ": " + index : target + " not found in the array");

	}
	public  static int lengthOfLastWord(String s) {
		
		String[] words = s.split("\\s+");
		return words[words.length - 1].length();

    }

}
