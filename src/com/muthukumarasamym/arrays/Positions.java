package com.muthukumarasamym.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Positions {
	static int[] assign(int arr[],int n)
	{
		Arrays.sort(arr);
		int ans[]=new int [n];
		int start=0,end=n-1;
		
		for(int i=end;i<n;i++){					//arranging positions
		    if(i%2!=0)
			    ans[i]=arr[end--];
			else
			    ans[i]=arr[start++];
		}
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the element");
		int num= mc.nextInt();
		int array[]=new int [num];
		for(int i=0;i<num;i++)
		{
			array[i]=mc.nextInt();
		}
		System.out.println(Arrays.toString(assign(array,num)));
		
		mc.close();
		

	}

}
