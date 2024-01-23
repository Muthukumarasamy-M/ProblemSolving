package com.muthukumarasamym.leetcode;
import java.util.ArrayList;
import java.util.List;

public class StringPermutationCombination {

    public static void main(String[] args) {
        String input = "abc";

        System.out.println("Permutations:");
        generatePermutations("", input);
    }

    // Generate permutations of a string
    private static void generatePermutations(String prefix, String remaining) {
        int n = remaining.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n));
            }
        }
    }

    // Generate combinations of a string
   
}

