package com.muthukumarasamym.leetcode;

public class CharacterPermutation {

	public static void main(String[] args) {

		String s = "abc";
		CharacterPermutation c = new CharacterPermutation();

		c.permutations(s.toCharArray(), 0);

	}

	public void permutations(char[] chars, int index) {
		if (index == chars.length - 1) {
			System.out.println("== " + String.valueOf(chars));
			return;
		}
		for (int i = index; i < chars.length; i++) {

			char temp = chars[index];
			chars[index] = chars[i];
			chars[i] = temp;
			permutations(chars, index + 1);

			temp = chars[index];
			chars[index] = chars[i];
			chars[i] = temp;
		}
	}

}
