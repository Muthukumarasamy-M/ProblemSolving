package allpatterns;

import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
		
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=mc.nextInt();

		for(int i=0;i<n;i++)
		{
			for(int k=0;k<i;k++)
				System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==0||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}
/*
 * 
 * 
*****
 *   *
  *   *
   *   *
    *****
 * 
 * 
 * 
 * 
 * 
 * 
 */
*/