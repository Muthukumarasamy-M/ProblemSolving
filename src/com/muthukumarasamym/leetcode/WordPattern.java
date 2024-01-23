package com.muthukumarasamym.leetcode;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat dog";

		WordPattern w = new WordPattern();
		w.wordPattern(pattern, str);
	}

	public boolean wordPattern(String pattern, String str) {

		String s[] = str.split(" ");

		HashMap<Character, String> map = new HashMap<>();
		if (s.length != pattern.length())
			return false;
		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			if (map.containsKey(c)) {
				if (!map.get(c).equals(s[i]))
					return false;
			} else {
				if (map.containsValue(s[i]))
					return false;
				map.put(c, s[i]);
			}

		}
		return true;

	}

}
