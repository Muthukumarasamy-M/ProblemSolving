package com.muthukumarasamym.leetcode;

import java.util.*;

public class Pangram {

	public static void main(String[] args) {
		
		Scanner mc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = mc.nextLine();
		System.out.println(checkIfPangram(s));
		System.out.println(checkIfPangram2(s));

	}
	public static boolean checkIfPangram(String sentence) {
	    sentence=sentence.toLowerCase();
	    if(sentence.length()<26) {
	            return false;
	        
	    }
	    int []arr= new int[26];
	    
	    for(int i=0;i<sentence.length();i++)
	    {
	    	
	    	arr[(sentence.charAt(i)-'a')]++;
	    }
	   return !Arrays.toString(arr).matches(".*\\b0\\b.*");

}
	public static boolean checkIfPangram2(String sentence) {
		 for(char i = 'a';i<='z';i++)
	        {
	            if(sentence.indexOf(i)<0)
	            return false;
	        }
	        return true;
		
		
	}
	
}
