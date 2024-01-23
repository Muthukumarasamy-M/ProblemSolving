package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class FindWordsFormedByChar {

	public static void main(String[] args) {

		String s[] = { "hello", "world", "leetcode" };
		String a = "welldonehoneyr";
		FindWordsFormedByChar f = new FindWordsFormedByChar();
		System.out.println(f.countCharacters(s, a));
		System.out.println(f.countCharacters1(s, a));
	}

	public int countCharacters(String[] words, String chars) {
  
		char[] cha = chars.toCharArray();
		Arrays.sort(cha);
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			char[] arr = words[i].toCharArray();
			Arrays.sort(arr);
			if (check(arr, cha)) {
				count += arr.length;
			}
		}
		return count;

	}
	public int countCharacters1(String[] words, String chars) {
		
		
		int cha[]= new int[26];
		for(int i=0;i<chars.length();i++)
			cha[chars.charAt(i)-'a']++;
		System.out.println(Arrays.toString(cha));
		
		
		return 0;
		
		
		
	}
	

	private boolean check(char[] arr, char[] cha) {

		int index = 0;
		for (int i = 0; index < arr.length && i < cha.length; i++) {
			if (arr[index] == cha[i]) {
				index++;
			}
		}
		return index == arr.length;

	}

}
