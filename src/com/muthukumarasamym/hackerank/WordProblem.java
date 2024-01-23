package com.muthukumarasamym.hackerank;

public class WordProblem {

	public static void main(String[] args) {

		String s = "HashAgile";
		WordProblem w = new WordProblem();
		w.findWords(s);
	}

	private void findWords(String s) {

		int index = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) - 'A' < 26) {
				index = i;
				break;
			}

		}
		int n = index;
		String word1 = "", word2 = "";
		s = s.toUpperCase();
		for (int i = 0; i < index || n < s.length(); i++, n++) {
			if (i < index)
				word1 += s.charAt(i);
			
			if (n < s.length())
				word2 += s.charAt(n);
			
			System.out.println(word1 + word2);
		}
	}
}
