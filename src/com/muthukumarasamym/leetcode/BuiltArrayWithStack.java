package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BuiltArrayWithStack {

	public static void main(String[] args) {
		

		int target[]= {1,2,3};
		int n=3;
		BuiltArrayWithStack b= new BuiltArrayWithStack();
		
		System.out.println(buildArray(target,n).toString());
		
	}
	public static  List<String> buildArray(int[] target, int n) {
	
		List<String> list= new ArrayList<>();
		int index=0;
		for(int i=1;index<target.length;i++)
		{
			System.out.println(i+" "+index);
			if(i==target[index]) {
				list.add("Push");
				index++;
			}
			else {
				list.add("Push");
				list.add("Pop");
			}
		}
	
	return list;
        
    }
}
