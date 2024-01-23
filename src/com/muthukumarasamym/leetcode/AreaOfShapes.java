package com.muthukumarasamym.leetcode;

import java.util.*;

public class AreaOfShapes {

	public static void main(String[] args) {
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the shape you want to find area\n1.Square\n2.Rectangle\n3.triangle");
		int n=mc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("enter the length of square :");
			int a=mc.nextInt();
			System.out.println("the area is "+calculateArea(a));
			break;
		case 2:
			System.out.println("enter the length and breadth");
			int l=mc.nextInt();
			int d=mc.nextInt();
			System.out.println("the area is "+calculateArea(l,d));
			break;
		case 3:
			System.out.println("enter the base and height ");
			int b=mc.nextInt();
			int h=mc.nextInt();
			System.out.println("the area is "+calculateArea(0.5,b,h));
			break;
			
		default:
			System.out.println("Enter the valid number");
		}
			
	}

	static double calculateArea(double d, int b, int h) {
		return d*b*h;		
	}

	static double calculateArea(int l, int b) {
		return l*b;
		
	}

	static double calculateArea(int a) {
		return a*a;
		
	}

}
