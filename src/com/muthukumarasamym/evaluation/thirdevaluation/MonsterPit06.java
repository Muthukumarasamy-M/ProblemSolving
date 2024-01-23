package com.muthukumarasamym.evaluation.thirdevaluation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class MonsterPit06 {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Dimension of Dungeon (row X col) : ");
		int row = mc.nextInt(), col = mc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Position of adventurer : ");
		int arow = mc.nextInt(), acol = mc.nextInt();
		System.out.println("Postion of Monster : ");
		int mrow = mc.nextInt(), mcol = mc.nextInt();
		System.out.println("Position of Gold : ");
		int grow = mc.nextInt(), gcol = mc.nextInt();
		System.out.println("Enter the number of pits : ");
		int n = mc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Position of pit " + (i + 1) + " :");
			int x = mc.nextInt();
			int y = mc.nextInt();
			arr[x - 1][y - 1] = 1;
		}
		Point adventureStart = new Point(arow - 1, acol - 1, 0);
		Point goldEnd = new Point(grow - 1, gcol - 1, 0);
		Point monsterStart = new Point(mrow - 1, mcol - 1, 0);
		Point[][] parent = new Point[row][col];
		int adventuremin = shortestPath(arr, adventureStart, goldEnd, parent, 'a');
		int monstermin = shortestPath(arr, monsterStart, goldEnd, parent, 'm');
		System.out.println(adventuremin + " " + monstermin);
		if (monstermin < adventuremin) {
			System.out.println("No possible solution ");
		} else {

			System.out.println("Minimum number of steps : " + adventuremin);
		}

	}

	public static int shortestPath(int[][] matrix, Point start, Point end, Point[][] parent, char c) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean[][] visited = new boolean[rows][cols];
		Queue<Point> queue = new LinkedList<>();
		queue.add(start);
		visited[start.x][start.y] = true;

		int[] dx = { -1, 1, 0, 0 }; // Changes in x-direction (up, down, left, right)
		int[] dy = { 0, 0, -1, 1 }; // Changes in y-direction (up, down, left, right)

		while (!queue.isEmpty()) {
			Point current = queue.poll();

			if (current.x == end.x && current.y == end.y) {
				return current.distance;
			}

			for (int i = 0; i < 4; i++) {
				int newX = current.x + dx[i];
				int newY = current.y + dy[i];

				boolean isValidMove = isValid(newX, newY, rows, cols) && !visited[newX][newY];

				if (c == 'a' && isValidMove && matrix[newX][newY] == 0) {
					queue.add(new Point(newX, newY, current.distance + 1));
					visited[newX][newY] = true;
					parent[newX][newY] = current;
				} else if (c == 'm' && isValidMove && (matrix[newX][newY] == 0 || matrix[newX][newY] == 1)) {
					queue.add(new Point(newX, newY, current.distance + 1));
					visited[newX][newY] = true;
					parent[newX][newY] = current;
				}
			}
		}

		return -1; // No path found
	}

	private static boolean isValid(int newX, int newY, int rows, int cols) {

		return newX >= 0 && newX < rows && newY >= 0 && newY < cols;
	}

	static void printPath(Point[][] parent, Point start, Point end) {
		System.out.print("The shortest path is: ");
		Point current = end;
		while (current != null && (current.x != start.x || current.y != start.y)) {
			System.out.print("(" + (current.x + 1) + ", " + (current.y + 1) + ") ");
			current = parent[current.x][current.y];
		}
		System.out.println("(" + (start.x + 1) + ", " + (start.y + 1) + ")"); // Print the starting point
		System.out.println();
	}
}
