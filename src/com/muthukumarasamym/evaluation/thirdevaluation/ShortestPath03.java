package com.muthukumarasamym.evaluation.thirdevaluation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPath03 {

	public static int shortestPath(int[][] matrix, Point start, Point end, Point[][] parent) {
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

				if (isValid(newX, newY, rows, cols) && !visited[newX][newY] && matrix[newX][newY] == 0) {
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
		while (current != null) {
			System.out.print("(" + current.x + ", " + current.y + ") ");
			current = parent[current.x][current.y];
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Dimension of Dungeon (row X col) : ");
		int row = mc.nextInt(), col = mc.nextInt();
		System.out.println("Position of adventurer : ");
		int arow = mc.nextInt(), acol = mc.nextInt();
		System.out.println("Postion of Monster : ");
		int mrow = mc.nextInt(), mcol = mc.nextInt();
		System.out.println("Position of Gold : ");
		int grow = mc.nextInt(), gcol = mc.nextInt();
		if (arow < 1 || arow > row || acol < 1 || acol > col || mrow < 1 || mrow > row || mcol < 1 || mcol > col
				|| grow < 1 || grow > row || gcol < 1 || gcol > col) {
			System.out.println("Invalid input. Positions should be within the dungeon boundaries.");
			return;
		}
		int[][] matrix = new int[row][col];
		matrix[mrow - 1][mcol - 1] = 1;
		Point adventurerStart = new Point(arow, acol, 0);
		Point goldEnd = new Point(grow, gcol - 1, 0);
		Point[][] parent = new Point[row][col];
		int adventurerToGold = shortestPath(matrix, goldEnd, adventurerStart, parent);

		Point monsterStart = new Point(mrow - 1, mcol - 1, 0);
		int monsterToGold = shortestPath(matrix, goldEnd, monsterStart, parent);

		if (adventurerToGold != -1 && (monsterToGold == -1 || adventurerToGold < monsterToGold)) {
			printPath(parent, goldEnd, adventurerStart);
			System.out.println("The shortest path for adventurer is: " + adventurerToGold + " steps.");
		} else {
			System.out.println("No or longer path found for adventurer.");
		}
	}
}
