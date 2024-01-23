package com.muthukumarasamym.hackerank;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathFinder {

    static class Point {
        int x, y, distance;

        Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    static boolean isValid(int x, int y, int rows, int cols) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

    static int shortestPath(int[][] matrix, Point start, Point end) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[][] visited = new boolean[rows][cols];
        Point[][] parent = new Point[rows][cols]; // to store parent information
        Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        visited[start.x][start.y] = true;

        int[] dx = {-1, 1, 0, 0}; // Changes in x-direction (up, down, left, right)
        int[] dy = {0, 0, -1, 1}; // Changes in y-direction (up, down, left, right)

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.x == end.x && current.y == end.y) {
                printPath(parent, start, end);
                return current.distance;
            }

            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (isValid(newX, newY, rows, cols) && !visited[newX][newY] && matrix[newX][newY] == 0) {
                    queue.add(new Point(newX, newY, current.distance + 1));
                    visited[newX][newY] = true;
                    parent[newX][newY] = current; // store the parent information
                }
            }
        }

        return -1; // No path found
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
        int[][] matrix = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        Point start = new Point(3, 3, 0);
        Point end = new Point(3, 0, 0);

        int result = shortestPath(matrix, start, end);

        if (result != -1) {
            System.out.println("The shortest path is: " + result + " steps.");
        } else {
            System.out.println("No path found.");
        }
    }
}
