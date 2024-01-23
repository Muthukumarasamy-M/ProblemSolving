package com.muthukumarasamym.arrays;

import java.util.ArrayList;
import java.util.*;

public class GrandChildren {

	static int[] noOfGrandkid(String array[][], String st, int n) {
//		
		int count = 0;
		ArrayList<String> al = new ArrayList<>();
		for (int i = 0; i < n; i++)                                    // getting child(works for more than one child)
		{
			if (st.equals(array[i][1])) {
				al.add(array[i][0]);
			}
		}
		String[] ans = Arrays.copyOf(al.toArray(), al.size(), String[].class);

		for (int i = 0; i < ans.length; i++) {                          // checking no of grandkids

			for (int j = 0; j < n; j++)
				if (ans[i].equals(array[j][1]))
					count++;
		}
		int num[] = new int[] { ans.length, count };
		return num;
	}

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.print("tell the number of father and son   : ");
		int num = mc.nextInt(); // no. of father and son
		String arr[][] = new String[num][2];

		for (int i = 0; i < num; i++) { // getting values
			System.out.print("tell the row values " + (i + 1) + ": ");
			int j = 0;
			arr[i][j++] = mc.next();
			arr[i][j++] = mc.next();

		}
		System.out.println("tel the checking value");
		String s = mc.next();
		int[] nums = noOfGrandkid(arr, s, num);
		System.out.println(s + " have " + nums[0] + " children and " + nums[1] + " grandchildren");

		mc.close();

	}

}
