package com.muthukumarasamym.leetcode;

import java.util.Arrays;

public class MaximumNumberOfCoins {

	public static void main(String[] args) {
		
		int array[]= {9,8,7,6,5,1,2,3,4};
		
		System.out.println( maxCoins(array));
	}
	public static int maxCoins(int[] piles) {
		Arrays.sort(piles);
		int max=0;
		for(int i=piles.length-2;i>=piles.length/3;i-=2)
		{
			max+=piles[i];
		}
		return max;
        
    }

}
