package allpatterns;
import java.util.*;
public class pattern8 {

	public static void main(String[] args) {
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=mc.nextInt();
		
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==n-1||j==Math.abs(n-1-i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
	}
	}
}

/*
enter the number
5
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