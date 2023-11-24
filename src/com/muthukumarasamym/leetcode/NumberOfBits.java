package com.muthukumarasamym.leetcode;

public class NumberOfBits {

	public static void main(String[] args) {
	
		int n= 0b11111111111111111111111111111101;
		
		System.out.println(hammingWeight(n));
	}
	 public static int hammingWeight(int n) {
	        
		 return Integer.bitCount(n);
	 }
	

}
