package com.muthukumarasamym.practice.dec13;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/*Word Frequency Counter:
Design a program that takes a paragraph of text as input and outputs the frequency of each 
word.Ignore punctuation and consider case-insensitivity.*/
public class WordFrequencyCounter {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		String str = "Write ,a java program/. that reads a text from the user and "
				+ "counts the frequency of each words in the list";

		WordFrequencyCounter w = new WordFrequencyCounter();
		w.frequencyCounter(str.toLowerCase());
	}

	private void frequencyCounter(String str) {
		Map<String, Integer> map = new TreeMap<>();
		int start = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1 || str.charAt(i) == ' ' || str.charAt(i) <= 47) {
				if (start < i) {
					String s = getSubstring(str, start, i);
					map.put(s, map.getOrDefault(s, 0) + 1);
				}
				start = i + 1;
			}
		}
		print(map);

	}

	private String getSubstring(String str, int start, int end) {

		char[] substringChars = new char[end - start];
		for (int i = start, j = 0; i < end; i++, j++) {
			substringChars[j] = str.charAt(i);
		}
		return new String(substringChars);
	}

	private void print(Map<String, Integer> map) {
		for (Entry<String, Integer> map1 : map.entrySet()) {
			System.out.println(map1.getKey() + " " + map1.getValue());
		}
	}

}
