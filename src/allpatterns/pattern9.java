package allpatterns;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=mc.nextInt();
		
		for(int i=0;i<2*n-1;i++)
		{
			int col=i>=n?2*n-i-2:i;
			
			int space=i<n?n-2-i:i-n;
			
			for(int k=0;k<=space;k++)	
				System.out.print(" ");
			
			for(int j=0;j<=col;j++) {
				if(j==0||j==col)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}

     }
}
/*enter the number
5
    * 
   * * 
  *   * 
 *     * 
*       * 
 *     * 
  *   * 
   * * 
    *
//2 for loops used
 * 
 * 
 * 		for(int i=0;i<2*n-1;i++)
		{
			
			for(int j=0;j<2*n-1;j++) {
				
				if(i+j==n-1||j-i==n-1||i-j==n-1||j==3*n-3-i)
					System.out.print("*");
				else
					System.out.print(" ");
		
			}
			System.out.println();
		}
 * 
 * 
 * */
 
