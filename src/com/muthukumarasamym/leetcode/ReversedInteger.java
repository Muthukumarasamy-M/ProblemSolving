package com.muthukumarasamym.leetcode;

public class ReversedInteger {

	public static void main(String[] args) {
		int n=-2147483648;
	
		System.out.println(reverse(n));
		
	}
	public static int reverse(int x) {
        
		long sum=0;
		while(x!=0)
		{
			sum= sum*10+(x%10);
			x/=10;
		}
        if(sum>Integer.MAX_VALUE | sum<Integer.MIN_VALUE)
        	return 0;    
        return (int) sum;
        
    }
	

}
