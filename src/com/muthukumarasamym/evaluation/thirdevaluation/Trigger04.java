package com.muthukumarasamym.evaluation.thirdevaluation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Trigger04 {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("Dimension of Dungeon (row X col) : ");
		int row = mc.nextInt(), col = mc.nextInt();
		System.out.println("Position of adventurer : ");
		int arow = mc.nextInt(), acol = mc.nextInt();
		System.out.println("Postion of Monster : ");
		int mrow = mc.nextInt(), mcol = mc.nextInt();
		System.out.println("Position of Trigger : ");
		int trow = mc.nextInt(), tcol = mc.nextInt();
		System.out.println("Position of Gold : ");
		int grow = mc.nextInt(), gcol = mc.nextInt();
		if (arow < 1 || arow > row || acol < 1 || acol > col || mrow < 1 || mrow > row || mcol < 1 || mcol > col
				|| grow < 1 || grow > row || gcol < 1 || gcol > col || trow < 1 || tcol > col) {
			System.out.println("Invalid input. Positions should be within the dungeon boundaries.");
			return;
		}
		int[][] arr = new int[row][col];
		Point adventureStart = new Point(arow - 1, acol - 1, 0);
		Point goldEnd = new Point(grow - 1, gcol - 1, 0);
		Point monsterStart = new Point(mrow - 1, mcol - 1, 0);
		Point[][] parent = new Point[row][col];
		int adventuremin = shortestPath(arr, adventureStart, goldEnd, parent);
		int monstermin = shortestPath(arr, monsterStart, goldEnd, parent);
		System.out.println(adventuremin + " " + monstermin);
		if (adventuremin > monstermin) {
			Point trigger = new Point(trow - 1, tcol - 1, 0);
			Point[][] parent1 = new Point[row][col];
			int Adventotrigger = shortestPath(arr, adventureStart, trigger, parent1);
			int triggertogold = shortestPath(arr, trigger, goldEnd, parent1);
			System.out.println("Minimum number of steps (Adventurer -> trigger -> gold) is  : "
					+ (Adventotrigger + triggertogold));
		} else {
			System.out.println("Minimum number of steps is (Adventurer -> gold) : " + adventuremin);

		}

	}

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

	public static void printPointArray(Point[][] array) {
		int rows = array.length;
		int cols = array[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				Point point = array[i][j];
				System.out.print("(" + (point.x + 1) + ", " + (point.y + 1) + ", " + point.distance + ") ");
			}
			System.out.println();
		}
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
