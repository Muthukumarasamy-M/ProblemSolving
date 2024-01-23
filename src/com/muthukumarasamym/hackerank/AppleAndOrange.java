package com.muthukumarasamym.hackerank;

import java.util.*;

public class AppleAndOrange {

	public static void countAndOranges(int s,int t,int a,int b,List<Integer>apples ,List<Integer>oranges)
	{
		int count1=0;
		int count2=0;
		for(int i=0;i<apples.size();i++) {
			int x=apples.get(i)+a;
			if(x>=s && x<=t)
				count1++;
		}
		for(int i=0;i<oranges.size();i++)
		{
			int x=oranges.get(i)+b;
			if(x<=t &&x>=s)	
				count2++;
			
		}
		System.out.print(count1+" "+count2);
		
	}
	public static void main(String[] args) {
		
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the s and t");
		int s = mc.nextInt();
		int t = mc.nextInt();
		System.out.println("enter the a and b");
		int a = mc.nextInt();
		int b = mc.nextInt();
		System.out.println("enter the number of list 1 and number of list 2");
		int n1= mc.nextInt();
		int n2= mc.nextInt();
		List<Integer> arr1 = new ArrayList<>();
		System.out.println("Enter the elements");
		for (int i = 0; i < n1; i++) {
			int x = mc.nextInt();
			arr1.add(x);
		}
		List<Integer> arr2 = new ArrayList<>();
		System.out.println("Enter the elements");
		for (int i = 0; i < n1; i++) {
			int x = mc.nextInt();
			arr2.add(x);
		}
		countAndOranges(s,t,a,b,arr1,arr2);
		

	}

}
