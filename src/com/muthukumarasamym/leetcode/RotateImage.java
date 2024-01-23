package com.muthukumarasamym.leetcode;

public class RotateImage {



	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		RotateImage r= new RotateImage();
		r.rotate(arr);
	
	}

	private void rotate(int[][] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp= arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
			reverse(arr[i]);
		}
		
		display(arr);
		
	}

	private void reverse(int[] arr) {
		int start=0,end=arr.length-1;
		while(start<end)
		{
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
	}

	private void display(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
	}

}
