package allpatterns;

import java.util.Scanner;

public class pattern3 {

public static void main(String[] args) {
		
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=mc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2*n-1;j++)
			{
			
				if(i==0||j==i||j==2*n-i-2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
}
}
/*      
*********
 *     * 
  *   *  
   * *   
    *    
 * 
 * 
 * 
 * 
 * 
*/
