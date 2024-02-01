package com.muthukumarasamym.practice.dec29;

public class Cross {

	public static void main(String[] args) {

		String s = "MUTHU";
		Cross c = new Cross();
		c.print(s);
	}

	private void print(String s) {

		char c[] = s.toCharArray();
		int mid = s.length() / 2;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i == mid)
					System.out.print(c[j]);
				else if (j == mid)
					System.out.print(c[i]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
