package com.muthukumarasamym.leetcode;

public class HouseRobber {

	public static void main(String[] args) {

		int arr[] = { 2,1,1,2 };
		HouseRobber h = new HouseRobber();
		System.out.println(h.rob1(arr));

	}

	public int rob1(int[] nums) {
	if (nums.length == 0) {
        return 0;
    }

    int prevMax = 0;
    int currentMax = 0;

	for (int num : nums) {
        int newMax = Math.max(currentMax, prevMax + num);
        prevMax = currentMax;
        currentMax = newMax;
	}
	return currentMax;
	}

}
