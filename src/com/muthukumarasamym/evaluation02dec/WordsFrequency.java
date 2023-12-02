package com.muthukumarasamym.evaluation02dec;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordsFrequency {

	public static void main(String[] args) {
//		Scanner mc= new Scanner(System.in);
		String str = "Write a java program that reads a text from the user and counts the frequency "
				+ "of each words in the list";
		str = str + " ";
		WordsFrequency w = new WordsFrequency();
		w.wordsFrequency(str);
	}
	
	private void wordsFrequency(String str) {
		Map<String,Integer>map = new HashMap<>();
		int start = 0, end = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() || str.charAt(i) == ' ') {
				if (start < i) {
					String s=getSubstring(str, start, i);
					map.put(s,map.getOrDefault(s,0)+1);
				}
				start = i + 1;
			}
		}
		print(map);
	}
	private void print(Map<String, Integer> map) {

		for (Entry<String, Integer> EntrySet : map.entrySet()) {
			System.out.println(EntrySet.getKey() + " - " + EntrySet.getValue());
		}
	}

	private String getSubstring(String str, int start, int end) {
		char[] substringChars = new char[end - start];
		for (int i = start, j = 0; i < end; i++, j++) {
			substringChars[j] = str.charAt(i);
		}
		return new String(substringChars);
	}
}
