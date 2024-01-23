package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceGreatestRight {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = mc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			a[i] = mc.nextInt();
		}
		System.out.println(Arrays.toString(replaceElements(a)));

		System.out.println(Arrays.toString(replaceElements1(a)));

	}

	private static int[] replaceElements1(int[] arr) {

		int max=-1,temp=-1;
	     for(int i=arr.length-1;i>=0;i--)
	     {
	         temp=arr[i];
	         arr[i]=max;
	         max=Math.max(temp,max);
	     }
	     return arr;

	}

	private static int[] replaceElements(int[] arr) {

		int a[] = new int[arr.length];

		for (int i = 0; i < arr.length - 1; i++) {
			int max = arr[i + 1];
			for (int j = i + 2; j < arr.length; j++) {
				if (max < arr[j]) {
					max = arr[j];
				}
			}
			System.out.println(max+"");
			a[i] = max;
		}
		a[arr.length - 1] = -1;
		return a;
	}

}
