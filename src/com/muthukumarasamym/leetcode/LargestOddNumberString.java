package com.muthukumarasamym.leetcode;

public class LargestOddNumberString {

	public static void main(String[] args) {
		String s = "3456235423151247";
		LargestOddNumberString l= new LargestOddNumberString();
		System.out.println((l.largestOddNumber(s)));
		
	}

	public String largestOddNumber(String num) {

		
		for(int i=num.length()-1;i>=0;i--)
		{
			int n=num.charAt(i)-'0';
			if(n%2==1)
				return num.substring(0,i+1);
		}
		return "";
	}

}
