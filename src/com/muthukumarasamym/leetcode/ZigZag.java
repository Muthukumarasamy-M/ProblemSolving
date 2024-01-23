package com.muthukumarasamym.leetcode;

public class ZigZag {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int n = 3;
		ZigZag z = new ZigZag();
		z.zigZag(s, n);
	}

	private void zigZag(String s, int rows) {

		int column = 2 * rows;
		int index = 0, i = 0, j = 0;
		char array[][] = new char[rows][(s.length()/rows)+3];
		while (index < s.length()) {
			while (index < s.length()) {
				if (i == 0) {
					while (i < rows && index < s.length()) {
						array[i][j] = s.charAt(index);
						index++;
						i++;
					}
				}
				if (i == rows) {
					i--;
					while (i > 0 && index < s.length()) {
						i--;
						j++;
						array[i][j] = s.charAt(index);
						index++;
					}
				}
				if (index < s.length())
					index--;
				else
					break;
			}
		}
		print(array);
	}

	private void print(char[][] array) {
		String s="";
		for(char arr[]:array) {
			for(char c:arr)
			{
				if(c!='\u0000')
					s+=c;
	
			}
		}
		System.out.println(s);

	}
}
