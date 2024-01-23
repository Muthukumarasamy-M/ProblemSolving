package com.muthukumarasamym.leetcode;

public class Tribonacci {

	public static void main(String[] args) {
		int n=4;
		Tribonacci t= new Tribonacci();
		System.out.println((t.tribonacci(n)));
		
	}
	public int  tribonacci(int n)
	{
		
		int x=0;
		int y=1;
		int z=0;
		int sum=0;
		for(int i=2;i<n;i++)
		{
			z=x+y;
			x=y;
			y=z;
			sum+=z;
			
			
		}
		return sum;
		
	}

}
