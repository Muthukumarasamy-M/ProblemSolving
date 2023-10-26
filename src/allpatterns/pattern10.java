package allpatterns;
import java.util.Scanner;
public class pattern10 {
	public static void main(String[] args) {
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=mc.nextInt();
		for(int i=0;i<2*n;i++)
		{
			for(int j=0;j<2*n;j++)
			{
			 if(i<n)
				if((i+j>n-1) && (j< n+i))
					System.out.print("  ");
				else
					System.out.print("* ");
			 else {
				 if((j>i-n) && (j<3*n-i-1))
					 System.out.print("  ");
				 else 
					 System.out.print("* ");
			 }		 
			}
			System.out.println();
	}
	}
}

/*

* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 

*/