package com.muthukumarasamym.practice.feb05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SnakeAndLadder {
	static class Cell {
		int row;
		int col;
		int distance;
		List<Integer> path;

		Cell(int row, int col, int distance, List<Integer> path) {
			this.row = row;
			this.col = col;
			this.distance = distance;
			this.path = new ArrayList<>(path);
		}
	}

	Scanner mc = new Scanner(System.in);

	public static void main(String[] args) {
		SnakeAndLadder s = new SnakeAndLadder();
		s.getValues();
	}

	private void getValues() {
		System.out.print("Enter the board size (EVEN):");
		int size = mc.nextInt();

		String board[][] = new String[size][size];
		int arr[][] = Zigzag(size);
		Arrays.stream(board).forEach(row -> Arrays.fill(row, "  "));

		System.out.print("Enter the number of snakes :");
		int snakes = mc.nextInt();
		EnterObstacles("snakes", board, snakes);

		System.out.print("Enter the number of Ladders :");
		int ladders = mc.nextInt();
		EnterObstacles("ladder", board, ladders);

		System.out.print("Enter the number of Players : ");
		int players = mc.nextInt();
		mc.nextLine();
		String name[] = new String[players];

		for (int i = 0; i < players; i++) {
			System.out.print("\nEnter the name of player " + (i + 1) + " : ");
			name[i] = mc.nextLine();
		}
		printArray(board);
		printArray(arr);
		System.out.println(Arrays.toString(name));

		System.out.println("Features:\n1.play\n2.MinSteps");
		int choice = mc.nextInt();
		switch (choice) {

		case 1:
			match(board, name, arr);
		case 2:
			List<Integer> path = minStepsToFinishBFSWithPath(board);
			System.out.println(path);
			System.out.println("min steps to reach : " + (path.size() - 1));

		}
	}

	private void match(String[][] board, String[] name, int arr[][]) {

		String cur = " ";
		int nlen = name.length, blen = board.length;
		String[] pos = new String[nlen];
		Arrays.fill(pos, "0,0");
		outer: do {

			for (int i = 0; i < nlen; i++) {

				int dice = (int) (Math.random() * 6) + 1;

				System.out.print(name[i] + " rolled a " + dice);

				String[] coords = pos[i].split(",");
				int row = Integer.parseInt(coords[0]);
				int col = Integer.parseInt(coords[1]);
				int orow = row, ocol = col;
				while (dice > 0) {
					if (row % 2 == 0) {
						if (dice + col < blen) {
							col += dice;
							dice = 0;
						} else {
							row++;
							int temp = blen - col;
							col = blen - 1;
							dice = dice - temp;
						}
					} else {
						if (col - dice >= 0) {
							col -= dice;
							dice = 0;
						} else {
							row++;
							dice = dice - col - 1;
							col = 0;
						}
					}
				}

				if ((row > blen - 1) | (col > blen - 1)) {
					row = orow;
					col = ocol;
				}

				if (!board[row][col].equals("  ")) {
					String[] newCoords = board[row][col].split(",");
					row = Integer.parseInt(newCoords[0]);
					col = Integer.parseInt(newCoords[1]);
				}
				pos[i] = "" + row + "," + col;
				System.out.println(" moved from (" + arr[orow][ocol] + ") to (" + arr[row][col] + ")  ");

				if (row == blen - 1 & col == 0) {
					System.out.println(name[i] + " wins the game !!!");
					break outer;
				}
			}
		} while (!board[blen - 1][0].equals(cur));
	}

	public List<Integer> minStepsToFinishBFSWithPath(String[][] board) {
		int rows = board.length;
		int cols = board[0].length;

		// Convert 2D board to 1D array for easier processing
		int n = rows * cols;
		int[] moves = new int[n];
		Arrays.fill(moves, -1);

		// Parse the board to identify snakes and ladders
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (!board[r][c].equals("  ")) {
					String[] parts = board[r][c].split(",");
					int nextRow = Integer.parseInt(parts[0]);
					int nextCol = Integer.parseInt(parts[1]);
					int currentPos = r * cols + c;
					int nextPos = nextRow * cols + nextCol;
					moves[currentPos] = nextPos;
				}
			}
		}

		boolean[] visited = new boolean[n];
		Queue<Cell> queue = new LinkedList<>();
		visited[0] = true;
		List<Integer> initialPath = new ArrayList<>();
		initialPath.add(0);
		queue.offer(new Cell(0, 0, 0, initialPath));

		while (!queue.isEmpty()) {
			Cell cell = queue.poll();
			int currentPos = cell.row * cols + cell.col;

			if (currentPos == n - 1)
				return cell.path;

			for (int i = currentPos + 1; i <= Math.min(currentPos + 6, n - 1); i++) {
				if (!visited[i]) {
					visited[i] = true;
					int nextPos = moves[i] == -1 ? i : moves[i];
					int nextRow = nextPos / cols;
					int nextCol = nextPos % cols;
					List<Integer> newPath = new ArrayList<>(cell.path);
					newPath.add(nextPos);
					queue.offer(new Cell(nextRow, nextCol, cell.distance + 1, newPath));
				}
			}
		}
		return null; // If there's no way to reach the end
	}

	private int[][] Zigzag(int size) {

		int[][] zigzagArray = new int[size][size];

		int value = 1;
		boolean direction = true;

		for (int i = 0; i < size; i++) {
			if (direction) {
				for (int j = 0; j < size; j++) {
					zigzagArray[i][j] = value++;
				}
			} else {
				for (int j = size - 1; j >= 0; j--) {
					zigzagArray[i][j] = value++;
				}
			}
			direction = !direction;
		}
		return zigzagArray;
	}

	private void EnterObstacles(String type, String[][] board, int length) {
		int len = board.length;
		for (int i = 0; i < length; i++) {

			System.out.println(type + ":" + (i + 1));
			System.out.print("Enter the position of top :");
			int t = mc.nextInt();
			int top[] = findarr(t, len);
			System.out.print("Enter the position of bottom :");
			int b = mc.nextInt();
			int bottom[] = findarr(b, len);

			if (type.equals("snakes"))
				board[top[0]][top[1]] = "" + bottom[0] + "," + bottom[1];
			else
				board[bottom[0]][bottom[1]] = "" + top[0] + "," + top[1];
		}
	}

	private int[] findarr(int search, int length) {

		int valueIndex = search - 1;
		int row = valueIndex / length;
		int col = 0;

		if (row % 2 == 0) {
			col = valueIndex % length;
		} else {
			col = length - 1 - (valueIndex % length);
		}
		if (row >= 0 && row < length && col >= 0 && col < length) {
			return new int[] { row, col };
		} else {
			System.out.println(search + " is not found in the array.");
		}
		return null;
	}

	private void printArray(int[][] array) {
		System.out.println();
		for (int[] row : array) {
			for (int cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}

	private void printArray(String[][] array) {
		System.out.println();
		for (String[] row : array) {
			for (String cell : row) {
				if (cell.equals("  "))
					System.out.print("-- ");
				else
					System.out.print(cell + " ");
			}
			System.out.println();
		}
	}

}
