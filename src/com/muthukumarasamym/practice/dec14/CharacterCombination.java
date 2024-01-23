package com.muthukumarasamym.practice.dec14;

	//Write a program to find the combination of all the characters in a string.
public class CharacterCombination {

	public static void main(String[] args) {

		String s = "abc";
		CharacterCombination c = new CharacterCombination();
		c.generateCombination(s);

	}

	private void generateCombination(String s) {

		generate(s, 0, new StringBuilder());

	}

	private void generate(String s, int index, StringBuilder stringb) {

		System.out.println("{" + stringb.toString() + "}");

		for (int i = index; i < s.length(); i++) {
			
			stringb.append(s.charAt(i));

			generate(s, i + 1, stringb);

			stringb.deleteCharAt(stringb.length() - 1);
		}

	}

}
