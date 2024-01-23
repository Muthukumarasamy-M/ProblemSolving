package com.muthukumarasamym.leetcode;

public class MaximumSubArray {

	public static void main(String[] args) {
		int arr[]= {-2,1,-3,4,-1,2,1,-15,4};
		MaximumSubArray m= new MaximumSubArray();
		System.out.println((m.maxSubArray(arr)));

	}
	public int maxSubArray(int[] nums) {
		
		int max = Integer.MIN_VALUE;
		int cur = 0;
		for (int i = 0; i < nums.length; i++) {
			cur += nums[i];
			if (max < cur) {
				max = cur;
			}
			if (cur < 0)
				cur = 0;
		}

		return max;
        
    }

}
