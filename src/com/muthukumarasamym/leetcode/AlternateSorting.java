package com.muthukumarasamym.leetcode;
import java.util.Arrays;
import java.util.Arrays;

public class AlternateSorting {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        inPlaceAlternateSortPairs(arr);

        System.out.println("In-Place Alternate Sorted Pairs: " + Arrays.toString(arr));
    }

    private static void inPlaceAlternateSortPairs(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order

        int n = arr.length;

        for (int i = 0; i < n - 1; i += 2) {
            // Swap adjacent elements in pairs starting from the beginning
            swap(arr, i, i + 1);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
