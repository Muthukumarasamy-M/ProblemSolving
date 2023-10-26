package allpatterns;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=mc.nextInt();
		
		for(int i=1;i<2*n;i++)
		{
			for(int j=1;j<2*n;j++)
			{
				if((i==1&&j%2==1)||(i+1==2*n && j%2==1)||i==j||i+j==2*n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}}
}

/*

* * * * *
 *     * 
  *   *  
   * *   
    *    
   * *   
  *   *  
 *     * 
* * * * *




*/