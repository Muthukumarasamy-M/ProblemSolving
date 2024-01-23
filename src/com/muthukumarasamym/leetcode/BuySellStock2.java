package com.muthukumarasamym.leetcode;

public class BuySellStock2 {

	public static void main(String[] args) {
		BuySellStock2 b = new BuySellStock2();
		int arr[] = {7,1,5,3,6,4 };
		System.out.println(b.maxProfit(arr));
	}

	private int maxProfit(int[] prices) {
		
		if(prices.length<=1)
			return 0;
		int min=prices[0];
		int max=0,profit=0;
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i]<min)
			{
				min=prices[i];
				max=0;
			}
			if(max<prices[i])
			{	
				max=prices[i];
				profit+=(max-min);
				
				
			}
			System.out.println(i+" "+profit);
		}
		
		return profit;
	}

}
