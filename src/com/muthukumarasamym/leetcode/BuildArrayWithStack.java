package com.muthukumarasamym.leetcode;

import java.util.*;

public class BuildArrayWithStack {

	public static void main(String[] args) {
		int arr[] = { 1, 2 };
		int n = 3;
		buildArray(arr,n);
	}

	public static List<String> buildArray(int[] target, int n) {
		
		List<String> list= new ArrayList<>();
		int index=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" "+target[index]);
			if(target[index]==i) {
				list.add("push");
				index++;;
			}
			else
			{
				list.add("push");
				list.add("pop");
			}	
		}
		System.out.println(list.toString());
		
		
		return null;
		
	}

}
