package allpatterns;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		Scanner mc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=mc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
/*

*****
*****
*****
*****
*****

*/