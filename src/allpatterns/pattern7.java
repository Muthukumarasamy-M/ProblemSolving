package allpatterns;

import java.util.Scanner;

public class pattern7 {
	public static void main(String[] args) {
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=mc.nextInt();
		
		for(int i=0;i<2*n-1;i++)
		{
			int c=i>=n?2*n-2-i:i;
			for(int j=0;j<n;j++)
			{
				if(j==0||j==c)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}	
}
}
/*
 n=5

*    
**   
* *  
*  * 
*   *
*  * 
* *  
**   
*    





*/