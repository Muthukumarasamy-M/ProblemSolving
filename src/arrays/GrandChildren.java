package arrays;

import java.util.Scanner;

public class GrandChildren {

	static int noOfGrandkid(String array[][], String st, int n) {
//		
		String child = "";
		int count = 0;
		for (int i = 0; i < n; i++) // getting child
		{
			if (st.equals(array[i][1])) {
				child = array[i][0];
			}
		}

		for (int i = 0; i < n; i++) { // checking no of grandkids
			if (child.equals(array[i][1]))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.print("tell the number   : ");
		int num = mc.nextInt(); // no. of father and son
		String arr[][] = new String[num][2];

		for (int i = 0; i < num; i++) { // getting values
			System.out.print("tell the row values " + i + ": ");
			int j = 0;
			arr[i][j++] = mc.next();
			arr[i][j++] = mc.next();

		}
		System.out.println("tel the checking value");
		String s = mc.next();
		System.out.println(s + " has " + noOfGrandkid(arr, s, num) + "grandchildren");

		mc.close();

	}

}
