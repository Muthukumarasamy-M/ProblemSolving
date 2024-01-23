package com.muthukumarasamym.evaluation.thirdevaluation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class FullDungeon07 {

	public static void main(String[] args) {
		FullDungeon07 f = new FullDungeon07();
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
		System.out.println("Enter the number of pits : ");
		int n = mc.nextInt();
		if (arow < 1 || arow > row || acol < 1 || acol > col || grow < 1 || grow > row || gcol < 1 || gcol > col) {
			System.out.println("Invalid input. Positions should be within the dungeon boundaries.");
			return;
		}
		int[][] arr = new int[row][col];
		for (int i = 0; i < n; i++) {
			System.out.println("Position of pit " + (i + 1) + " :");
			int x = mc.nextInt(), y = mc.nextInt();
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
			Point trigger = new Point(trow - 1, tcol - 1, 0);
			Point[][] parent1 = new Point[row][col];
			
			int Adventotrigger = shortestPath(arr, adventureStart, trigger, parent1, 'a');
			int triggertogold = shortestPath(arr, trigger, goldEnd, parent1, 'a');
			
			System.out.println("Minimum number of steps (Adventurer -> trigger -> gold) is  : "
					+ (Adventotrigger + triggertogold));

		} else {
			System.out.println("Minimum number of steps is (Adventurer -> gold) : " + adventuremin);
			printPath(parent, goldEnd, adventureStart);

		}
	}

	public static int shortestPath(int[][] matrix, Point start, Point end, Point[][] parent, char c) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean[][] visited = new boolean[rows][cols];
		Queue<Point> queue = new LinkedList<>();
		queue.add(start);
		visited[start.x][start.y] = true;

		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };

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

		return -1; // No path
	}

	private static boolean isValid(int newX, int newY, int rows, int cols) {

		return newX >= 0 && newX < rows && newY >= 0 && newY < cols;
	}

	static void printPath(Point[][] parent, Point start, Point end) {
	    System.out.print("The shortest path is: ");
	    LinkedList<Point> path = new LinkedList<>();
	    Point current = end;
	    
	    while (current != null && (current.x != start.x || current.y != start.y)) {
	        path.addFirst(current);
	    }
	    path.addFirst(start);
	    for (Point point : path) {
	        System.out.print("(" + (point.x + 1) + ", " + (point.y + 1) + ") ");
	    }

	    System.out.println();  
	}

}