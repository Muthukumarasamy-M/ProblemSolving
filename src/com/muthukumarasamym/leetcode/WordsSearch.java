package com.muthukumarasamym.leetcode;

public class WordsSearch {

	public static void main(String[] args) {

		char[][] charArr = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

		String str = "ABCCED";

		WordsSearch w = new WordsSearch();
		System.out.println(w.exist(charArr, str));

	}

	public boolean exist(char[][] arr, String word) {

		int m = arr.length, n = arr[0].length;
		if (m * n < word.length())
			return false;

		char chy[] = word.toCharArray();
		int boardf[] = new int[128];
		for (char[] ch : arr) {

			for (char cha : ch) {
				boardf[cha]++;
			}
		}
		for (char ch : chy) {

			if (boardf[ch] <= 0)
				return false;
			boardf[ch]--;
		}
		if (boardf[chy[0]] > boardf[chy[chy.length - 1]])
			reverse(chy);

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (chy[0] == arr[i][j] && found(arr, i, j, chy, new boolean[m][n], 0))
					return true;
			}
		}
		return false;

	}

	private void reverse(char[] word) {
		int n = word.length;
		for (int i = 0; i < n / 2; ++i) {
			char temp = word[i];
			word[i] = word[n - i - 1];
			word[n - i - 1] = temp;
		}
	}

	private boolean found(char[][] arr, int row, int col, char[] word, boolean[][] visited, int index) {
		int dir[] = { 0, -1, 0, 1, 0 };

		if (index == word.length)
			return true;
		if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length || arr[row][col] != word[index]
				|| visited[row][col])
			return false;

		visited[row][col] = true;
		for (int i = index; i < 4; i++) {
			if (found(arr, row + dir[i], col + dir[i + 1], word, visited, index + 1))
				return true;
		}
		visited[row][col] = false;
		return false;
	}

}
