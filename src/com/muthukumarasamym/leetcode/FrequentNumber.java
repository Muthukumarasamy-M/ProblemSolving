package com.muthukumarasamym.leetcode;

public class FrequentNumber {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,12,12,12};
		FrequentNumber f = new FrequentNumber();
		System.out.println(f.findSpecialInteger(arr));

	}

	public int findSpecialInteger(int[] arr) {

		int ncount = arr.length / 4;
		int index = 0, count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i])
				count++;
			else
				count = 1;
			if (count >= ncount) {
				ncount = count;
				index = i;
			}
		}
		return arr[index];

	}

}
