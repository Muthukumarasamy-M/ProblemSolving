package com.muthukumarasamym.hackerank;

import java.util.Scanner;

public class DecimalToBinary {
	public static void binaryconversion(int decimal)
	{
	
		int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	
	System.out.print("<- ordinary method"+"\n");
		
	}

	public static void main(String[] args) {
		
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the number");
		int number= mc.nextInt();
		binaryconversion(number);
		System.out.println(Integer.toBinaryString(number)+"<- Inbuilt method ");
	}

}
