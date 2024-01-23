package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class Sort2D {

	public static void main(String[] args) {
		int[][] twoDArray = {
	            {40, 30, 20},
	            {10, 50, 60},
	            {70, 80, 90}
	        };
		sort(twoDArray);
		sort2DArray(twoDArray);
	}
	public  static void sort(int [][]twoDArray) {
		  int[] flattenedArray = Arrays.stream(twoDArray).flatMapToInt(Arrays::stream).toArray();

		  Arrays.sort(flattenedArray);
	       
		  for (int i = 0, k = 0; i < twoDArray.length; i++) {
	            for (int j = 0; j < twoDArray[i].length; j++) {
	                twoDArray[i][j] = flattenedArray[k++];
	            }
	        }

	        // Print the sorted 2D array
	        for (int[] row : twoDArray) {
	            System.out.println(Arrays.toString(row));
	        }
	    }
	 private static void sort2DArray(int[][] array) {
	        int rows = array.length;
	        int cols = array[0].length;

	        
	        int[] flattenedArray = new int[rows * cols];
	        
	        for (int i = 0, k = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                flattenedArray[k++] = array[i][j];
	            }
	        }

	        for (int i = 0; i < flattenedArray.length - 1; i++) {
	            for (int j = 0; j < flattenedArray.length - 1 - i; j++) {
	                if (flattenedArray[j] > flattenedArray[j + 1]) {
	                    // Swap elements if they are in the wrong order
	                    int temp = flattenedArray[j];
	                    flattenedArray[j] = flattenedArray[j + 1];
	                    flattenedArray[j + 1] = temp;
	                }
	            }
	        }
	        
	        
	        for (int i = 0, k = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                array[i][j] = flattenedArray[k++];
	            }
	        }

}}
