package com.muthukumarasamym.leetcode;

public class Base7 {

	public static void main(String[] args) {

		int n = -8;
		System.out.println(convertToBase7(n));
		System.out.println(convertToBase71(n));
	}

	public static String convertToBase7(int num) {

		String s = "";
		boolean neg = false;
		if (num == 0)
			return "0";
		if (num < 0) {
			num = -num;
			neg = true;
		}
		while (num != 0) {
			s = num % 7 + s;
			num /= 7;
		}
		if (neg)
			s = "-" + s;
		return s;
	}
	public static String convertToBase71(int num) {
		boolean neg= false;
		if(num<0)
		{ neg=true;
			num=-num;
		}
		StringBuilder str= new StringBuilder();
		while(num!=0)
		{
			str.insert(0,num%7);
			num/=7;
		}
		if(neg)
			str.insert(0,"-");
		return str.toString();
	}

}
