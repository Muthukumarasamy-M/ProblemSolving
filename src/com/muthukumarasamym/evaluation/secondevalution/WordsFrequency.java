package com.muthukumarasamym.evaluation.secondevalution;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordsFrequency {

	public static void main(String[] args) {
//		Scanner mc= new Scanner(System.in);
		String str = "Write a java program that reads a text from the user and "
				+ "counts the frequency of each words in the list";
		str = str + " ";
		WordsFrequency w = new WordsFrequency();
		w.wordsFrequency(str);
	}

	private void wordsFrequency(String str) {
		Map<String, Integer> map = new HashMap<>();
		int start = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 32 && str.charAt(i) < 47)
				continue;
			if (i == str.length() - 1 || str.charAt(i) == ' ') {
				if (start < i) {
					String s = getSubstring(str, start, i);
					map.put(s, map.getOrDefault(s, 0) + 1);
				}
				start = i + 1;
			}
		}
		print(map);
		sortMapByValues(map);

	}

	private String getSubstring(String str, int start, int end) {
		char[] substringChars = new char[end - start];
		for (int i = start, j = 0; i < end; i++, j++) {
			substringChars[j] = str.charAt(i);
		}
		return new String(substringChars);
	}

	private static void sortMapByValues(Map<String, Integer> map) {

		Map.Entry<String, Integer>[] entries = map.entrySet().toArray(new Map.Entry[0]);

		for (int i = 0; i < entries.length - 1; i++) {
			for (int j = i + 1; j < entries.length; j++) {
				if (entries[i].getValue() < entries[j].getValue()) {

					Map.Entry<String, Integer> temp = entries[i];
					entries[i] = entries[j];
					entries[j] = temp;
				}
			}
		}
		descendingPrint(entries);
	}

	private static void descendingPrint(Entry<String, Integer>[] entries) {

		System.out.println("\n\nThe Descending Order\n");
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.print(entry.getKey() + " - " + entry.getValue() + ", ");
		}
	}

	private void print(Map<String, Integer> map) {

		for (Entry<String, Integer> EntrySet : map.entrySet()) {
			System.out.print(EntrySet.getKey() + " - " + EntrySet.getValue() + ", ");
		}
	}
}
